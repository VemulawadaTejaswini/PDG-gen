
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakas
 */
public class Main {
    static int N;
    static int W;
    static int[] w;
    static int[] p;
    static boolean[][] v;
    static long[][] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        w = new int[N];
        p = new int[N];
        v = new boolean[N][100001];
        dp = new long[N][100001];
        int totalProfit = 0;
        boolean flag = false;
        for(int i=0;i<N;i++)
        {
            w[i] = sc.nextInt();
            p[i] = sc.nextInt();
            totalProfit += p[i];
        }
        for(int i=totalProfit;i>0;i--)
        {
            if(s(0,i)<=W)
            {
                flag = true;
                System.out.println(i);
                break;
            }
        }
        if(!flag)
            System.out.println(0);
    }
    public static long s(int i,int V)
    {
        if(V<=0)
            return 0;
        if(i==N)
            return Integer.MAX_VALUE;
        if(v[i][V])
            return dp[i][V];
        v[i][V] = true;
        return dp[i][V] = Math.min(s(i+1,V),(s(i+1,V-p[i])+w[i]));
    }
}
