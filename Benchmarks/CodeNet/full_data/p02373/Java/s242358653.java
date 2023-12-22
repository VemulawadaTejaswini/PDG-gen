import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] G;
    static int Q;
    static int[] U;
    static int[] V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        G = new int[N][];
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            G[i] = sc.nextIntArray(k);
        }
        Q = sc.nextInt();
        U = new int[Q];
        V = new int[Q];
        for (int i = 0; i < Q; i++) {
            U[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : solve()) {
            pw.println(i);
        }
        pw.flush();
    }

    static int[] solve() {
        LCA lca = new LCA(N);
        lca.init(0, G);

        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            ans[i] = lca.apply(U[i], V[i]);
        }
        return ans;
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

        void init(int root, int[][] G) {
            bfs(root, G);

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

        private void bfs(int root, int[][] G) {
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

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

