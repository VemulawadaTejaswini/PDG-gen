import java.util.*;
import java.io.*;
public class Solution
{
	static final long mod=(long)1e18;
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);    
		int N=s.nextInt();		
		int K=s.nextInt();	
		int h[]=new int[N];
		for(int i=0;i<N;i++)
		{
			h[i]=s.nextInt();
		}
		int dp[]=new int[N];
		Arrays.fill(dp,-1);
		dp[0]=0;
		int i=0,d=0;
		while(i<N-1)
		{
			int j=1;
			while(j<=K)
			{
				if(i+j<N)
				{
					d=Math.abs(h[i]-h[i+j])+dp[i];
					if(dp[i+j]==-1)
						dp[i+j]=d;
					else
						if(dp[i+j]>d)
							dp[i+j]=d;
				}
				else
					break;
				j+=1;
			}
			i+=1;
		}
		System.out.println(dp[N-1]);

	}
}


