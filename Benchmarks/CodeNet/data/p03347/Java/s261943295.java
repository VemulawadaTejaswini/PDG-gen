// package agc.agc024;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }

        long r = solve(a);

        out.println(r >= INF ? -1 : r);
        out.flush();
    }

    static long INF = (long)1e12;

    private static long solve(int[] a) {
        int n = a.length;
        long total = 0;
        for (int i = 0; i < n ;) {
            int j = i;
            while (j < n && a[j] == 0) {
                j++;
            }
            int from = j, to = j;
            while (to < n && a[to] != 0) {
                to++;
            }
            if (j - i == 0) {
                return INF;
            }
            long[] sub = new long[to-from];
            for (int k = from ; k < to; k++) {
                sub[k-from] = a[k];
            }
            if (to - from >= 1) {
                total += solveSub(sub);
            }
            i = to;
            if (total >= INF) {
                return INF;
            }
        }
        return total;
    }

    public static long solveSub(long[] a) {
        int n = a.length;
        for (int i = 0 ; i < n; i++) {
            if (a[i] > i+1) {
                return INF;
            }
        }
        long lv = a[n-1];
        for (int i = n-2 ; i >= 0 ; i--) {
             lv = Math.max(lv-1, a[i]);
             if (lv > a[i]) {
                 return INF;
             }
        }

        long sum = 0;
        for (int i = n-1 ; i >= 0 ; i--) {
            if (i == 0) {
                sum += 1;
            } else {
                if (a[i-1] + 1 == a[i]) {
                    sum++;
                } else {
                    sum += a[i];
                }
            }
        }
        return sum;
    }

    public static void debug(Object... o) {
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