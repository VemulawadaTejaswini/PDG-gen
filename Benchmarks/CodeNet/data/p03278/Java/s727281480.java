// package arc.arc101;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final long MOD = 1000000007;

    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        prec(10000);

        n = in.nextInt();
        graph = buildGraph(in, n, n-1);
        ord = new int[n];
        oi = 0;
        dfsord(0, -1);


        long[] pair2 = new long[n+10];
        pair2[0] = 1;

        long mul = 1;
        for (int i = 2 ; i < n+10 ; i += 2) {
            mul *= comb(i, 2);
            mul %= MOD;
            pair2[i] = mul * _invfact[i/2] % MOD;
        }

        // debug(ord);
        // debug(pair2);

        dp = new long[n][][];
        for (int i = n-1 ; i >= 0 ; i--) {
            int now = ord[i];

            long[][] c = new long[2][2];
            c[0][1] = 1;

            for (int to : graph[now]) {
                if (dp[to] != null) {
                    c = merge(c, dp[to]);
                }
            }

            for (int p = 0 ; p <= 1 ; p++) {
                for (int w = 2 ; w < c[0].length ; w += 2) {
                    c[p^1][0] += c[p][w] * pair2[w];
                    c[p^1][0] %= MOD;
                }
            }
            dp[now] = c;
        }

        out.println((dp[0][1][0] - dp[0][0][0] + MOD) % MOD);
        out.flush();
    }

    static long[][] merge(long[][] a, long[][] b) {
        int al = a[0].length;
        int bl = b[0].length;
        long[][] ret = new long[2][al+bl-1];

        for (int ap = 0; ap < 2 ; ap++) {
            for (int bp = 0; bp < 2 ; bp++) {
                for (int ai = 0; ai < al ; ai++) {
                    for (int bi = 0; bi < bl; bi++) {
                        ret[ap^bp][ai+bi] += a[ap][ai] * b[bp][bi];
                        ret[ap^bp][ai+bi] %= MOD;
                    }
                }
            }
        }
        return ret;
    }

    static void dfsord(int now, int par) {
        ord[oi++] = now;
        for (int to : graph[now]) {
            if (to == par) {
                continue;
            }
            dfsord(to, now);
        }
    }

    static int n;
    static int[][] graph;
    static long[][][] dp;
    static long[] r;
    static int[] ord;
    static int oi;

    static long pow(long a, long x) {
        long res = 1;
        while (x > 0) {
            if (x % 2 != 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            x /= 2;
        }
        return res;
    }

    static long inv(long a) {
        return pow(a, MOD - 2) % MOD;
    }

    static long[] _fact;
    static long[] _invfact;

    static long comb(long ln, long lr) {
        int n = (int) ln;
        int r = (int) lr;
        if (n < 0 || r < 0 || r > n) {
            return 0;
        }
        if (r > n / 2) {
            r = n - r;
        }
        return (((_fact[n] * _invfact[n - r]) % MOD) * _invfact[r]) % MOD;
    }

    static void prec(int n) {
        _fact = new long[n + 1];
        _invfact = new long[n + 1];
        _fact[0] = 1;
        _invfact[0] = 1;
        for (int i = 1; i <= n; i++) {
            _fact[i] = _fact[i - 1] * i % MOD;
            _invfact[i] = inv(_fact[i]);
        }
    }

    static int[][] buildGraph(InputReader in, int n, int m) {
        int[][] edges = new int[m][];
        int[][] graph = new int[n][];
        int[] deg = new int[n];
        for (int i = 0 ; i < m ; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            deg[a]++;
            deg[b]++;
            edges[i] = new int[]{a, b};
        }
        for (int i = 0 ; i < n ; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0 ; i < m ; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph[a][--deg[a]] = b;
            graph[b][--deg[b]] = a;
        }
        return graph;
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