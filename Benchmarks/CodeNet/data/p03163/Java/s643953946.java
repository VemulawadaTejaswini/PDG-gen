import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int W=in.nextInt();
		int v[]=new int[n];
		int w[]=new int[n];
		for(int i=0;i<n;i++)
		{
			w[i]=in.nextInt();
			v[i]=in.nextInt();
		}
		long dp[][]=new long[n+1][W+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0 || j==0)
					dp[i][j]=0;
				else if(j>=w[i-1])
					dp[i][j]=Math.max(dp[i-1][j], v[i-1]+dp[i-1][j-w[i-1]]);
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[n][W]);
	}
}
