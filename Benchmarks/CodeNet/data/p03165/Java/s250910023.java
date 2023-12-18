import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    int slen = s.length(), tlen = t.length();
    int[][] dp = new int[slen+1][tlen+1];
    for (int i = 1; i < slen; i++)
      for (int j = 1; j < tlen; j++)
      {
        if (s.charAt(i-1) == t.charAt(j-1))
          dp[i][j] = 1+dp[i-1][j-1];
        else
          dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
      }
    System.out.println(dp[slen][tlen]);    
    in.close();
  }
}