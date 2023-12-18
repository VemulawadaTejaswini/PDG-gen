import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, M;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int E = N+M-1;
        A = new int[E];
        B = new int[E];
        for (int i = 0; i < E; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }

        PrintWriter pw = new PrintWriter(System.out);
        int[] ans = solve();
        for (int i = 0; i < N; i++) {
            pw.println(ans[i]);
        }
        pw.flush();
    }

    static int[] solve() {
        int[][] G = adjD(N, A, B);
        int[] topo = khan(N, G);
        int root = topo[0];
        int[] rank = new int[N];
        rank[root] = 0;
        for (int v : topo) {
            for (int child : G[v]) {
                rank[child] = rank[v]+1;
            }
        }

        int[][] F = adjD(N, B, A);
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            if( i == root ) {
                ans[i] = 0;
            } else {
                int maxRank = -1;
                int parent = -1;
                for (int each : F[i]) {
                    if( maxRank < rank[each] ) {
                        maxRank = rank[each];
                        parent = each;
                    }
                }
                ans[i] = parent+1;
            }
        }
        return ans;
    }

    static Node[] orderFromRoot(int N, int[][] G, int root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        Node[] ret = new Node[N];
        int idx = 0;
        q.add(new Node(-1, root));
        while(!q.isEmpty()) {
            Node n = q.poll();
            ret[idx++] = n;
            for (int next : G[n.a]) {
                if( next == n.parent ) continue;

                q.add(new Node(n.a, next));
            }
        }
        return ret;
    }

    static class Node {
        int parent, a;

        public Node(int parent, int a) {
            this.parent = parent;
            this.a = a;
        }
    }

    static class Edge {
        final int a, b;

        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int opposite(int x) {
            return a == x ? b : a;
        }
    }

    static int[][] adjD(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
        }
        return adj;
    }

    static int[] khan(int V, int[][] G) {
        int[] deg = new int[V];
        for (int[] tos : G) {
            for (int to : tos) {
                deg[to]++;
            }
        }

        int[] q = new int[V];
        int a = 0, b = 0;
        for (int v = 0; v < V; v++) {
            if( deg[v] == 0 ) q[b++] = v;
        }

        int[] ret = new int[V];
        int idx = 0;
        while( a != b ) {
            int v = q[a++];
            ret[idx++] = v;
            for (int to : G[v]) {
                deg[to]--;
                if( deg[to] == 0 ) {
                    q[b++] = to;
                }
            }
        }

        for (int v = 0; v < V; v++) {
            if( deg[v] != 0 ) return null;
        }
        return ret;
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
