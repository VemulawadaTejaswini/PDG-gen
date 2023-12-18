import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    // https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a
    // http://drken1215.hatenablog.com/entry/2018/06/08/210000
    private static final class ModCombination {

        private final int mod;
        private final long[] factorial;
        private final long[] factorialInverse;

        ModCombination(int mod, int maxN) {
            // assert isPrimeNumber(mod);
            if (maxN > 10_000_000)
                throw new IllegalArgumentException();

            this.mod = mod;
            factorial = new long[maxN + 1];
            long[] inverse = new long[factorial.length];
            factorialInverse = new long[factorial.length];

            factorial[0] = factorial[1] = 1;
            inverse[1] = 1;
            factorialInverse[0] = factorialInverse[1] = 1;
            for (int i = 2; i < factorial.length; i++) {
                factorial[i] = factorial[i - 1] * i % mod;
                inverse[i] = mod - inverse[mod % i] * (mod / i) % mod;
                factorialInverse[i] =
                        factorialInverse[i - 1] * inverse[i] % mod;
            }
        }
        long of(int n, int k) {
            if (k > n)
                return 0;
            return factorial[n]
                   * (factorialInverse[k] * factorialInverse[n - k] % mod)
                   % mod;
        }
    }

    private static final int MOD = 1_000_000_007;

    static void solve(MyScanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        ModCombination c = new ModCombination(MOD, 2000);
        for (int i = 1; i <= k; i++)
            out.println(c.of(n - k + 1, i) * c.of(k - 1, i - 1) % MOD);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1)
                return -1;
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = nextInt();
            return result;
        }
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length)
                return false;
            for (int[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length)
                return false;
            for (char[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c)
                    d[i] = nextInt();
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++)
                result[i] = nextLong();
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            return (char)c;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++)
                result[i] = nextChar();
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    result[i][j] = nextChar();
            return result;
        }
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c)
                    d[i] = nextChar();
            }
        }
    }
}
