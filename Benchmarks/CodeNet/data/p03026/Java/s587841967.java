import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A, B;
    static int[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new int[N-1];
        B = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }
        C = sc.nextIntArray(N);

        solve(new PrintWriter(System.out));
    }

    static void solve(PrintWriter out) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;
        for (int i = 0; i < N; i++) {
            q.add(C[i]);
            sum += C[i];
        }
        sum -= q.peek();
        out.println(sum);

        int[][] G = adjB(N, A, B);
        int root = findRoot(G);
        int[] ans = new int[N];
        for (Node node : order(N, G, root, true)) {
            ans[node.a] = q.poll();
        }

        StringJoiner j = new StringJoiner(" ");
        for (int i = 0; i < N; i++) {
            j.add(String.valueOf(ans[i]));
        }
        out.println(j.toString());
        out.flush();
    }

    // どこからでもいいような気もする...
    static int findRoot(int[][] G) {
        int ret = -1;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if( G[i].length > max ) {
                max = G[i].length;
                ret = i;
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

    static Node[] order(int N, int[][] G, int root, boolean fromRoot) {
        Node[] q = new Node[N];
        int u = 0, v = 0;
        Node[] ret = new Node[N];
        int idx = fromRoot ? 0 : N-1;
        int d = fromRoot ? 1 : -1;
        q[v++] = new Node(-1, root);
        while( u != v ) {
            Node n = q[u++];
            ret[idx] = n;
            idx += d;
            for (int b : G[n.a]) {
                if( b == n.parent ) continue;

                q[v++] = new Node(n.a, b);
            }
        }
        return ret;
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
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
