import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    int INF = 1000000000;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        int m = ipar();
        int[] cost = new int[m];
        int[] cover = new int[m];
        for (int i = 0; i < m; i++)
        {
            ntok();
            cost[i] = ipar();
            int b = ipar();
            ntok();
            for (int e = 0; e < b; e++)
            {
                cover[i] |= 1 << (ipar()-1);
            }
        }
        int[][] dp = new int[m+1][1 << n];
        Arrays.fill(dp[m], INF);
        dp[m][(1 << n) - 1] = 0;
        for (int i = m-1; i >= 0; i--)
        {
            for (int e = 0; e < 1 << n; e++)
            {
                dp[i][e] = Math.min(dp[i+1][e], dp[i+1][e|cover[i]] + cost[i]);
            }
        }
        out.println(dp[0][0] == INF ? -1 : dp[0][0]);

        out.flush();
        in.close();
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public int[] iapar(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        return arr;
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public long[] lapar(int n)
    {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = lpar();
        }
        return arr;
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
