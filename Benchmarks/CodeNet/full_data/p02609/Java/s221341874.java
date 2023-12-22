import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        boolean[] x = new boolean[n];
        char[] ch = in.next().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            x[i] = ch[i] == '1';
        }

        BigInteger bi = toBigInteger(x);
        BigInteger two = BigInteger.valueOf(2);
        for (int i = 0; i < n; i++) {
            BigInteger pow = two.pow(n - i - 1);
            if (x[i]) {
                bi = bi.subtract(pow);
            } else {
                bi = bi.add(pow);
            }
            out.println(f(bi));
            if (!x[i]) {
                bi = bi.subtract(pow);
            } else {
                bi = bi.add(pow);
            }
        }
    }

    private static int f(BigInteger bi) {
        int ret = 0;
        while (!bi.equals(BigInteger.ZERO)) {
            bi = bi.mod(BigInteger.valueOf(bi.bitCount()));
            ret++;
        }
        return ret;
    }

    private static BigInteger toBigInteger(boolean[] x) {
        BigInteger bi = BigInteger.ZERO;
        BigInteger two = BigInteger.valueOf(2);
        for (int i = 0; i < x.length; i++) {
            if (!x[i]) continue;
            bi = bi.add(two.pow(x.length - i - 1));
        }
        return bi;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
