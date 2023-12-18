/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = in.nextInt();
		double[] dp = new double[N+1];
		dp[0] = 1;
		double ans = 0.0;
		
		for(int coins = 0; coins < N; coins++) {
		    double prob = in.nextDouble();
		    for(int j = coins+1; j >= 0; j--) {
		        dp[j] = (j == 0 ? 0 : dp[j-1]*prob) + dp[j]*(1-prob);
		    }
		}
		
		for(int heads = 0; heads <= N; heads++) {
		    int tails = N - heads;
		    if(heads > tails) {
		        ans += dp[heads];
		    }
		}
		
		System.out.println(ans);
	}
}
