

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String x=scan.next();
		int dp[][]=new int[x.length()+2][2];
		dp[0][1]=1;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='0')
			{
				dp[i+1][1]+=dp[i][1];
			}else {
				dp[i+1][0]+=dp[i][1];
				
				dp[i+1][1]=(int) ((dp[i+1][1]+(dp[i][1]*2L))%1000000007);
			}
			dp[i+1][0]=(int) ((dp[i+1][0]+(dp[i][0]*3L))%1000000007);
		}
		int n=x.length();
		System.out.println((dp[n][0]+dp[n][1])%1000000007);
	}
}
