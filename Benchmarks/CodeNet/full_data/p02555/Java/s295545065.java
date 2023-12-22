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

            ans = (ans + Comb(s-2*i-1,i-1,MOD))%MOD;
        }
        System.out.println(ans);

    }

    long exp_mod(long a, long b, long p) {
        long res = 1;
        while(b != 0) {
            if((b&1) > 0) res = (res * a) % p;
            a = (a*a) % p;
            b >>= 1;
        }
        return res;
    }

    long Comb(long a, long b, long p) {
        if(a < b)   return 0;
        if(a == b)  return 1;
        if(b > a - b)   b = a - b;

        long ans = 1, ca = 1, cb = 1;
        for(long i = 0; i < b; ++i) {
            ca = (ca * (a - i))%p;
            cb = (cb * (b - i))%p;
        }
        ans = (ca*exp_mod(cb, p - 2, p)) % p;
        return ans;
    }

    private void cal() {
        long[] sum = new long[2001];
        for (int i = 1; i <=2000 ; i++) {
            dp[i][1] = 1;
            sum[i] = i;
        }
        sum[0] =1;
        for (int k = 2; k <= 2000 ; k++) {
            for (int s = k; s <= 2000; s++) {
                dp[s][k] = sum[s-k];
            }
            sum[0] = 1;
            for (int s = k+1; s <= 2000; s++) {
                sum[s-k] = (sum[s-k] + sum[s-k-1])%MOD;
            }
        }
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
