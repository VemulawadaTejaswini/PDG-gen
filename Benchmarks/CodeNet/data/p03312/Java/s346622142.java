// package arc.arc100;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }
        long[] imos = new long[n+1];
        for (int i = 0; i < n ; i++) {
            imos[i+1] = imos[i] + a[i];
        }

        long best = Long.MAX_VALUE;
        for (int sp = 2 ; sp <= n - 2 ; sp++) {
            long[][] left = doHalfCut(a, imos, 0, sp);
            long[][] right = doHalfCut(a, imos, sp, n);

            for (long[] l : left) {
                for (long[] r : right) {
                    long min = Math.min(Math.min(l[0], l[1]), Math.min(r[0], r[1]));
                    long max = Math.max(Math.max(l[0], l[1]), Math.max(r[0], r[1]));
                    best = Math.min(best, max - min);
                }
            }
        }

        out.println(best);
        out.flush();
    }

    private static long[][] doHalfCut(long[] a, long[] imos, int L, int R) {
        long sum = imos[R] - imos[L];

        int l = L;
        int r = R;
        while (r - l > 1) {
            int med = (r + l) / 2;
            if (2 * (imos[med] - imos[L]) <= sum) {
                l = med;
            } else {
                r = med;
            }
        }

        if (l == R-1) {
            return new long[][]{
                    {imos[l] - imos[L], imos[R] - imos[l]}
            };
        } else {
            return new long[][]{
                    {imos[l] - imos[L], imos[R] - imos[l]},
                    {imos[l+1] - imos[L], imos[R] - imos[l+1]}
            };
        }
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}