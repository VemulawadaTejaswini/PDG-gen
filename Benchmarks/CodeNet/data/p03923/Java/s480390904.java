// package atcoder.other2016.codefestival2016.finale;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
    private static final long INF = (long)1e18;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong();
        long a = in.nextLong();


        out.println(dfs(n, a));
        out.flush();
    }

    static Map<Long,Long> memo = new HashMap<>();

    static long dfs(long n, long a) {
        long res = n;
        long min = 2;
        long max = (long)Math.sqrt(n)+1;
        if (max <= min) {
            return res;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        for (int f = 0 ; f < 100 ; f++) {
            long m1 = (min * 2 + max) / 3;
            long m2 = (min + max * 2) / 3;
            long res1 = m1 + a + dfs((n + m1 - 1) / m1, a);
            long res2 = m2 + a + dfs((n + m2 - 1) / m2, a);
            res = Math.min(res, res1);
            res = Math.min(res, res2);
            if (res1 < res2) {
                max = m2;
            } else {
                min = m1;
            }
        }

        memo.put(n, res);
        return res;
    }

    static Map<Long,Long> canLimit = new HashMap<>();
    static Map<Long,Long> cannotLimit = new HashMap<>();

    private static boolean canMake(long limit, long n, long a) {
        if (limit >= n) {
            return true;
        }
        if (n <= canLimit.getOrDefault(limit, 0L)) {
            return true;
        }
        if (n >= cannotLimit.getOrDefault(limit, INF)) {
            return false;
        }

        for (long step = 2 ; step * step <= n ; step++) {
            long up = limit;
            long target = n;
            while (true) {
                long lean = (target+step-1)/step;
                if (lean == 1) {
                    return true;
                }
                up -= a;
                up -= step;
                if (up < 0) {
                    break;
                }
                if (canMake(up, lean, a)) {
                    canLimit.put(limit, n);
                    return true;
                }
            }
        }
        cannotLimit.put(limit, n);
        return false;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int[] nextInts(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        private int[][] nextIntTable(int n, int m) {
            int[][] ret = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextInt();
                }
            }
            return ret;
        }

        private long[] nextLongs(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        private long[][] nextLongTable(int n, int m) {
            long[][] ret = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextLong();
                }
            }
            return ret;
        }

        private double[] nextDoubles(int n) {
            double[] ret = new double[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextDouble();
            }
            return ret;
        }

        private int next() {
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

        public char nextChar() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            if ('a' <= c && c <= 'z') {
                return (char) c;
            }
            if ('A' <= c && c <= 'Z') {
                return (char) c;
            }
            throw new InputMismatchException();
        }

        public String nextToken() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public long nextLong() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
