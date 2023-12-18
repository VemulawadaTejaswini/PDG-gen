

import java.util.Scanner;

public class Main {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int h[]=new int[n];
	for(int i=0;i<n;i++)
	{
		h[i]=scan.nextInt();
	}
	int dp[]=new int[n];
	dp[0]=0;
	dp[1]=Math.abs(h[1]-h[0]+dp[0]);
	dp[2]=Math.min(Math.abs(h[2]-h[1]+dp[1]),Math.abs(h[2]-h[0]+dp[0]));
	for(int i=2;i<n;i++)
	{
		dp[i]=Math.min(Math.abs(h[i]-h[i-1])+dp[i-1],Math.abs(h[i]-h[i-2])+dp[i-2]);
//		System.out.println(dp[i]);
	}
	System.out.println(dp[n-1]);
	
}
}
