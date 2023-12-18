package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        long[] constant = new long[n];

        final int mod = 1000000007;

        for (int i = k - 1; i < constant.length ; i++) {
            constant[i] = nCk(i, k -  1, mod);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long min = constant[n - i - 1];
            long max = constant[i];
            long gap = max - min;
            ans += list[i] * gap % mod;
            ans %= mod;
        }

        System.out.println(ans);
    }

    //return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
    private static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    //return a^b mod M O(logB)
    private static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}