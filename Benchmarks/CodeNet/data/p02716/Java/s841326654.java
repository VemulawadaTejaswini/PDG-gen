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
        long sum = 0;
        if (n % 2 == 0) {
            long[] sumArr = new long[2];
            for (int i = 0; i < n; i++) {
                sumArr[i%2] += arr[i];
            }
            sum = Math.max(sumArr[0], sumArr[1]);
        } else {
            long[][] dp = new long[n+4][3];
            Arrays.fill(dp[n+3], -INF);
            Arrays.fill(dp[n+2], -INF);
            Arrays.fill(dp[n+1], -INF);
            dp[n+1][2] = 0;
            dp[n+1][1] = 0;
            for (int i = n-1; i >= 0; i--) {
                for (int e = 0; e < 3; e++) {
                    dp[i][e] = -INF;
                    for (int w = e; w < 3; w++) {
                        dp[i][e] = Math.max(dp[i][e], dp[i+2+w-e][w] + arr[i]);
                    }
                }
            }
            sum = Math.max(dp[0][0], Math.max(dp[1][1], dp[2][2]));
            // for (long[] arrr : dp) {
            //     out.println(Arrays.toString(arrr));
            // }
        }
        out.println(sum);

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
