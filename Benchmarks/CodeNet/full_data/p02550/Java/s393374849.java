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
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            ESequenceSum solver = new ESequenceSum();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class ESequenceSum {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            long n = s.nextLong() - 1;
            long x = s.nextInt(), mod = s.nextInt();
            if (mod == 1) {
                w.println(x);
                return;
            } else if (mod == 2) {
                w.println(n * (x & 1) + x);
                return;
            }
            long res = 0;
            while (x <= mod) {
                res += x % mod;
                x *= x;
                n--;
            }
            long gcd = func.gcd(x, mod);
            x /= gcd;
            mod /= gcd;
            long phiMod = phi(mod),
                    powMod = phi(phiMod);
            for (int i = 0; i < powMod; i++) {
                if (n - i < 0) continue;
                long tot = (n - i) / powMod + 1;
                long pow = func.power(2, i, phiMod);
                long mult = func.power(x, pow, mod);
                //w.println(mult + " " + tot);
                res += mult * tot;
            }
            w.println(res);
        }

        static int phi(long n) {
            // Initialize result as n
            double result = n;

            // Consider all prime factors of n and for
            // every prime factor p, multiply result
            // with (1 - 1/p)
            for (int p = 2; p * p <= n; ++p) {
                // Check if p is a prime factor.
                if (n % p == 0) {
                    // If yes, then update n and result
                    while (n % p == 0)
                        n /= p;
                    result *= (1.0 - (1.0 / p));
                }
            }

            // If n has a prime factor greater than sqrt(n)
            // (There can be at-most one such prime factor)
            if (n > 1)
                result *= (1.0 - (1.0 / n));

            return (int) result;
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

        public static long gcd(long a, long b) {
            long t;
            while (b != 0) {
                t = b;
                b = a % b;
                a = t;
            }
            return a;
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

        public long nextLong() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            long res = 0;

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

