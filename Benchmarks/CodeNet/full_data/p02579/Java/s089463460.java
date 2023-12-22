import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author tutuz on 2020/08/30
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskX solver = new TaskX();
        solver.solve(1, in, out);
        out.close();
    }

    static int INF = 1 << 30;
    static long LINF = 1L << 55;
    static int MOD = 1000000007;
    static int[] mh4 = {0, -1, 1, 0};
    static int[] mw4 = {-1, 0, 0, 1};
    static int[] mh8 = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] mw8 = {-1, 0, 1, -1, 1, -1, 0, 1};

    @SuppressWarnings("unchecked")
    static class TaskX {

        int H, W;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            H = in.nextInt();
            W = in.nextInt();
            Pair c = new Pair(in.nextInt() - 1, in.nextInt() - 1);
            Pair d = new Pair(in.nextInt() - 1, in.nextInt() - 1);

            char[][] s = in.next2DChars(H, W);
            int[][] si = new int[H][W];
            fill(si, -1);

            int num = 0;
            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (s[h][w] == '.' && si[h][w] == -1) {
                        bfs(h, w, s, si, num++);
                    }
                }
            }

            List<P>[] g = Stream.generate(ArrayList::new).limit(1010).toArray(List[]::new);

            boolean[][] done = new boolean[H][W];

            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (si[h][w] != -1) {
                        for (int i = -2; i <= 2; i++) {
                            for (int j = -2; j <= 2; j++) {
                                int nh = h + i;
                                int nw = w + j;
                                if (nh < 0 || nh >= H) continue;
                                if (nw < 0 || nw >= W) continue;
                                if (si[nh][nw] == -1) continue;
                                if (done[si[h][w]][si[nh][nw]]) continue;
                                if (done[si[nh][nw]][si[h][w]]) continue;
                                g[si[h][w]].add(new P(si[nh][nw], 1));
                                g[si[nh][nw]].add(new P(si[h][w], 1));
                                done[si[h][w]][si[nh][nw]] = true;
                                done[si[nh][nw]][si[h][w]] = true;
                            }
                        }
                    }
                }
            }

            int[] cost = dijkstra(si[c.first][c.second], g);
            out.println(cost[si[d.first][d.second]] == INF ? -1 : cost[si[d.first][d.second]]);
        }

        void bfs(int h, int w, char[][] s, int[][] si, int num) {
            Deque<Pair> q = new ArrayDeque<>();
            q.add(new Pair(h, w));

            while (!q.isEmpty()) {
                Pair p = q.removeFirst();
                si[p.first][p.second] = num;
                for (int i = 0; i < 4; i++) {
                    int nh = p.first + mh4[i];
                    int nw = p.second + mw4[i];
                    if (nh < 0 || nh >= H) continue;
                    if (nw < 0 || nw >= W) continue;
                    if (s[nh][nw] == '.' && si[nh][nw] == -1) {
                        q.addLast(new Pair(nh, nw));
                    }
                }
            }
        }

        int[] dijkstra(int from, List<P>[] g) {
            PriorityQueue<P> q = new PriorityQueue<>();
            int[] cost = new int[10000];
            Arrays.fill(cost, INF);
            cost[from] = 0;
            q.add(new P(from, cost[from]));

            while (!q.isEmpty()) {

                P pp = q.remove();
                if (pp.cost != cost[pp.node]) continue;
                for (P p : g[pp.node]) {
                    if (cost[pp.node] + p.cost < cost[p.node]) {
                        cost[p.node] = cost[pp.node] + p.cost;
                        q.add(new P(p.node, cost[p.node]));
                    }
                }

            }

            return cost;
        }

        class P implements Comparable<P> {
            int node, cost;

            public P(int node, int cost) {
                super();
                this.node = node;
                this.cost = cost;
            }

            @Override
            public String toString() {
                return "P [node=" + node + ", cost=" + cost + "]";
            }

            @Override
            public int compareTo(P o) {
                return Integer.compare(this.cost, o.cost);
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + node;
                result = prime * result + cost;
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                P other = (P) obj;
                if (node != other.node)
                    return false;
                if (cost != other.cost)
                    return false;
                return true;
            }
        }

        static class Pair {
            int first, second;

            public Pair(int first, int second) {
                super();
                this.first = first;
                this.second = second;
            }

            @Override
            public String toString() {
                return "P [first=" + first + ", second=" + second + "]";
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + first;
                result = prime * result + second;
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                Pair other = (Pair) obj;
                if (first != other.first)
                    return false;
                if (second != other.second)
                    return false;
                return true;
            }
        }
    }

    static void print(int[][] a, PrintWriter out) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (j > 0) out.print(" ");
                out.print(a[i][j]);
            }
            out.print("\n");
        }
    }

    static void fill(int[][] a, int v) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = v;
            }
        }
    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++)
                ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++)
                ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        public String nextString() {
            return new String(nextChars());
        }

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        public char[][] next2DChars(int h, int w) {
            char[][] s = new char[h][w];
            for (int i = 0; i < h; i++) {
                s[i] = nextChars();
            }
            return s;
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArray1Index(final int n) {
            final int[] res = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public long[] nextLongArray(final int n) {
            final long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArray1Index(final int n) {
            final long[] res = new long[n + 1];
            for (int i = 1; i < n + 1; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(final int n) {
            final long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public double nextDouble() {
            return Double.parseDouble(nextString());
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}
