/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int[] h;
	static int[] dp;
	
	static int solve(int start, int end)
	{
		//base case
		if(end-start<=0)
			return 0;
		if(end-start==1)
		    return Math.abs(h[end]-h[start]);	
		
		if(dp[start]==-1)
		{
		    int temp = Math.min(solve(start + 1, end) + Math.abs(h[start] - h[start + 1]), solve(start+2, end) + Math.abs(h[start] - h[start + 2]));
		    dp[start] = temp;
		    return temp;
		}
		else
    		return dp[start];
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		h = new int[n];
		dp = new int[n];
		Arrays.fill(dp, -1); 
		
		for(int i=0; i<n; i++)
			h[i] = scn.nextInt();
		
		System.out.println(solve(0, n-1));
		
		
		
	}
}