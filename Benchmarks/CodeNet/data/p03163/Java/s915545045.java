import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static int maxW;

	static int KS(int score[], int weight[], int i, int W)
	{
		if(i==0)
			return 0;

		int temp = KS(score, weight, i-1, W);

		if((W+weight[i-1])<=maxW)
		{
			temp = Math.max(temp, score[i-1]+KS(score, weight, i-1, W+weight[i-1]));
		}
		return temp;
	}


	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int w=scan.nextInt();

		int score[]=new int[n];
		int weight[]=new int[n];
		for(int i=0;i<n;i++)
		{
			weight[i]=scan.nextInt();
			score[i]=scan.nextInt();
		}
		maxW=w;
		//int ans = KS(score, weight, n, 0);
		long dp[][]=new long[n+1][maxW+1];

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=maxW;j++)
			{
				dp[i][j]=dp[i-1][j];
				if((j-weight[i-1])>=0)
				{
					dp[i][j] = Math.max(dp[i][j], score[i-1]+dp[i-1][j-weight[i-1]]);
				}
			}
		}
		
		System.out.println(dp[n][maxW]);

	}
}