import java.io.*;
import java.util.*;

public class Main {

    static int N, Q;
    static Edge[] E;
    static Kuery[] K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        E = new Edge[N-1];
        for (int i = 0; i < N - 1; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), sc.nextInt());
        }
        K = new Kuery[Q];
        for (int i = 0; i < Q; i++) {
            K[i] = new Kuery(sc.nextInt(), sc.nextInt(), sc.nextInt()-1, sc.nextInt()-1);
        }

        writeLines(solve());
    }

    static int[] solve() {
        int[] A = new int[N-1], B = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = E[i].a;
            B[i] = E[i].b;
        }
        int[][] G = adjB(N, A, B);
        Edge[][] EG = adjB(N, E);

        LCA lca = new LCA(N);
        lca.init(0, G);

        // query先読みをして必要な場所を出しておく
        // node -> [color]
        Set<Integer>[] req = new Set[N];
        for (int i = 0; i < N; i++) {
            req[i] = new HashSet<>();
        }
        for (int i = 0; i < Q; i++) {
            Kuery k = K[i];
            k.s = lca.apply(k.u, k.v); // もったいないのでためておく
            req[k.u].add(k.c);
            req[k.v].add(k.c);
            req[k.s].add(k.c);
        }

        // 必要な場所に必要なデータをためる
        int[] nodeDist = new int[N];
        Map<Integer, Integer>[] nodeColorCnt = new Map[N];
        Map<Integer, Integer>[] nodeColorDist = new Map[N];
        // dfsの作りがアレなのでroot分はここでためる

        dfs(-1, 0, EG, 0, new HashMap<>(), new HashMap<>(), req, nodeDist, nodeColorCnt, nodeColorDist);

        // 貯めたデータで計算する
        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            Kuery q = K[i];

            int uvDist = nodeDist[q.u] + nodeDist[q.v] - nodeDist[q.s] * 2;
            int uvColorCnt = nodeColorCnt[q.u].get(q.c) + nodeColorCnt[q.v].get(q.c) - nodeColorCnt[q.s].get(q.c) * 2;
            int uvColorDist = nodeColorDist[q.u].get(q.c) + nodeColorDist[q.v].get(q.c) - nodeColorDist[q.s].get(q.c) * 2;

            ans[i] = uvDist - uvColorDist + uvColorCnt * q.d;
        }

        return ans;
    }

    // オイラーツアーの気持ちで足したり引いたりする
    // javaなのでstackOverFlowの可能性があるがまぁatcoderなので死なないだろ…
    //   死んだらthread立ててmemory指定するやつでなんとかなる、はず
    static void dfs(int parent, int a, Edge[][] G, int dist, Map<Integer, Integer> cCnt, Map<Integer, Integer> cDist, Set<Integer>[] req, int[] nodeDist, Map<Integer, Integer>[] nodeColorCnt, Map<Integer, Integer>[] nodeColorDist) {
        nodeDist[a] = dist;
        if( !req[a].isEmpty() ) {
            nodeColorCnt[a] = new HashMap<>();
            nodeColorDist[a] = new HashMap<>();
        }
        for (Integer color : req[a]) {
            nodeColorCnt[a].put(color, cCnt.getOrDefault(color, 0));
            nodeColorDist[a].put(color, cDist.getOrDefault(color, 0));
        }

        for (Edge e : G[a]) {
            int b = e.a == a ? e.b : e.a;
            if( b == parent ) continue;

            // 足して
            dist += e.d;
            add(cCnt, e.c, 1);
            add(cDist, e.c, e.d);

            // dfsして
            dfs(a, b, G, dist, cCnt, cDist, req, nodeDist, nodeColorCnt, nodeColorDist);

            // 引く
            dist -= e.d;
            add(cCnt, e.c, -1);
            add(cDist, e.c, -e.d);
        }
    }

    static void add(Map<Integer, Integer> map, int key, int add) {
        if( map.containsKey(key) ) {
            map.put(key, map.get(key) + add);
        } else {
            map.put(key, add);
        }
    }

    static class LCA {

        final int V;
        final int LOG_V;
        final int[][] parent;
        final int[] depth;

        public LCA(int V) {
            this.V = V;
            this.LOG_V = Integer.numberOfTrailingZeros(Integer.highestOneBit(V - 1)) + 1;
            this.parent = new int[LOG_V][V];
            this.depth = new int[V];
        }

        // root一つ用
        // 森な場合は initTree*N -> initDoubling と呼ぶ
        void init(int root, int[][] G) {
            initTree(root, G);
            initDoubling();
        }

        void initDoubling() {
            for (int k = 0; k+1 < LOG_V; k++) {
                for (int v = 0; v < V; v++) {
                    if( parent[k][v] < 0 ) {
                        parent[k+1][v] = -1;
                    } else {
                        parent[k+1][v] = parent[k][parent[k][v]];
                    }
                }
            }
        }

        void initTree(int root, int[][] G) {
            ArrayDeque<State> q = new ArrayDeque<>();
            q.add( new State(root, -1, 0) );

            while(!q.isEmpty()) {
                State state = q.poll();

                parent[0][state.v] = state.p;
                depth[state.v] = state.d;

                for (int i = 0; i < G[state.v].length; i++) {
                    if( G[state.v][i] != state.p ) {
                        q.add(new State(G[state.v][i], state.v, state.d+1));
                    }
                }
            }
        }

        static class State {
            int v, p, d;

            public State(int v, int p, int d) {
                this.v = v;
                this.p = p;
                this.d = d;
            }
        }

        int apply(int u, int v) {
            if( depth[u] > depth[v] ) {
                int t = u; u = v; v = t;
            }

            for (int k = 0; k < LOG_V; k++) {
                if(((depth[v] - depth[u]) >> k & 1) == 1) {
                    v = parent[k][v];
                }
            }
            if( u == v ) return u;

            for (int k = LOG_V-1; k >= 0; k--) {
                if( parent[k][u] != parent[k][v] ) {
                    u = parent[k][u];
                    v = parent[k][v];
                }
            }
            return parent[0][u];
        }
    }

    static class Kuery {
        int c, d, u, v;

        int s; // lca(u, v)

        public Kuery(int c, int d, int u, int v) {
            this.c = c;
            this.d = d;
            this.u = u;
            this.v = v;
        }
    }

    static class Edge {
        int a, b, c, d;

        public Edge(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }

    static int[][] adjB(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int t : to) {
            cnt[t]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
            adj[to[i]][--cnt[to[i]]] = from[i];
        }
        return adj;
    }

    static Edge[][] adjB(int n, Edge[] E) {
        Edge[][] adj = new Edge[n][];
        int[] cnt = new int[n];
        for (Edge e : E) {
            cnt[e.a]++;
            cnt[e.b]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new Edge[cnt[i]];
        }
        for (Edge e : E) {
            adj[e.a][--cnt[e.a]] = e;
            adj[e.b][--cnt[e.b]] = e;
        }
        return adj;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
