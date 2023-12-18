import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n =scn.nextInt();
	double[]p = new double[n+1];
	for(int i=1;i<=n;i++)
	{
		p[i]=scn.nextDouble();
	}
	double[][]dp = new double[n+1][n+1];
	dp[0][0]=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(j!=0)
			dp[i][j]=((1-p[i])*(dp[i-1][j]))+(p[i]*dp[i-1][j-1]);
			else {
				dp[i][j]=((1-p[i])*(dp[i-1][j]));
			}
			
		}
	}
	double ans=0;
	for(int j=(n+1)/2;j<=n;j++)
	{
		ans+=dp[n][j];
	}
	System.out.println(ans);
}
}
