import java.util.*;

public class Main
{
  static int n, w;
  static int[] W, V;
  static Long[][] memo;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    w = in.nextInt();
    W = new int[n];
    V = new int[n];
    for (int i = 0; i < n; i++)
    {
      W[i] = in.nextInt();
      V[i] = in.nextInt();
    }
    
    memo = new Long[n][w+1];
    System.out.println(dp(0, 0));    
    in.close();
  }
  
  public static long dp(int at, int free)
  {
    if (free > w)
      return -(long)1e14;
    if (at == n)
      return 0;
    if (memo[at][free] != null)
      return memo[at][free];
    
    long ans = 0;
    ans = Math.max(ans, V[at]+dp(at+1, free+W[at]));
    ans = Math.max(ans, dp(at+1, free));
    return memo[at][free] = ans;
 }
}