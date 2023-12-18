import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E3";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        // System.out.println(BigInteger.probablePrime(60, new Random(123)));
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        int[] b = in.nextIntArray(n);

        final int BITS = 30;
        HashMap<Long, Integer>[] hash = new HashMap[BITS];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = new HashMap<>();
        }
        long[] two = new long[n];
        two[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            two[i+1] = MULT(two[i], 2);
        }
        for (int bit = 0; bit < BITS; bit++) {
            long h1 = 0;
            long h2 = 0;
            for (int i = 0; i < n; i++) {
                int x = (b[i] & (1 << bit)) != 0 ? 1 : 0;
                int y = x ^ 1;
                h1 = ADD(h1, MULT(x, two[i]));
                h2 = ADD(h2, MULT(y, two[i]));
            }
            hash[bit].put(h1, 0);
            hash[bit].put(h2, 1);
        }

        long[] bits = new long[BITS];
        for (int bit = 0; bit < BITS; bit++) {
            for (int i = 0; i < n; i++) {
                int x = (a[i] & (1 << bit)) != 0 ? 1 : 0;
                bits[bit] = ADD(bits[bit], MULT(x, two[i]));
            }
        }
        for (int k = 0; k < n; k++) {
            boolean can = true;
            long res = 0;
            for (int bit = 0; bit < BITS; bit++) {
                if (hash[bit].containsKey(bits[bit])) {
                    int cur = hash[bit].get(bits[bit]);
                    res |= cur << bit;
                } else {
                    can = false;
                }
                int x = (a[k] & (1 << bit)) != 0 ? 1 : 0;
                bits[bit] = SUB(bits[bit], x);
                bits[bit] = DIV(bits[bit], 2);
                bits[bit] = ADD(bits[bit], MULT(x, two[n-1]));
            }
            if (can) {
                out.println(k + " " + res);
            }
        }
        out.close();
    }

    /* MOD_CALCULATION */
    static long MOD = 1000000007L;
    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    static long POW(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    static long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
