import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;
    long INF = 10000000000000000L;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        ntok();
        long[] arr = lapar(n);
        long[][] dp = new long[n+5][2 + n%2];
        for (int i = n-1; i >= 0; i--) {
            for (int e = 0; e < 2+n%2; e++) {
                if (i + e >= n) {
                    dp[i][e] = dp[i+1][e-1];
                } else {
                    dp[i][e] = dp[i+2][e] + arr[i];
                    if (e > 0) {
                        dp[i][e] = Math.max(dp[i][e], dp[i+1][e-1]);
                    }
                }
            }
        }
        out.println(dp[0][1 + n%2]);

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
