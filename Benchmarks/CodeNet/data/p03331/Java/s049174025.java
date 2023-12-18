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
 * @author puneet
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastInput in = new FastInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        static long mod = 998244353;

        public void solve(int testNumber, FastInput in, PrintWriter out) {
            long n = in.nextLong(), a = in.nextLong(), b = in.nextLong();
            long k = in.nextLong();

            long[] arr = new long[400002];
            arr[0] = 1;

            for (int i = 1; i < 400001; i++) {
                arr[i] = (arr[i - 1] * (long) i) % mod;
            }


            out.println(ans(arr, n, a, b, k) % mod);

        }

        private long ans(long[] arr, long n, long a, long b, long k) {
            long ans = 0;

            for (long i = 0; i <= n; i++) {

                if (k - i * b < 0)
                    break;

                long na = (k - i * b) / a;

                if (na * a + i * b == k && na <= n) {
                    ans = (ans % mod + (ncr(arr, n, (int) na) * ncr(arr, n, i)) % mod) % mod;
                }
            }


            return ans;
        }

        private long ncr(long arr[], long n, long r) {


            if (r < 0 || r > n || n < 0)
                return 0;


            return (arr[(int) n] * (modI(arr[(int) r], mod) * modI(arr[(int) (n - r)], mod)) % mod) % mod;
        }

        long modE(long x, long n, long M) {
            if (n == 0)
                return 1;
            else if (n % 2 == 0)
                return modE((x * x) % M, n / 2, M);
            else                             //
                return (x * modE((x * x) % M, (n - 1) / 2, M)) % M;

        }

        long modI(long A, long M) {
            return modE(A, M - 2, M);
        }

    }

    static class FastInput {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastInput.SpaceCharFilter filter;

        public FastInput(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

