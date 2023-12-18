import java.util.*;
import java.io.*;

public class Main
{
  	char[] n;
  	int d, l;
  	long mod = (long)1e9+7;
  	int[][][] dp;
  
    Main(Scanner in, PrintWriter out)
    {
      n = in.next().toCharArray();
      l = n.length;
      d = in.nextInt();
      dp = new int[2][d][l];
      for (int i = 0; i < 2; i++)
        for (int j = 0; j < d; j++)
          Arrays.fill(dp[i][j], -1);
      out.println(dp(1, 0, 0));
    }
  
  	int dp(int b, int s, int at)
    {
      if (at == l && s == 0) return 1;
      if (dp[b][s][at] != -1) return dp[b][s][at];
      
      int ans = 0, up = b == 1 ? n[at] : 10;
      if (b == 1)
        ans += dp(1, (s+n[at]-'0') % mod, at+1);
      for (int i = 0; i < up; i++)
        ans += dp(0, (s+i) % mod, at+1);
      return dp[b][s][at] = ans;
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}