/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package dp;

/**
 *
 * @author aakas
 */
import java.util.*;
public class Main {
    static int n;
    static int m;
    static int[] w;
    static long[] va;
    static boolean[][] v;
    static long[][] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        w = new int[n];
        va = new long[n];
        v = new boolean[n][m+1];
        dp = new long[n][m+1];
        for(int i=0;i<n;i++)
        {
            w[i] = sc.nextInt();
            va[i] = sc.nextLong();
        }
        System.out.println(s(0,m));
    }
    public static long s(int i,int m)
    {
        if(i>n-1)
            return 0;
        if(m<w[i])
            return 0;
        if(v[i][m])
            return dp[i][m];
        v[i][m] = true;
        return dp[i][m] = Math.max(va[i]+s(i+1,m-w[i]),s(i+1,m));
    }
}
