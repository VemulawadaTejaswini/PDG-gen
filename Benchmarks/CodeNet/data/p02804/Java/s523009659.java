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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EMaxMinSums solver = new EMaxMinSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMaxMinSums {
        final long mod = (long) 1e9 + 7;
        long[] fac;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt();
            int[] a = new int[n];
            long ans = 0;
            fac = new long[n];
            fac[0] = 1;
            for (int i = 1; i < n; i++) {
                fac[i] = fac[i - 1] * i;
                fac[i] %= mod;
            }
            for (int i = 0; i < n; i++) a[i] = s.nextInt();
            func.sort(a);
            for (int i = n - 1; i >= k - 1; i--) {
                ans += (a[i] * combi(i, k - 1)) % mod;
                ans %= mod;
            }
            for (int i = 0; i <= n - k; i++) {
                ans -= (a[i] * combi(n - i - 1, k - 1)) % mod;
                ans += mod;
                ans %= mod;
            }
            w.println(ans);
        }

        long combi(int n, int m) {
            long ans = fac[n];
            ans *= func.power(fac[m], mod - 2, mod);
            ans %= mod;
            ans *= func.power(fac[n - m], mod - 2, mod);
            return ans %= mod;
        }

    }

    static class func {
        public static long power(long x, long y, long p) {
            long res = 1;
            x %= p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                    res %= p;
                }
                y >>= 1;
                x *= x;
                x %= p;
            }
            return res;
        }

        public static void sort(int[] arr) {
            int n = arr.length, mid, h, s, l, i, j, k;
            int[] res = new int[n];
            for (s = 1; s < n; s <<= 1) {
                for (l = 0; l < n - 1; l += (s << 1)) {
                    h = Math.min(l + (s << 1) - 1, n - 1);
                    mid = Math.min(l + s - 1, n - 1);
                    i = l;
                    j = mid + 1;
                    k = l;
                    while (i <= mid && j <= h) res[k++] = (arr[i] <= arr[j] ? arr[i++] : arr[j++]);
                    while (i <= mid) res[k++] = arr[i++];
                    while (j <= h) res[k++] = arr[j++];
                    for (k = l; k <= h; k++) arr[k] = res[k];
                }
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

