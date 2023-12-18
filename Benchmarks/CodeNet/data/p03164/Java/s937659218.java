import java.util.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(t.nextToken());
		int W = Integer.parseInt(t.nextToken());
		int[] w = new int[n+1], v = new int[n+1];
		int s = 0;
		for(int i = 1 ; i <= n ; i++)
		{
		      t = new StringTokenizer(br.readLine());
		      w[i] = Integer.parseInt(t.nextToken());
		      v[i] = Integer.parseInt(t.nextToken());
		      s += v[i];
		}
		long[][] dp = new long[n+1][s+1];
		Arrays.fill(dp[0], (long)1e12);
		dp[0][0] = 0;
		for(int i = 1 ; i < s+1 ; i++)
		{
		      long min = Integer.MAX_VALUE;
		      int pos = 0;
		      
		      for(int j = 1 ; j < n+1 ; j++)
		      {
		            dp[j][v[j]] = 1;
		            if(i-v[j] < 0) continue;
		            //dp[i] = Math.min(dp[i] , dp[i-v[j]] + w[j]);
		            if(dp[0][i-v[j]] + w[j] < min && dp[j][i-v[j]]==0L)
		            {
		                  pos = j;
		                  min = dp[0][i-v[j]]+w[j];
		            }
		      }
		      dp[0][i] = min;
		      for(int j = 1  ; j < n+1 ; j++)
		      {
		            dp[j][i] = dp[j][i-v[pos]];
		      }
		      if(min!=Integer.MAX_VALUE)dp[pos][i] = 1;
		}
		for(int i = s ; i >= 0 ; i--)
		{
		      if(dp[0][i] <= W)
		      {
		            System.out.println(i);
		            break;
		      }
		}
	}
}