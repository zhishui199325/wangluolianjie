package com.anke.vehicle.wangluolianjie;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;

public class NetBrocest extends BroadcastReceiver {
   public static Handler handler;
    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager con=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean wifi=con.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
        boolean internet=con.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnectedOrConnecting();
        if(wifi|| internet){
            handler.sendEmptyMessage(1);
        }else{
            handler.sendEmptyMessage(2);
        }
    }

}
