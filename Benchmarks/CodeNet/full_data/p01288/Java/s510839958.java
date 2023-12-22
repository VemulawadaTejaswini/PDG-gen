import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, Q;
    static int[] A, B;
    static char[] T;
    static int[] V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        while(true) {
            N = sc.nextInt();
            Q = sc.nextInt();
            if( N == 0 ) break;

            int[] P = sc.nextIntArray(N-1, -1);
            A = new int[N-1];
            B = new int[N-1];
            for (int i = 0; i < N - 1; i++) {
                A[i] = P[i];
                B[i] = i+1;
            }

            T = new char[Q];
            V = new int[Q];
            for (int i = 0; i < Q; i++) {
                T[i] = sc.next().charAt(0);
                V[i] = sc.nextInt()-1;
            }

            System.out.println( solve() );
        }
    }

    static long solve() {
        int[][] G = adjB(N, A, B);
        int[][] LR = eularPath(N, G, 0);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(LR[i][0], i);
        }
        RangeUpdate seg = new RangeUpdate(N*2, RangeUpdate.MAX);
        long ans = 0;
        for (int i = 0; i < Q; i++) {
            char t = T[i];
            int v = V[i];
            int l = LR[v][0];
            int r = LR[v][1];
            if( t == 'Q' ) {
                int mal = (int)seg.get(l);
                int ma = map.get(mal);
                ans += (ma+1);

            } else {
                seg.update(l, r+1, l);
            }
        }
        return ans;
    }

    static int[][] eularPath(int N, int[][] G, int root) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int[][] ret = new int[N][2];
        int idx = 0;
        q.add(new int[]{-1, root, 0});
        while (!q.isEmpty()) {
            int[] s = q.poll();
            int p = s[0];
            int a = s[1];
            int lr = s[2];

            ret[a][lr] = idx++;
            if (lr == 0) { // left
                q.addFirst(new int[]{p, a, 1});
                for (int b : G[a]) {
                    if (b == p) continue;

                    q.addFirst(new int[]{a, b, 0});
                }
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

    static class RangeUpdate {
        interface Monoid {
            long identity();
            long apply(long a, long b);
        }

        static Monoid SUM = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return a + b; }
        };

        static Monoid MAX = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return Math.max(a, b); }
        };

        static Monoid MIN = new Monoid() {
            public long identity() { return Long.MAX_VALUE / 2; }
            public long apply(long a, long b) { return Math.min(a, b); }
        };

        int size;
        long[] tree;
        Monoid m;
        long identity;

        RangeUpdate(int size, Monoid m) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.tree = new long[this.size*2];
            this.m = m;
            this.identity = m.identity();
            if( this.identity != 0 ) {
                Arrays.fill(this.tree, this.identity);
            }
        }

        // [from, to)
        void update(int from, int to, long v) {
            _update(from, to, 1, 0, size, v);
        }

        void _update(int from, int to, int idx, int l, int r, long v) {
            if (from <= l && r <= to) {
                tree[idx] = m.apply(tree[idx], v);
                return;
            }

            int mid = (l+r)/2;
            if (from < mid) _update(from, to, idx*2, l, mid, v);
            if (mid < to) _update(from, to, idx*2+1, mid, r, v);
        }

        long get(int idx) {
            long ret = identity;
            idx += size;
            while( idx > 0 ) {
                ret = m.apply(tree[idx], ret);
                idx /= 2;
            }
            return ret;
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

