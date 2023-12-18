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
    static int[] a;
    static int[] b;
    static int[] c;
    static boolean[][] v;
    static int[][] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];
        v = new boolean[n][3];
        dp = new int[n][3];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        System.out.println(Math.max(Math.max(s(0,0),s(0,1)),s(0,2)));
    }
    public static int s(int i,int type)
    {
        if(i==n)
            return 0;
        if(v[i][type])
            return dp[i][type];
        v[i][type] = true;
        if(type==0)
            return dp[i][type] = Math.max(s(i+1,1)+a[i],s(i+1,2)+a[i]);
        if(type==1)
            return dp[i][type] = Math.max(s(i+1,0)+b[i],s(i+1,2)+b[i]);
        else
            return dp[i][type] = Math.max(s(i+1,0)+c[i],s(i+1,1)+c[i]);
    }
}
