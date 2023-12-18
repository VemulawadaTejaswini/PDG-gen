/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakas
 */
import java.util.*;
public class Main {
    static int n,k;
    static int[] arr;
    static boolean[][] v;
    static int[][] dp;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        arr = new int[k+1];
        v = new boolean[n+1][2];
        dp = new int[n+1][2];
        for(int i=0;i<k;i++)
            arr[i] = sc.nextInt();
        if(s(n,0)==0)
            System.out.println("First");
        else
            System.out.println("Second");
    }
    public static int s(int n,int player)
    {
        //System.out.println(n+" "+player);
        if(n<0)
            return player;
        if(v[n][player])
            return dp[n][player];
        v[n][player] = true;
        //System.out.println(n+" "+player+" come here");
        for(int i=0;i<k;i++)
        {
            int temp = s(n-arr[i],1-player);
            if(s(n-arr[i],1-player) == player)
            {
                //System.out.println("dp["+n+"]["+player+"] = "+(player));
                return dp[n][player]=player;
            }
        }
       // System.out.println("dp["+n+"]["+player+"] = "+(1-player));
        return dp[n][player] = 1-player;
    }
}
