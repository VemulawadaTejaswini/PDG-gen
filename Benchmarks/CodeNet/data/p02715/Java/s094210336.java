import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;
    ArrayList<Integer> primes = new ArrayList<>();
    long MOD = 1000000007;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        int k = ipar();
        long sum = 0;
        long[] counts = new long[k+1];
        for (int i = k; i >= 1; i--) {
            long count = modPow(k/i, n);
            for (int e = 2; e*i <= k; e++) {
                count += MOD - counts[i*e];
                count %= MOD;
            }
            counts[i] = count;
            sum += count * i;
            sum %= MOD;
        }
        out.println(sum);

        out.flush();
        in.close();
    }

    public long modPow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return modPow(a*a%MOD, b/2);
        } else {
            return modPow(a*a%MOD, b/2) * a % MOD;
        }
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
