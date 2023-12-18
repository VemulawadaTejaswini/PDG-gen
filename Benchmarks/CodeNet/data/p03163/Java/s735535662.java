import java.util.Scanner;
class Solution
{
  public static long knapsack(long[] wt, long[] val, long n, long w, long[][] dp)
  {
    for(int i = 1; i <= n; i++)
    {
      for(int j = 1; j <= w; j++)
      {
        if(wt[i - 1] <= j)
        {
          dp[i][j] = Math.max((val[i - 1] + dp[i - 1][j - wt[i - 1]]), dp[i - 1][j]);
        }
        else
                                                      {
                                                        dp[i][j] = dp[i - 1][j];
                                                      }
                                                        
                                                      
      }
    }
                                                      return dp[n][w];
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int w = scan.nextInt();
    long wt[] = new long[n];
    long val[] = new long[n];
    for(int i = 0; i < n; i++)
    {
      wt[i] = scan.nextlong();
      val[i] = scan.nextlong();
    }
    long[][] dp = new long[n + 1][w + 1];
    long maxProfit = knapsack(wt, val, n, w, dp);
    System.out.prlongln(maxProfit);
  }
}
