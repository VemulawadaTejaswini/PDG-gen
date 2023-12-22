import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AIntegerProduct solver = new AIntegerProduct();
        solver.solve(1, in, out);
        out.close();
    }

    static class AIntegerProduct {
        long gcd(long a, long b) {
            if (b == 0)
                return a;
            return (gcd(b, a % b));
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                double x = s.nextDouble();
                x = x * 1e9;
                a[i] = (long) x;
            }
            long[] num = new long[n];
            long[] den = new long[n];
            long intCount = 0;
            for (int i = 0; i < n; i++) {
                long f = gcd(a[i], (long) 1e9);
                num[i] = a[i] / f;
                den[i] = (long) 1e9 / f;
                if (den[i] == 1)
                    intCount++;
            }

            TreeSet<Integer> ts = new TreeSet<>();
            for (int i = 1; (long) i * i <= (int) 1e9; i++) {
                if ((int) 1e9 % i == 0) {
                    ts.add(i);
                    ts.add((int) 1e9 / i);
                }
            }
            int[] val = new int[ts.size()];
            HashMap<Integer, Integer> hm = new HashMap<>();
            int c = 0;
            for (int i : ts) {
                val[c] = i;
                hm.put(i, c);
                c++;
            }
            int m = ts.size();
            int[][] mat = new int[m][m];

            for (int i = 0; i < n; i++) {
                int idx = hm.get((int) den[i]);
                for (int j = 0; j < m; j++) {
                    if (num[i] % val[j] == 0) {
                        mat[idx][j]++;
                    }
                }
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                int idx = hm.get((int) den[i]);
                for (int j = 0; j < m; j++) {
                    if (num[i] % val[j] == 0) {
                        res += mat[j][idx];
                    }
                }
            }

            res -= intCount;
            res /= 2;

            w.println(res);
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

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
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

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nextInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, nextInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

