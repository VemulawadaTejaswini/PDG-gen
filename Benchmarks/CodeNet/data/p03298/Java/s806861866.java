// package agc.agc026;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        char[] c = in.nextToken().toCharArray();

        Map<String,Integer> ways = new HashMap<>();
        for (int i = 0; i < (1<<n) ; i++) {
            String[] k = key(i, c, n, 2*n);
            String key = k[0] + "/" + k[1];
            ways.put(key, ways.getOrDefault(key,0)+1);
        }


        long total = 0;
        for (int i = 0; i < (1<<n) ; i++) {
            String[] k = key(i, c, 0, n);
            String key = k[1] + "/" + k[0];
            total += ways.getOrDefault(key, 0);
        }

        out.println(total);
        out.flush();
    }

    private static String[] key(int ptn, char[] c, int l, int r) {
        StringBuilder L = new StringBuilder();
        StringBuilder R = new StringBuilder();
        int n = r - l;
        for (int j = 0; j < n ; j++) {
            if ((ptn & (1<<j)) >= 1) {
                L.append(c[l+j]);
            } else {
                R.append(c[l+j]);
            }
        }
        return new String[]{L.toString(), R.reverse().toString()};
    }

    private static boolean solve(long a, long b, long c, long d) {
        if (d < b) {
            return false;
        }
        if (c >= b) {
            return true;
        }
        if (a < b) {
            return false;
        }
        long next0 = limit(a, b, c);
        long next1 = limit(next0 + d, b, c);
        if (next0 < 0 || next1 < 0) {
            return false;
        }
        long diff = next1 - next0;
        if (diff == 0) {
            return true;
        }

        

        return false;

    }

    private static long limit(long a, long b, long c) {
        return (a <= c) ? (a - b) : (a - ((a - c + b - 1) / b) * b);
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