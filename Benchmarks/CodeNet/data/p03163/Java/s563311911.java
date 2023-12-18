/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w= sc.nextInt();
		long dp[] = new long[w+1];
		for(int i = 0; i < n; i++)
		{   
		    int cw = sc.nextInt();
		    long cv = sc.nextLong();
		    
		    for(int we = w-cw; we >= 0; we--)
		    {
		        dp[we+cw] = Math.max(dp[we+cw],dp[we]+cv);
		    }
		}
		long ans = 0;
		for(int i = 0; i <= w; i++)
		{
		    ans = Math.max(ans,dp[i]);
		}
		System.out.println(ans);
	}
}
