import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    static final int MOD = 1_000_000_007;

    static final class ModCombination {
        private final int mod;
        private final long[] factorial;
        private final long[] factorialInverse;

        public ModCombination(int mod, int maxN) {
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
        public long of(int n, int k) {
            if (k > n) {
                return 0;
            }
            return factorial[n]
                   * (factorialInverse[k] * factorialInverse[n - k] % mod)
                   % mod;
        }
    }
    static final class PrimeFactor {
        public final long primeNumber;
        public final int exponent;
        PrimeFactor(long primeNumber, int exponent) {
            if (primeNumber <= 1) {
                throw new IllegalArgumentException();
            }
            if (exponent < 0) {
                throw new IllegalArgumentException();
            }
            this.primeNumber = primeNumber;
            this.exponent = exponent;
        }
        public static List<PrimeFactor> factorize(long n) {
            if (n <= 1) {
                throw new IllegalArgumentException();
            }
            List<PrimeFactor> result = new ArrayList<>();
            for (long i = 2; i * i <= n; i += (i == 2 ? 1 : 2)) {
                if (n % i != 0) {
                    continue;
                }
                int exp = 1;
                n /= i;
                for (; n % i == 0; n /= i) {
                    exp++;
                }
                result.add(new PrimeFactor(i, exp));
            }
            if (n != 1) {
                result.add(new PrimeFactor(n, 1));
            }
            return result;
        }
        int exponent() {
            return exponent;
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        if (n == 1 || m == 1) {
            out.println(1);
            return;
        }
        List<PrimeFactor> factors = PrimeFactor.factorize(m);
        int maxExp = factors.stream()
                            .mapToInt(PrimeFactor::exponent)
                            .max()
                            .getAsInt();
        ModCombination c = new ModCombination(MOD, maxExp + n - 1);
        long ans = 1;
        for (PrimeFactor f : factors) {
            ans *= c.of(f.exponent + n - 1, n - 1);
            ans %= MOD;
        }
        out.println(ans);
    }

    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
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
        private byte readByte() {
            if (point < readLength) {
                byte result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(byte c) {
            return 33 <= c && c <= 126;
        }
        public char nextChar() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        public String next() {
            return next(16);
        }
        public String next(int n) {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        public long nextLong() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        public int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        public long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        public char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        public char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        public int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        public long[][] nextVerticalLongArrays(int arrayCount,
                                               int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        public char[][] nextVerticalCharArrays(int arrayCount,
                                               int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        public void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
