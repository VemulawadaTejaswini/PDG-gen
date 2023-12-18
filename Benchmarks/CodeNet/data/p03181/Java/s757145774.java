import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] X, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = new int[N-1];
        Y = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            X[i] = sc.nextInt()-1;
            Y[i] = sc.nextInt()-1;
        }

        writeLines(solve());
    }

    static long[] solve() {
        int root = 0;
        int[][] G = adjB(N, X, Y);
        long[] dp = new long[N];
        for (Node node : orderFromLeaf(N, G, root)) {
            long b = 1;
            for (int next : G[node.a]) {
                if( next != node.parent ) {
                    b *= dp[next]+1;
                    b %= M;
                }
            }
            dp[node.a] = b;
        }

        long[] ans = new long[N];
        long[][] cp = new long[N][]; // 累積積を利用した結果
        for (Node node : orderFromRoot(N, G, root)) {
            ans[node.a] = calcCp(node, dp, cp, G);
        }

        return ans;
    }

    static long calcCp(Node node, long[] dp, long[][] cp, int[][] G) {
        long p;
        if( node.parent < 0 ) {
            p = 1;
        } else {
            p = cp[node.parent][node.i];
        }

        int[] nodes = G[node.a];
        int n = nodes.length;
        long[] cp_l = new long[n+1];
        cp_l[0] = 1;
        for (int i = 0; i < n; i++) {
            int next = nodes[i];
            long v = next == node.parent ? p : dp[next];
            cp_l[i+1] = cp_l[i] * (v + 1);
            cp_l[i+1] %= M;
        }
        long[] cp_r = new long[n+1];
        cp_r[n] = 1;
        for (int i = n-1; i >= 0; i--) {
            int next = nodes[i];
            long v = next == node.parent ? p : dp[next];
            cp_r[i] = cp_r[i+1] * (v + 1);
            cp_r[i] %= M;
        }

        long[] cpcp = new long[n];
        for (int i = 0; i < n; i++) {
            cpcp[i] = cp_l[i] * cp_r[i+1] % M;
        }
        cp[node.a] = cpcp;
        return cp_r[0];
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

    static Node[] orderFromRoot(int N, int[][] G, int root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        Node[] ret = new Node[N];
        int idx = 0;
        q.add(new Node(-1, -1, root));
        while(!q.isEmpty()) {
            Node n = q.poll();
            ret[idx++] = n;
            for (int i = 0; i < G[n.a].length; i++) {
                int next = G[n.a][i];
                if( next == n.parent ) continue;

                q.add(new Node(n.a, i, next));
            }
        }
        return ret;
    }

    static Node[] orderFromLeaf(int N, int[][] G, int root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        Node[] ret = new Node[N];
        int idx = N-1;
        q.add(new Node(-1, -1, root));
        while(!q.isEmpty()) {
            Node n = q.poll();
            ret[idx--] = n;

            for (int i = 0; i < G[n.a].length; i++) {
                int next = G[n.a][i];
                if( next == n.parent ) continue;

                q.add(new Node(n.a, i, next));
            }
        }
        return ret;
    }

    static class Node {
        int parent, i, a;

        public Node(int parent, int i, int a) {
            this.parent = parent;
            this.i = i;
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
            pw.print(i);
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg == null ? "null" : arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(array[i]);
        }
        System.out.println();
    }

    static int lowerBound(int[] array, int value) {
        int low = 0, high = array.length, mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (array[mid] < value) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int upperBound(int[] array, int value) {
        int low = 0, high = array.length, mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (array[mid] <= value) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
