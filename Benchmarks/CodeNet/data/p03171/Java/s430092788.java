import java.util.*;

public class Main
{
  static int n;
  static long[] a;
  static Long[][][] memo
  public static void main(String[]  args)
  {
	Scanner in = new Scanner(System.in);
 	n = in.nextInt();
    a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = in.nextLong();
    memo = new Long[2][n][n];
    System.out.println(dp(0, 0, n-1));
    in.close();
  }
  
  public static long dp(int who, int l, int r)
  {
    if (l == r)
      return a[l];
    if (memo[who][l][r] != null)
      return memo[who][l][r];
    long ans = (long)1e18;
    ans = Math.min(ans, a[l]-dp(1-who, l+1, r));
    ans = Math.min(ans, a[r]-dp(1-who, l, r-1));
    return memo[who][l][r] = ans;
  }
}
