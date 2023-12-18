// package other2017.codefestival2017.finale;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    private static final long INF = 10000000000L;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[][] people = new int[n][2];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2 ; j++) {
                people[i][j] = in.nextInt();
            }
        }
        Arrays.sort(people, (u, v) -> u[1] != v[1] ? u[1] - v[1] : u[0] - v[0]);

        int ans = solve(people);


        Arrays.sort(people, (u, v) -> u[0] != v[0] ? u[0] - v[0] : u[1] - v[1]);
        ans = Math.max(ans, solve(people));

        out.println(ans);
        out.flush();
    }

    static int solve(int[][] people) {
        int n = people.length;
        long[][] dp = new long[2][n+1];
        for (int i = 0; i <= 1; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][0] = 0;

        for (int i = 0; i < n ; i++) {
            int fr = i % 2;
            int to = 1 - fr;
            Arrays.fill(dp[to], INF);
            for (int j = 0; j < n; j++) {
                long base = dp[fr][j];
                if (base == INF) {
                    continue;
                }
                if (base <= people[i][0]) {
                    long t = base + people[i][1];
                    dp[to][j+1] = Math.min(dp[to][j+1], t);
                    dp[to][j] = Math.min(dp[to][j], t);
                } else {
                    dp[to][j] = Math.min(dp[to][j], base);
                }
            }
        }

        int max = 0;
        for (int i = 0; i <= n ; i++) {
            if (dp[n%2][i] < INF) {
                max = Math.max(max, i);
            }
        }
        return max;
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