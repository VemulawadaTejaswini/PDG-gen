import java.util.*;

public class Main
{
  static int n, w;
  static long[] W;
  static int[] V;
  static Long[][] memo;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    w = in.nextInt();
    W = new long[n];
    V = new int[n];
    for (int i = 0; i < n; i++)
    {
      W[i] = in.nextLong();
      V[i] = in.nextInt();
    }
    
    memo = new Long[1001][n];
    for (int i = 0; i <= 1000; i++)
      dp(0, i);
    int best = 1000;
    for (; best >= 0; best--)
      if (memo[best][n-1] <= w)
        break;
    System.out.println(best);
    in.close();
  }
  
  public static long dp(int at, int val)
  {
    if (at == n && val != 0)
      return (long)1e18;
    if (at == n)
        return 0;
    if (memo[val][at] != null)
        return memo[val][at];
    
    long ans = (long)1e18;
    ans = Math.min(ans, W[at]+dp(at+1, val+V[at]));
    ans = Math.min(ans, dp(at+1, val));
    return memo[val][at] = ans;
  }
}
