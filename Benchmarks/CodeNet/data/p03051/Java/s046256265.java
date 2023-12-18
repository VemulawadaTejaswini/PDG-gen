import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jeel Vaishnav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EXORPartitioning solver = new EXORPartitioning();
        solver.solve(1, in, out);
        out.close();
    }

    static class EXORPartitioning {
        long mod = (long) 1e9 + 7;
        long cans;
        long freq;
        long lazy;
        final int M = 1 << 20;

        long querySegTree(int low, int high, int pos, int ind) {
            handleLazy(low, high, pos);

            if (low > ind || high < ind)
                return 0;

            if (low == high)
                return cans[pos];

            int mid = (low + high) >> 1;
            long val1 = querySegTree(low, mid, 2 * pos + 1, ind);
            long val2 = querySegTree(mid + 1, high, 2 * pos + 2, ind);
            return val1 + val2;
        }

        void updateSegTree(int low, int high, int pos, int ind, long val) {
            handleLazy(low, high, pos);

            if (low > ind || high < ind)
                return;

            if (low == high) {
                freq[pos] += val;
                freq[pos] %= mod;

                return;
            }

            int mid = (low + high) >> 1;
            updateSegTree(low, mid, 2 * pos + 1, ind, val);
            updateSegTree(mid + 1, high, 2 * pos + 2, ind, val);

            freq[pos] = freq[2 * pos + 1] + freq[2 * pos + 2];
            cans[pos] = cans[2 * pos + 1] + cans[2 * pos + 2];
            freq[pos] %= mod;
            cans[pos] %= mod;
        }

        private void handleLazy(int low, int high, int pos) {
            cans[pos] += freq[pos] * lazy[pos] % mod;
            cans[pos] %= mod;

            if (low != high) {
                lazy[2 * pos + 1] += lazy[pos];
                lazy[2 * pos + 2] += lazy[pos];
            }

            lazy[pos] = 0;
        }

        long fast_pow(long a, long b) {
            if (b == 0)
                return 1L;

            long val = fast_pow(a, b / 2);

            if (b % 2 == 0)
                return val * val % mod;
            else
                return val * val % mod * a % mod;
        }

        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            int n = sc.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; ++i)
                a[i] = sc.nextInt();

            cans = new long[4 * M];
            freq = new long[4 * M];
            lazy = new long[4 * M];

            long ans = 0;
            int cval = 0;
            long freq0 = 0;
            for (int i = 0; i < n; ++i) {
                cval ^= a[i];
                long cfreq = 0;

                if (cval == 0) {
                    freq0++;
                    lazy[0]++;
                } else {
                    cfreq = querySegTree(0, M - 1, 0, cval) + 1L;
                    cfreq %= mod;

                    updateSegTree(0, M - 1, 0, cval, cfreq);
                }

                if (i == n - 1) {
                    if (cval != 0) {
                        ans = cfreq;
                    } else {
                        ans = fast_pow(2L, freq0 - 1);
                        handleLazy(0, M - 1, 0);
                        ans = (ans + freq[0]) % mod;
                    }
                }
            }

            out.print(ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
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

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

