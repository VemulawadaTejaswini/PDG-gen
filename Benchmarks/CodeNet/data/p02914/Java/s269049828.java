import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        ntok();
        long[] arr = lapar(n);
        long xor = 0;
        VectorBasis basis = new VectorBasis(60);
        int[] count = new int[60];
        for (int i = 0; i < n; i++)
        {
            for (int d = 0; d < 60; d++)
            {
                if ((arr[i] & (1L << d)) > 0)
                {
                    count[d]++;
                }
            }
            xor ^= arr[i];
        }
        // out.println(Arrays.toString(count));
        for (int i = 0; i < n; i++)
        {
            for (int d = 0; d < 60; d++)
            {
                if (count[d] % 2 == 1 && (arr[i] & (1L << d)) > 0)
                {
                    arr[i] ^= 1L << d;
                }
            }
            // out.print(arr[i] + " ");
            basis.add(arr[i]);
        }
        // out.println();
        long ans = basis.max();
        long ans2 = 0;
        for (int i = 0; i < n; i++)
        {
            for (int d = 0; d < 60; d++)
            {
                if (count[d] % 2 == 1)
                {
                    ans2 ^= 1L << d;
                    xor ^= 1L << d;
                }
            }
        }
        // out.println(ans);
        out.println((xor ^ ans) + ans + ans2);

        out.flush();
        in.close();
    }

    private class VectorBasis
    {
        long[] basis;
        int n;

        public VectorBasis(int n)
        {
            basis = new long[n];
            Arrays.fill(basis, -1);
            this.n = n;
        }

        public void add(long val)
        {
            for (int d = n-1; d >= 0; d--)
            {
                if ((val & (1L << d)) == 0)
                {
                    continue;
                }
                if (basis[d] == -1)
                {
                    basis[d] = val;
                    return;
                }
                val ^= basis[d];
            }
        }

        public long max()
        {
            long val = 0;
            for (int d = n-1; d >= 0; d--)
            {
                if (basis[d] == -1)
                {
                    continue;
                }
                if ((val & (1L << d)) == 0)
                {
                    val ^= basis[d];
                }
            }
            return val;
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
