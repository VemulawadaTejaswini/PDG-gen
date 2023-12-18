import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A, B;
    static int K;
    static int[] V, P;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new int[N-1];
        B = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }
        K = sc.nextInt();
        V = new int[K];
        P = new int[K];
        for (int i = 0; i < K; i++) {
            V[i] = sc.nextInt()-1;
            P[i] = sc.nextInt();
        }

        int[] ans = solve();
        if( ans != null ) {
            System.out.println("Yes");
            writeLines(ans);
        } else {
            System.out.println("No");
        }
    }

    static int[] solve() {
        int[][] G = adjB(N, A, B);
        if( !checkParity(G) ) {
            return null;
        }

        int[][] cond = new int[N][];
        for (int i = 0; i < K; i++) {
            cond[V[i]] = new int[]{P[i], P[i]};
        }

        for (Node node : orderFromLeaf(N, G, 0)) {

            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;

            for (int b : G[node.a]) {
                if( b == node.parent ) continue;

                if( cond[b] != null ) {
                    min = Math.max(min, cond[b][0]-1);
                    max = Math.min(max, cond[b][1]+1);
                }
            }
            if( max < min ) return null;

            if( cond[node.a] != null ) {
                // check
                if( min != Integer.MIN_VALUE ) {
                    int p = cond[node.a][0];
                    if( p < min || max < p ) return null;
                }

            } else {
                // set
                if( min != Integer.MIN_VALUE ) {
                    cond[node.a] = new int[]{min, max};
                }
            }
        }

        int[] ans = new int[N];
        for (Node node : orderFromRoot(N, G, 0)) {
            if( cond[node.a] == null ) {
                ans[node.a] = ans[node.parent] + 1; // 何でもよい

            } else {
                int min = cond[node.a][0];
                int max = cond[node.a][1];
                if( node.a == 0 ) {
                    ans[node.a] = min;

                } else {
                    int parent = ans[node.parent];
                    if( min <= parent - 1 && parent -1 <= max ) {
                        ans[node.a] = parent - 1;
                    } else {
                        ans[node.a] = parent + 1;
                    }
                }
            }
        }

        return ans;
    }

    static boolean checkParity(int[][] G) {
        int[] parity = new int[N];
        for (int i = 0; i < K; i++) {
            parity[V[i]] = P[i] % 2 == 0 ? 2 : 1;
        }
        for (Node node : orderFromLeaf(N, G, 0)) {

            int p = 0;
            for (int b : G[node.a]) {
                if( b == node.parent ) continue;
                if( parity[b] == 0 ) continue;

                if( p == 0 ) {
                    p = parity[b];

                } else {
                    if( p != parity[b] ) {
                        return false;
                    }
                }
            }
            parity[node.a] = p;
        }
        return true;
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
            else if ( arg != null ) j.add(arg.toString());
            else j.add("null");
        }
        System.err.println(j.toString());
    }
}
