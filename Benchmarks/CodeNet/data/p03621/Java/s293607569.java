// package agc.agc019;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        char[] a = in.nextToken().toCharArray();
        char[] b = in.nextToken().toCharArray();

        // solveBF(a, b);

        if (a.length > 500) {
            throw new RuntimeException("no");
        }

        int k = 0;
        int same = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '1') {
                k++;
                if (b[i] == '1') {
                    same++;
                }
            }
        }


        out.println(solve(k, k-same));
        out.flush();
    }

    /**
     * Computes smallest lexicographically larger permutation of given array.
     * Modifies given array directly.
     * If there is no such permutation, returns false.
     *
     * @param a
     * @return
     */
    public static boolean next_permutation(int[] a) {
        int len = a.length;
        int x = len - 2;
        while (x >= 0 && a[x] >= a[x + 1]) {
            x--;
        }
        if (x == -1) {
            return false;
        }

        int y = len - 1;
        while (y > x && a[y] <= a[x]) {
            y--;
        }
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
        Arrays.sort(a, x + 1, len);
        return true;
    }


    static final long MOD = 998244353;

    private static long solve(int n, int k) {
        dp = new long[2][k+1][n+1];
        dp[0][k][0] = 1;

        for (int i = 0 ; i < n ; i++) {
            int left = n-i;

            int fr = i % 2;
            int to = 1 - fr;
            for (int zero = 0; zero <= k ; zero++) {
                Arrays.fill(dp[to][zero], 0);
            }

            for (int zero = 0 ; zero <= k ; zero++) {
                int one = left-zero;
                int need = zero;
                for (int oneone = 0 ; oneone < n ; oneone++) {
                    if (dp[fr][zero][oneone] == 0) {
                        continue;
                    }
                    long base = dp[fr][zero][oneone];

                    // 10-01
                    if (zero >= 1 && need >= 1) {
                        long add = zero * need % MOD;
                        add(to, zero-1, oneone, base * add % MOD);
                    }

                    if (one >= 1) {
                        // 11-01
                        if (one - oneone >= 1) {
                            long add = (one - oneone) * need % MOD;
                            add(to, zero, oneone, base * add % MOD);
                        }

                        // 11-11
                        {
                            long safe = one - oneone;

                            // type-A
                            if (safe >= 1) {
                                long add0 = safe * (safe - 1) % MOD;
                                add(to, zero, oneone + 1, base * add0 % MOD);

                                long add1 = safe % MOD;
                                add(to, zero, oneone, base * add1 % MOD);
                            }

                            // type-B
                            if (safe >= 1 && oneone >= 1) {
                                long add1 = 2 * oneone * safe % MOD;
                                add(to, zero, oneone, base * add1 % MOD);
                            }

                            // type-C
                            if (oneone >= 1) {
                                long add2 = oneone * oneone % MOD;
                                add(to, zero, oneone - 1, base * add2 % MOD);
                            }
                        }
                    }
                }
            }
        }

        long ret = 0;
        for (int i = 0; i <= n; i++) {
            ret += dp[n%2][0][i];
        }
        return ret % MOD;
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }


    static long[][][] dp;

    static void add(int a, int b, int c, long add) {
        dp[a][b][c] += add;
        dp[a][b][c] -= dp[a][b][c] >= MOD ? MOD : 0;
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