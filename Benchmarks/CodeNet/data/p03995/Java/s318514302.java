import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int H, W, N;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }

        System.out.println(solve() ? "Yes" : "No");
    }

    static class Cord {
        int r, c, a;

        public Cord(int r, int c, int a) {
            this.r = r;
            this.c = c;
            this.a = a;
        }
    }

    static boolean solve() {
        Arrays.sort(C, Comparator.<Cord>comparingInt(c -> c.r).thenComparingInt(c -> c.c));
        long UNDEF = Long.MAX_VALUE;
        UnionFind uf = new UnionFind(W);

        List<Edge> edges = new ArrayList<>();
        int idx = 0;
        for (int r = 0; r < H; r++) {
            while(idx < N-1 && C[idx].r == r ) {
                if( C[idx+1].r == r ) {
                    uf.unite(C[idx].c, C[idx+1].c);
                    edges.add( new Edge(C[idx].c, C[idx+1].c, C[idx+1].a - C[idx].a) );
                }
                idx++;
            }
        }

        Edge[][] G = adjD(W, edges);
        long[] DIFF = new long[W];
        Arrays.fill(DIFF, UNDEF);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int a = 0; a < W; a++) {
            if( G[a].length == 0 ) continue;
            if( DIFF[a] == UNDEF ) DIFF[a] = 0;

            for (Edge e : G[a]) {
                int b = e.a == a ? e.b : e.a;

                if( DIFF[b] == UNDEF ) {
                    DIFF[b] = DIFF[a] + e.d;
                } else if( DIFF[b] != DIFF[a] + e.d) {
                    return false;
                }
            }
        }

        // 連結のrootの中で最低
        long[] MIN_DIFF = new long[W];
        Arrays.fill(MIN_DIFF, UNDEF);
        for (int c = 0; c < W; c++) {
            if( DIFF[c] == UNDEF ) continue;
            int r = uf.root(c);
            MIN_DIFF[r] = Math.min(MIN_DIFF[r], DIFF[c]);
        }

        for (int i = 0; i < N; i++) {
            long sa = C[i].a - DIFF[C[i].c]; // 差
            int r = uf.root(C[i].c);

            if( MIN_DIFF[r] + sa < 0 ) {
                return false;
            }
        }

        return true;
    }

    static Edge[][] adjD(int n, List<Edge> es) {
        Edge[][] adj = new Edge[n][];
        int[] cnt = new int[n];

        for (Edge e : es) {
            cnt[e.a]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new Edge[cnt[i]];
        }
        for (Edge e : es) {
            adj[e.a][--cnt[e.a]] = e;
        }
        return adj;
    }

    static class Edge {
        int a, b;
        int d;

        public Edge(int a, int b, int d) {
            this.a = a;
            this.b = b;
            this.d = d;
        }
    }

    static class UnionFind {

        private final int[] parent;
        private final int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int root(int i) {
            if( parent[i] == i ) {
                return i;
            } else {
                return parent[i] = root(parent[i]);
            }
        }

        public int unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if( ri == rj ) return ri;

            if( rank[ri] < rank[rj] ) {
                parent[ri] = rj;
                return rj;

            } else {
                parent[rj] = ri;
                if( rank[ri] == rank[rj] ) {
                    rank[ri]++;
                }
                return ri;
            }
        }

        public boolean isSame(int a, int b) {
            return root(a) == root(b);
        }
    }


    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
