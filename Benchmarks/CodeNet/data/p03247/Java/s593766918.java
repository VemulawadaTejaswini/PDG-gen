// package arc.arc103;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static String doit(long y, long x, long[] a) {
        int n = a.length;
        char[] mv = new char[n];
        for (int i = n-1 ; i >= 0 ; i--) {
            long v = a[i];
            if (Math.abs(y) > Math.abs(x)) {
                if (y < 0) {
                    y += v;
                    mv[i] = 'D';
                } else {
                    y -= v;
                    mv[i] = 'U';
                }
            } else {
                if (x < 0) {
                    x += v;
                    mv[i] = 'L';
                } else {
                    x -= v;
                    mv[i] = 'R';
                }
            }
        }
        if (y == 0 && x == 0) {
            return String.valueOf(mv);
        }
        throw new RuntimeException("wrong arms");
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] xy = new int[n][2];

        boolean odd = false;
        boolean even = false;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2 ; j++) {
                xy[i][j] = in.nextInt();
            }
            int d = Math.abs(xy[i][0]) + Math.abs(xy[i][1]);
            if (d % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
        }
        if (even && odd) {
            out.println(-1);
            out.flush();
            return;
        }

        long[] arm = new long[36];
        int ai = 0;
        if (even) {
            arm[ai++] = 1;
        }
        for (int i = ai ; i < arm.length ; i++) {
            arm[i] = 1L<<(i-ai);
        }
        
        out.println(arm.length);
        for (int i = 0; i < arm.length; i++) {
            if (i >= 1) {
                out.print(' ');
            }
            out.print(arm[i]);
        }
        out.println();
        for (int i = 0; i < n ; i++) {
            out.println(doit(xy[i][1], xy[i][0], arm));
        }
        out.flush();
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