import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();

		int dp[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			String str=scan.next();
			for(int j=0;j<m;j++)
			{
				if(str.charAt(j)=='.')
					dp[i][j]=1;
				else
					dp[i][j]=0;
			}
		}

		for(int i=1;i<m;i++)
		{
			if(dp[0][i]!=0)
				dp[0][i]=dp[0][i-1];
		}
		for(int i=1;i<n;i++)
		{
			if(dp[i][0]!=0)
				dp[i][0]=dp[i-1][0];
		}

		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				if(dp[i][j]==0)
					continue;
				dp[i][j]=(dp[i][j-1]+dp[i-1][j])%(1000000007);
			}
		}

		System.out.println(dp[n-1][m-1]);

	}
}