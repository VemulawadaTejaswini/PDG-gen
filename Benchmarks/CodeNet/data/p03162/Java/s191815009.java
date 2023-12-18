import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[][]=new int[n][3];
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<3;j++)
	a[i][j]=s.nextInt();
	}
	int dp[][]=new int[n][3];
	dp[0][0]=a[0][0];dp[0][1]=a[0][1];dp[0][2]=a[0][2];
	for(int i=1;i<n;i++)
	{
	for(int j=0;j<3;j++)
	{
	dp[i][j]=a[i][j]+Math.max(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3]);
	
	}
	
	}
	System.out.println(Math.max(dp[n-1][2],Math.max(dp[n-1][0],dp[n-1][1])));
	}
}