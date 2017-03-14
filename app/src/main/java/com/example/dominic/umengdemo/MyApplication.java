package com.example.dominic.umengdemo;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by Dominic on 2017/3/13.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MobclickAgent.enableEncrypt(true);
    }
}
