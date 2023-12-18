import java.util.*;
import java.io.*;
class Main
{
	static boolean visited[];
	static long MOD=1000000007;
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			// String h[]=inp.readLine().split(" ");

			int n=Integer.parseInt(inp.readLine());
			// int k=Integer.parseInt(h[1]);
			int arr[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				String h[]=inp.readLine().split(" ");
				for(int j=0;j<n;j++)
				{
					arr[i][j]=Integer.parseInt(h[j]);
				}
			}
			visited=new boolean[(int)Math.pow(2,n+1)-1];
			System.out.println(dp(new long[(int)Math.pow(2,n+1)-1],0,arr,0)%MOD);
					
		
	}
	static long get(long dp[][], int c[][], int l, int r)
	{
		if(l==r){return 0;}
		System.out.println(l+" "+r+" "+dp[l][r]);
		return dp[l][r]+get(dp,c,l,c[l][r])+get(dp,c,c[l][r]+1,r);
	}
	static long dp(long dp[], int i, int arr[][], int state)
	{
		if(i==arr.length){return 1;}
		if(visited[state]){return dp[state];}
		long ans=0;
		int k=1;
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]==1 && (state &k)==0) 
			{
				ans=(ans%MOD+dp(dp,i+1,arr,state+k)%MOD)%MOD;
			}
			k*=2;

		}
		visited[state]=true;
		dp[state]=ans;
		return ans;

	}
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}