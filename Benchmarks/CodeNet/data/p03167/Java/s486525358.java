import java.util.*;

public class Main
{
  static int h, w;
  static long mod = (long)1e9+7;
  static char[][] G;
  static Long[][] memo;
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    h = in.nextInt();
    w = in.nextInt();
    G = new char[h][w];
    for (int i = 0; i < h; i++)
      G[i] = in.next().toCharArray();
    memo = new Long[h][w];
    System.out.println(dp(0, 0));
    in.close();
  }
  
  public static long dp(int r, int c)
  {
    if (r == h-1 && c == w-1)
      return 1;
    if (memo[r][c] != null)
      return memo[r][c];
    long ans = 0;
    if (r+1 < h && G[r+1][c] != '#')
      ans += dp(r+1, c);
    ans %= mod;
    if (c+1 < w && G[r][c+1] != '#')
      ans += dp(r, c+1);
    ans %= mod;
    return memo[r][c] = ans;
}
