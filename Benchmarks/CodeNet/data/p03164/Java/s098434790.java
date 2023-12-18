import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int weight = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        	sum = sum + v[i];
        }

        long[][] dp = new long[n+1][sum+1];


     
        Arrays.fill(dp[0],Long.MAX_VALUE);
        dp[0][0] = 0;
        for(int i=1;i<dp.length;i++)
        {
        	Arrays.fill(dp[i],Long.MAX_VALUE);
        	dp[i][0] = 0;
        	for(int j=1;j<dp[i].length;j++)
        	{
        		
        		if(j-v[i-1]>=0)
        		{
        			dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-v[i-1]]+w[i-1]);
        		}
        		
        		dp[i][j] = Math.min(dp[i][j],dp[i-1][j]);
        	}
        }
        
        long ans  = 0;

        for(int i=dp[n].length-1;i>=0;i--)
        {
        	if(dp[n][i]<=weight)
        	{
        		ans = i;
        		break;
        	}	
        }

        System.out.println(ans);
       
 	}
}