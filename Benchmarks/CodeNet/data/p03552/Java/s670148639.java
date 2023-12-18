// package arc.arc085;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = in.nextInt();
        Z = in.nextInt();
        W = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }

        memo = new int[2][n+1][n];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= n ; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        out.println(dfs(0, n, 0));
        out.flush();
    }


    static int[] a;
    static int n, Z, W;
    static int[][][] memo;
    static int INF = 1000000010;

    static int dfs(int turn, int last, int idx) {
        if (idx == n-1) {
            int L = last == n ? (turn == 0 ? W : Z) : a[last];
            return Math.abs(L - a[n-1]);
        }
        if (memo[turn][last][idx] != -1) {
            return memo[turn][last][idx];
        }
        int best = turn == 0 ? 0 : INF;
        if (turn == 0) {
            best = Math.max(best, dfs(turn^1, idx, idx+1));
            best = Math.max(best, dfs(turn, last, idx+1));
        } else {
            best = Math.min(best, dfs(turn^1, idx, idx+1));
            best = Math.min(best, dfs(turn, last, idx+1));
        }
        memo[turn][last][idx] = best;
        return best;
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