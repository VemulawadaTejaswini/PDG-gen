import java.util.*;

public class Main
{
  static int n;
  static int[][] abc;
  static Integer[][] memo;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    abc = new int[3][n];
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < n; j++)
        abc[i][j] = in.nextInt();
    
    memo = new Integer[3][n];
    System.out.println(go());
    in.close();
  }
  
  public static int go()
  {
    int ans = 0;
    for (int i = 0; i < 3; i++)
      ans = Math.max(ans, abc[i][0]+dp(i, 1));
    return ans;
  }
  
  public static int dp(int bad, int at)
  {
	if (at == n)
      return 0;
    if (memo[bad][at] != null)
      return memo[bad][at];
    
    int ans = 0;
    int to1 = 3-at;
    int to2 = 0;
    if (to1 == 3)
    {
      to1 = 1;
      to2 = 2;
    }
    ans = Math.max(ans, abc[to1][at]+dp(to1, at+1));
    ans = Math.max(ans, abc[to2][at]+dp(to2, at+1));
    return memo[bad][at] = ans;
  }
}
