//package src.com.jetman.atcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;

    private void slove() {

        int n = sc.nextInt();
        long[] a = new long[n];
        long[] sum = new long[n+1];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextLong();
            sum[i+1] = sum[i] + a[i];
        }

        long ans = 0;
        for (int i = 0; i < n-1; i++) {
            ans = (ans + a[i]*(sum[n]-sum[i+1]))%MOD;
//            for (int j = i+1; j < n; j++) {
//                ans = (ans + a[i]*a[j])%MOD;
//            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
