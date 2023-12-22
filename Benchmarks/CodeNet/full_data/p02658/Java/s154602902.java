import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;
    static CF_Reader in;
    static BigInteger E = new BigInteger("1000000000000000000");

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();


        int n = in.intNext();
        out.println(solve(n));

        out.close();
    }

    static BigInteger solve(int n) throws IOException {
        BigInteger[] nums = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger num = new BigInteger(in.next());
            if (num.equals(BigInteger.ZERO)) return BigInteger.ZERO;
            nums[i] = num;
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            res = res.multiply(nums[i]);
        }
        if (res.compareTo(E) > 0) {
            return new BigInteger("-1");
        }
        return res;
    }


    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}


