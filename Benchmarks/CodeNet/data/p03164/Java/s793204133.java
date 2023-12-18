import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			String h[]=inp.readLine().split(" ");
			int n=Integer.parseInt(h[0]);
			long wa=Long.parseLong(h[1]);
			int v[]=new int[n+1];
			int w[]=new int[n+1];
			// HashSet<Long>hash=new HashSet<>();
			// hash.put((long)0,(long)0);
			// hash.add((long)0);
			int total=0;
			for(int i=0;i<n;i++)
			{
					
				String hh[]=inp.readLine().split(" ");
				int w1=Integer.parseInt(hh[0]);
				int v1=Integer.parseInt(hh[1]);
				v[i]=v1;
				w[i]=w1;
				total+=v1;


					
				
			}
			boolean dp[][]=new boolean[n+1][total+1];
			long aa[][]=new long[n+1][total+1];
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=total;j++)
				{
					aa[i][j]=Integer.MAX_VALUE;
				}
			}
			aa[0][0]=(long)0;
			dp[0][0]=true;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<=total;j++)
				{
					
						dp[i+1][j]=dp[i][j];
						
					
					if(j>=v[i] && dp[i][j-v[i]] && aa[i][j-v[i]]+w[i]<=wa)
					{
						dp[i+1][j]=true;
						// System.out.println(j);
						aa[i+1][j]=aa[i][j-v[i]]+w[i];
					}
					aa[i+1][j]=Math.min(aa[i][j],aa[i+1][j]);

				}
			}
			for(int j=total;j>=0;j--)
			{
				if(dp[n][j]){System.out.println(j);break;}
			}
			
					
		
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