import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    char[] s = in.next().toCharArray();
    char[] t = in.next().toCharArray();
    int sl = s.length, tl = t.length;
    int[][] dp = new int[sl+1][tl+1];
    for (int i = 1; i < sl+1; i++)
        for (int j = 1; j < tl+1; j++)
        {
            if (s[i-1] == t[j-1])
                dp[i][j] = 1+dp[i-1][j-1];
            else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    System.out.println(dp[sl][tl]);
    in.close();
  }
}