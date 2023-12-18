import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double p[]=new double[n+1];
		double dp[][]=new double[n+1][n+1];
		for(int i=1;i<=n;i++)
			p[i]=in.nextDouble();
		for(int i=0;i<=n;i++)
			dp[0][i]=0;
		dp[1][0]=1-p[1];
		for(int i=2;i<=n;i++)
			dp[i][0]=dp[i-1][0]*(1-p[i]);
		dp[1][1]=p[1];
		for(int i=2;i<=n;i++)
			dp[i][i]=dp[i-1][i-1]*(p[i]);
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				dp[i][j]=dp[i-1][j]*(1-p[i])+dp[i-1][j-1]*p[i];
		}
		double ans=0;
		for(int i=n/2+1;i<=n;i++)
			ans+=dp[n][i];
		System.out.println(ans);
	}
}
