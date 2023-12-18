import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int knapsack(int[] val, int[] wt, int n, int w, int[][] dp)
    {
        for(int i = 1; i < n + 1; i++)
        {
            for(int j = 1; j < w + 1; j++)
            {
                if(wt[i - 1] <= j)
                {
                    dp[i][j] = Math.max((val[i - 1] + dp[i - 1][j - wt[i - 1]]), dp[i - 1][j]);
                }
                else
                {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		  int n = scan.nextInt();
		    int w = scan.nextInt();
		    int val[] = new int[n];
		    int wt[] = new int[n];
		    for(int i = 0; i < n; i++)
		    {
		        val[i] = scan.nextInt();
		    }
		    for(int i = 0; i < n; i++)
		    {
		        wt[i] = scan.nextInt();
		    }
		    int[][] dp = new int[n + 1][w + 1];
		    int maxProfit = knapsack(val, wt, n, w, dp);
		    System.out.println(maxProfit);
		   
	}
}