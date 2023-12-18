import java.util.Scanner;
public class Main{
   
  public static void main(String[] args)
  {
     
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long totalWt=s.nextLong();
    long wt[]=new long[n];
   int profit[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++ )
    {
    	wt[i]=s.nextLong();
    	profit[i]=s.nextInt();
    	
    }
    for(int i=0;i<n;i++)
    	sum+=profit[i];
    
    long dp[][]=new long[n][sum+1];
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<sum;j++)
    		dp[i][j]=0;
    }
    dp[0][profit[0]]=wt[0];
    
    for(int i=1;i<n;i++)
    {
    	
    	for(int j=0;j<=sum;j++)
    	{
    		
           		if(j-profit[i]>=0)
           		{
           			if(dp[i-1][j]!=0&&dp[i-1][j-profit[i]]!=0)
           			dp[i][j]=Math.min(wt[i]+dp[i-1][j-profit[i]], dp[i-1][j]);
           			else if((j-profit[i]==0))
           				dp[i][j]=wt[i]+dp[i-1][j-profit[i]];
                   else if((dp[i-1][j-profit[i]]!=0))
                     dp[i][j]=wt[i]+dp[i-1][j-profit[i]];
           			else
           				dp[i][j]=dp[i-1][j];
           		
           		}
           		else
           			dp[i][j]=dp[i-1][j];
    	}
    }
    

    for(int p=sum;p>0;p--)
    {
    	if(dp[n-1][p]!=0&&dp[n-1][p]<=totalWt)
    	{
    		System.out.println(p);
    		break; 
    	}
    }
   
  
    s.close();
    
  }
}
