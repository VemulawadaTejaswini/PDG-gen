

import java.util.Scanner;
public class Main{
 
  public static void main(String[] args)
  {
     
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long totalWt=s.nextLong();
    long wt[]=new long[n];
   long profit[]=new long[n];
    
    for(int i=0;i<n;i++ )
    {
    	wt[i]=s.nextLong();
    	profit[i]=s.nextLong();
    }
    
    long dp[][]=new long[n][totalWt+1];
    for(int i=0;i<n;i++)
    {
    	dp[i][0]=0;
    }
    for(long i=wt[0];i<=totalWt;i++)
    {
    	dp[0][i]=profit[0];
    }
    for(int i=1;i<n;i++)
    {
    	for(long j=0;j<=totalWt;j++)
    	{
           		if(j-wt[i]>=0)
           		{
           			dp[i][j]=Math.max(profit[i]+dp[i-1][j-wt[i]], dp[i-1][j]);
           		}
           		else
           			dp[i][j]=dp[i-1][j];
    	}
    }
    
    
   
    System.out.println(dp[n-1][totalWt]);
    
    s.close();
    
  }
}
