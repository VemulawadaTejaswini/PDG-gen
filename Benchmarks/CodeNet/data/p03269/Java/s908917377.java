// package arc.arc102;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int l = in.nextInt();


        int[] v = new int[21];
        int vi = 1;
        List<int[]> edges = new ArrayList<>();

        int now = 1;
        while (now * 2 <= l) {
            now *= 2;
            v[vi] = now-1;
            edges.add(new int[]{vi-1, vi, 0});
            edges.add(new int[]{vi-1, vi, now/2});
            vi++;
        }

        if (v[vi-1] == l-1) {
            // ok
        } else {
            int fin = vi-1;
            int want = l-1-v[vi-1];
            debug(want);
            // edges.add(new int[]{fin-1, fin, want});
            for (int[] e : edges) {
                if (e[0] == fin-1 && e[1] == fin) {
                    e[2] += want;
                }
            }

            // 0-want-1
            for (int k = fin-1 ; k >= 0 ; k--) {
                int wo = 1<<k;
                if (want >= wo) {
                    edges.add(new int[]{k, fin, want-wo});
                    want -= wo;
                }
                if (want == 0) {
                    break;
                }
            }
        }
        checkAndPrint(out, edges, l);
    }

    private static void checkAndPrint(PrintWriter out, List<int[]> edges, int L) {
        int n = 0;
        for (int[] e : edges) {
            n = Math.max(n, e[0]);
            n = Math.max(n, e[1]);
            if (e[0] >= e[1]) {
                throw new RuntimeException("wrong edge");
            }
        }
        n++;

        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < n ; i++) {
            for (int[] e : edges) {
                if (e[0] == i) {
                    dp[e[1]] += dp[i];
                }
            }
        }

        if (dp[n-1] != L) {
            throw new RuntimeException("wrong answer:" + String.format("expected: %d / actual : %d", L, dp[n-1]));
        }

        out.println(String.format("%d %d", n, edges.size()));
        for (int[] e : edges) {
            out.println(String.format("%d %d %d", e[0]+1, e[1]+1, e[2]));
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