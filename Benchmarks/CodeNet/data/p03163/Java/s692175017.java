
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {

	public static long func(int wt[] , int val[] , int k , int n)
	{
		long dp[][] = new long[n+1][k+1];
		for(int i = 0; i <= n; i++)
		{
			dp[i][0] = 0;
		}
		for(int i = 1; i <= k; i++)
		{
			dp[0][i] = 0;
		}
		for(int i = 1; i<= n; i++)
		{
			for(int j = 1; j <= k; j++)
			{
				if(wt[i - 1] > j)
				{
					dp[i][j] = dp[i-1][j];
				}
				else
				{
					dp[i][j] = (long)val[i - 1] + (long)dp[i - 1][j - wt[i - 1]];
				}
			}
		}
		return dp[n][k];
	}

	public static void main(String[] args) throws Exception
	{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int wt[] = new int[n];
    	int val[] = new int[n];
    	for(int i = 0 ; i < n ; i++)
    	{
    		wt[i] = sc.nextInt();
    		val[i] = sc.nextInt();
    	}

    	System.out.println(func(wt , val , k , n));
    }

}


