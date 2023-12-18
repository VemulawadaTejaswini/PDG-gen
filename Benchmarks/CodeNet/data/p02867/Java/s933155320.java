import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(N);

        System.out.println(solve() ? "Yes" : "No");
    }

    static boolean solve() {
        // 何をどうやっても駄目なケースは除外する
        if( !canMap() ) return false;

        // 交換するグループが二つ以上になる場合はok
        PriorityQueue<Integer> qa = new PriorityQueue<>(Comparator.comparingInt(i -> A[i]));
        PriorityQueue<Integer> qb = new PriorityQueue<>(Comparator.comparingInt(i -> B[i]));
        UnionFind uf = new UnionFind(N);
        PriorityQueue<Integer>[] availables = new PriorityQueue[N];
        for (int i = 0; i < N; i++) {
            qa.add(i);
            qb.add(i);
            availables[i] = new PriorityQueue<>();
        }

        for (int i = 0; i < N; i++) {
            int bi = qb.poll();
            int b = B[bi];

            if( uf.root(bi) == bi ) {
                // グループに参加していないので新たにグループを作る
                int ai = qa.poll();
                int a = A[ai];

                // 想定外
                if( a > b ) throw new RuntimeException("wtf");

                uf.unite(ai, bi);

                // qにいれておく
                PriorityQueue<Integer> q = availables[uf.root(bi)];
                q.add( A[ai] );
                q.add( A[bi] );
                q.poll();

            } else {
                // グループに参加済みなのでグループ内部で解決できたら解決する、そうでなかったら消費する
                PriorityQueue<Integer> q = availables[uf.root(bi)];
                if( q.peek() <= b ) {
                    q.poll();

                } else {
                    int ai = qa.poll();
                    int a = A[ai];
                    if( a > b ) throw new RuntimeException("wtf");

                    uf.unite(ai, bi);
                }
            }
        }

        Set<Integer> groups = new HashSet<>();
        for (int i = 0; i < N; i++) {
            groups.add( uf.root(i) );
        }

        debug(groups.size());

        return groups.size() > 1;
    }

    static boolean canMap() {
        int[] C = Arrays.copyOf(A, N);
        int[] D = Arrays.copyOf(B, N);
        Arrays.sort(C);
        Arrays.sort(D);

        for (int i = 0; i < N; i++) {
            if( C[i] > D[i] ) return false;
        }
        return true;
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
