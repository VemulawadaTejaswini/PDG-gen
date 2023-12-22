//package src.com.jetman.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;

    long dp[][];

    private void slove() {

        int s = sc.nextInt();

        dp = new long[s+1][s+1];

        long ans = 0;
        int tmp = s/3;
        for (int i = 1; i <= tmp; i++) {

            ans = (ans + work(s-2*i,i))%MOD;
        }
        System.out.println(ans);

    }

    private long work(int s,int k) {
        if (dp[s][k] != 0) {
            return dp[s][k];
        }
        if (s == k) {
            return dp[s][k] = 1;
        }
        if (k == 1) {
            return dp[s][k] = 1;
        }
        long ans = 0;
        for (int i = k-1; i <= s-1; i++) {
            ans = (ans + work(i,k-1))%MOD;
        }
        return dp[s][k] = ans;
    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
