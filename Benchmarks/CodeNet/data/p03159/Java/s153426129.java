import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;
    static int[] U, V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        U = new int[N-1];
        V = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            U[i] = sc.nextInt()-1;
            V[i] = sc.nextInt()-1;
        }

        System.out.println(solve());
    }

    static long INF = Long.MAX_VALUE / 2;
    static int ROOT = 0;

    static int solve() {
        // バッテリーだけ
        // (v, cut) => 最小値
        long[][] dp = new long[N][];

        // コンピューター含む
        // (v, cut) => 最小値
        long[][] dp2 = new long[N][];

        // v -> カット数の容量
        int[] dp3 = new int[N];

        int[][] G = adjB(N, U, V);
        for (Node node : orderFromLeaf(N, G, ROOT)) {
            merge(node, G, dp, dp2, dp3);
        }

        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if( dp[ROOT][i] != INF ) {
                ret = Math.min(i, ret);
            }
            if( dp2[ROOT][i] != INF && dp2[ROOT][i] < 0) {
                ret = Math.min(i, ret);
            }
        }
        return ret;
    }

    static void merge(Node node, int[][] G, long[][] dp, long[][] dp2, int[] dp3) {
        dp[node.a] = new long[]{INF};
        dp2[node.a] = new long[]{INF};
        if( A[node.a] > 0 ) {
            dp[node.a][0] = A[node.a];
        } else {
            dp2[node.a][0] = A[node.a];
        }
        int c = 1;
        for (int next : G[node.a]) {
            if( node.parent == next ) continue;

            long[] tdp = new long[c+dp3[next]];
            Arrays.fill(tdp, INF);
            long[] tdp2 = new long[c+dp3[next]];
            Arrays.fill(tdp2, INF);

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < dp3[next]; j++) {
                    // バ + バ = バ
                    if( dp[node.a][i] != INF && dp[next][j] != INF ) {
                        tdp[i+j] = Math.min(dp[node.a][i] + dp[next][j], tdp[i+j]);
                    }

                    // バ + コ = コ
                    if( dp[node.a][i] != INF && dp2[next][j] != INF ) {
                        long sum = dp[node.a][i] + dp2[next][j];
                        tdp2[i+j] = Math.min(sum, tdp2[i+j]);
                    }
                    if( dp2[node.a][i] != INF && dp[next][j] != INF ) {
                        long sum = dp2[node.a][i] + dp[next][j];
                        tdp2[i+j] = Math.min(sum, tdp2[i+j]);
                    }

                    // コ + コ = コ
                    if( dp2[node.a][i] != INF && dp2[next][j] != INF ) {
                        tdp2[i+j] = Math.min(dp2[node.a][i] + dp2[next][j], tdp2[i+j]);
                    }

                    // cutする
                    if( dp[node.a][i] != INF && (dp[next][j] != INF || dp2[next][j] != INF && dp2[next][j] < 0) ) {
                        tdp[i+j+1] = Math.min(dp[node.a][i], tdp[i+j+1]);
                    }
                    if( dp2[node.a][i] != INF && (dp[next][j] != INF || dp2[next][j] != INF && dp2[next][j] < 0)) {
                        tdp2[i+j+1] = Math.min(dp2[node.a][i], tdp2[i+j+1]);
                    }
                }
            }

            dp[node.a] = tdp;
            dp2[node.a] = tdp2;
            c += dp3[next];
        }
        dp3[node.a] = c;
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

    static Node[] orderFromLeaf(int N, int[][] G, int root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        Node[] ret = new Node[N];
        int idx = N-1;
        q.add(new Node(-1, root));
        while(!q.isEmpty()) {
            Node n = q.poll();
            ret[idx--] = n;
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
