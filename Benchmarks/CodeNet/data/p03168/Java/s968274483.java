import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int i;	
		int n=sc.nextInt();
		double p[]=new double[n];
		for(i=0;i<n;i++)
			p[i]=sc.nextDouble();
		double dp[][]=new double[n][n+1];
		dp[0][0]=1;
		for(i=0;i<n;i++)
		{
			dp[i][0]=(1-p[i]);
			for(int j=1;j<=i+1;j++)
			{
				if(i>0)
					dp[i][j]=dp[i-1][j-1]*p[i] + dp[i-1][j]*(1-p[i]);
				else
					dp[i][j]=p[i];
			}
		}
		double ans=0;
		for(i=(n+1)/2;i<=n;i++)
			ans+=dp[n-1][i];
		System.out.println(ans);
	}
}