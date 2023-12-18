import java.util.Scanner;

public class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int w_max = sc.nextInt();
		int[] w = new int[n+1];
		long[] v = new long[n+1];
		long[][] dp = new long[n+1][w_max+1];
		for(int i=1;i<=n;i++)
		{
			w[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}
		for(int i=0;i<=n;i++)
		{
			dp[i][0]=0;
		}
		for(int i=0;i<=w_max;i++)
		{
			dp[0][i]=0;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w_max;j++)
			{
				if(w[i]<=j)
				{
					dp[i][j]=Math.max(v[i]+dp[i-1][j-w[i]], dp[i-1][j]); 
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}

		System.out.println(dp[n][w_max]);





	}
}