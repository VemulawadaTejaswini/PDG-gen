import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
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
        EBullet solver = new EBullet();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBullet {
        final long mod = (long) 1e9 + 7;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            TreeMap<pair<Long, Long>, Integer> t = new TreeMap<>();
            long ways = 1;
            long[] pow = new long[n + 1];
            pow[0] = 1;
            for (int i = 1; i <= n; i++) {
                pow[i] = pow[i - 1] << 1;
                pow[i] %= mod;
            }
            for (int i = 0; i < n; i++) {
                long a = s.nextLong(), b = s.nextLong(), g = func.gcd(Math.abs(a), Math.abs(b));
                if (g != 0) {
                    a /= g;
                    b /= g;
                }
                if (a > 0 != b > 0) a = -Math.abs(a);
                else a = Math.abs(a);
                b = Math.abs(b);
                pair<Long, Long> p;
                if (a > 0 == b > 0) p = new pair<>(-Math.abs(b), Math.abs(a));
                else p = new pair<>(Math.abs(b), Math.abs(a));
                if (a == 0 || b == 0) {
                    a = Math.abs(a);
                    p = new pair<>(b, a);
                }
                //w.print(ways+" ");
                ways *= func.power(pow[t.getOrDefault(new pair<>(a, b), 0)] + pow[t.getOrDefault(p, 0)] - 1, mod - 2, mod);
                ways %= mod;
                t.put(p, t.getOrDefault(p, 0) + 1);
                ways *= pow[t.getOrDefault(new pair<>(a, b), 0)] + pow[t.get(p)] - 1;
                ways %= mod;
            }
            w.println(ways - 1);
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

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
        }

    }
}

