import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.StringTokenizer;

public class Main
{

    public Main() throws IOException
    {

    }

    private void solve() throws IOException
    {
        long n = nextLong();
        long x = n;
        int cnt = 0;
        int last = 0;
        while (x > 0)
        {
            cnt++;
            x /= 10;
        }
        long cur = 1;
        for (int i = 0; i < cnt - 1; i++) cur = cur * 10 + 9;
        for (int first_dig = 9; first_dig >= 0; first_dig--)
        {
            cur = first_dig;
            for (int i = 0; i < cnt - 1; i++) cur = cur * 10 + 9;
            if (cur <= n)
            {
                out.println(first_dig + (cnt - 1) * 9);
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Main().run();
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);
    String next() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
        {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException
    {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException
    {
        return Long.parseLong(next());
    }

    private void run() throws IOException
    {
        solve();
        out.close();
    }

}