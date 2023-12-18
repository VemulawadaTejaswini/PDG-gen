import java.util.*;
import java.io.*;

public class Main
{
  	char[] n;
  	int d, l;
  	long mod = (long)1e9+7;
  	long[][][] dp;
  
    Main(Scanner in, PrintWriter out)
    {
      n = in.next().toCharArray();
      d = in.nextInt();
      dp = new long[2][d][l = n.length];
      for (int i = 0; i < 2; i++)
        for (int j = 0; j < d; j++)
          Arrays.fill(dp[i][j], -1L);
      out.println(dp(1, 0, 0));
    }
  
  	long dp(int b, int s, int at)
    {
      if (s >= d) s %= d;
      if (at == l) return s == 0 ? 1L : 0L;
      if (dp[b][s][at] != -1L) return dp[b][s][at];
      
      long ans = 0L;
	  int lo = b == 0 && at == n-1 ? 1 : 0;
      int up = b == 1 ? n[at]-'1' : 9;
      if (b == 1)
        ans += dp(1, s+n[at]-'0', at+1);
      for (int i = lo; i <= up; i++)
        ans += dp(0, s+i, at+1);
      return dp[b][s][at] = ans % mod;
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}
