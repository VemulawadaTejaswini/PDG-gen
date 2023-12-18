// CCC 2004
// Problem S2 TopYodeller
//
// given multiple series of integers, maintain cummulative totals,
// rankings and worse ranking.
//
// simple 1D integer arrays handle this

import java.awt.*;

import java.util.*;
public class DP_Practice
{


    public static void main (String[] args)
    {

       Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int k = c.nextInt();
        int [] cost = new int[n];
        int[] dp = new int[n];
        for(int i = 0; i<n; i++){
            dp[i] = Integer.MAX_VALUE;
            cost[i] = c.nextInt();
        }
        dp[0] = 0;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=k; j++) {
                if (i >= j) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(cost[i] - cost[i - j]));
                }

            }
        }


        System.out.println(dp[n-1]);
    }

}
