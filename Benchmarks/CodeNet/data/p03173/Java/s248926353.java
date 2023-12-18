import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			// String h[]=inp.readLine().split(" ");
			int n=Integer.parseInt(inp.readLine());
			// int k=Integer.parseInt(h[1]);
			String hh[]=inp.readLine().split(" ");
			long a[]=new long[n];
			for(int i=0;i<n;i++){a[i]=Long.parseLong(hh[i]);}
			long dp[][]=new long[n][n];
		// int c[][]=new int[n][n];
		long pre[][]=new long[n][n];
			for(int i=0;i<n;i++)
			{
				long u=0;
				for(int j=i;j<n;j++)
				{
					u+=a[j];
					pre[i][j]=u;
				}
			}
			for(int len=2;len<=n;len++)
			{
				for(int j=0;j<n-len+1;j++)
				{
					int l=j;
					int r=j+len-1;
					int pp=0;
					long min=Long.MAX_VALUE;
					for(int p=l;p<r;p++)
					{

						if(dp[l][p]+dp[p+1][r]+pre[l][p]+pre[p+1][r]<min)
						{
							pp=p;
							min=dp[l][p]+dp[p+1][r]+pre[l][p]+pre[p+1][r];
						}
					}
					// if(l==0 && r==n-1){System.out.println(pp);}
					dp[l][r]=min;
					// c[l][r]=pp;

				}
				
			}
			System.out.println(dp[0][n-1]);
			// System.out.println(get(dp,c,0,n-1));
					
		
	}
	static long get(long dp[][], int c[][], int l, int r)
	{
		if(l==r){return 0;}
		System.out.println(l+" "+r+" "+dp[l][r]);
		return dp[l][r]+get(dp,c,l,c[l][r])+get(dp,c,c[l][r]+1,r);
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