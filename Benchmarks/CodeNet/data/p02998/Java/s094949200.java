import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            Cord c = new Cord(i, sc.nextInt()-1, sc.nextInt()-1);
            C[i] = c;
        }

        System.out.println(solve());
    }

    static long solve() {
        Cord[] XS = new Cord[100_000];
        Cord[] YS = new Cord[100_000];
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < N; i++) {
            Cord c = C[i];
            if( XS[c.x] != null ) {
                uf.unite(c.i, XS[c.x].i);
            }
            if( YS[c.y] != null ) {
                uf.unite(c.i, YS[c.y].i);
            }

            XS[c.x] = c;
            YS[c.y] = c;
        }

        Map<Integer, Group> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int r = uf.root(i);
            if( !map.containsKey(r) ) {
                map.put(r, new Group(i));
            }
            Group g = map.get(r);
            g.add(C[i]);
        }

        long ans = 0;
        for (Group group : map.values()) {
            if( group.xs.size() == 1 || group.ys.size() == 1 ) continue;

            long xy = (long)group.xs.size() * group.ys.size();
            ans += xy - group.cnt;
        }
        return ans;
    }

    static class Group {
        int root;
        Set<Integer> xs = new HashSet<>();
        Set<Integer> ys = new HashSet<>();
        int cnt = 0;

        Group(int root) {
            this.root = root;
        }

        void add(Cord c) {
            xs.add(c.x);
            ys.add(c.y);
            cnt++;
        }
    }

    static class UnionFind {

        private final int[] parent;
        private final int[] count;

        public UnionFind(int n) {
            parent = new int[n];
            count = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                count[i] = 1;
            }
        }

        public int root(int i) {
            if (parent[i] == i) {
                return i;
            } else {
                return parent[i] = root(parent[i]);
            }
        }

        public int unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if (ri == rj) return ri;


            int big = count[ri] < count[rj] ? rj : ri;
            int small = big == ri ? rj : ri;
            parent[small] = big;
            count[big] += count[small];
            return big;
        }

        public int count(int a) {
            return count[root(a)];
        }

        public boolean isSame(int a, int b) {
            return root(a) == root(b);
        }
    }

    static class Cord {
        int i, x, y;

        public Cord(int i, int x, int y) {
            this.i = i;
            this.x = x;
            this.y = y;
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
