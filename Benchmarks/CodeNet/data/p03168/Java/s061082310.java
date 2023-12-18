import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		double[] arr=new double[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextDouble();
		}
		
		double[][] dp=new double[n][n];
		
		dp[0][0]=arr[0];
		
		for(int i=1;i<n;i++)
		{
			dp[0][i]=(dp[0][i-1]*(1-arr[i]))+((1-dp[0][i-1])*arr[i]);
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				dp[i][j]=(dp[i][j-1]*(1-arr[j]))+(dp[i-1][j-1]*arr[j]);
			}
		}
		
		double ans=0;
		
		for(int i=n/2;i<n-1;i++)
		{
			ans=ans+dp[i][n-1];
		}
		
		System.out.println(ans);
		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	}
	
}