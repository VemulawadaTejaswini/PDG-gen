import java.io.*;
import java.util.*;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/E3";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        long l = in.nextLong();

        List<Edge>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1, b = in.nextInt() - 1, c = in.nextInt();
            g[a].add(new Edge(b, c));
            g[b].add(new Edge(a, c));
        }
        long[][] res = new long[n][];
        for (int s = 0; s < n; s++) {
            res[s] = calc(g, l, s);
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int s = in.nextInt() - 1;
            int t = in.nextInt() - 1;
            out.println(res[s][t]);
        }
        out.close();
    }

    private long[] calc(List<Edge>[] g, long l, int s) {
        int n = g.length;
        long INF = 1L << 60;
        long[][] dp = new long[n][n+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[s][0] = 0;
        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.add(new State(s, 0, l));

        int[] min = new int[n];
        Arrays.fill(min, n);
        while (!pq.isEmpty()) {
            State st = pq.poll();
            min[st.v] = Math.min(min[st.v], st.cost);
            for (Edge e : g[st.v]) {
                if (e.cost > st.rest || min[e.v] < st.cost) {
                    continue;
                }
                if (dp[e.v][st.cost] > st.rest - e.cost) {
                    dp[e.v][st.cost] = st.rest - e.cost;
                    pq.add(new State(e.v, st.cost, dp[e.v][st.cost]));
                }
                if (st.cost < n && dp[e.v][st.cost+1] > l) {
                    dp[e.v][st.cost+1] = l;
                    pq.add(new State(e.v, st.cost + 1, l));
                }
            }
        }
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
            for (int j = 0; j < n + 1; j++) {
                if (dp[i][j] != INF) {
                    res[i] = j;
                    break;
                }
            }
        }
        return res;
    }

    class State implements Comparable<State> {
        final int v;
        final int cost;
        final long rest;

        public State(int v, int cost, long rest) {
            this.v = v;
            this.cost = cost;
            this.rest = rest;
        }

        @Override
        public int compareTo(State o) {
            if (cost != o.cost) {
                return Integer.compare(cost, o.cost);
            } else {
                return Long.compare(o.rest, rest);
            }
        }
    }

    class Edge {
        final int v;
        final long cost;

        public Edge(int v, long cost) {
            this.v = v;
            this.cost = cost;
        }
    }

    /* MOD_CALCULATION */
    static int MOD = 998244353;

    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    static long POW(long a, long x) {
        long res = 1;
        for (; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    static long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
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

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
