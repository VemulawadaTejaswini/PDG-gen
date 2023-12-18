import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static Info[] INFO;

    static class Info {
        int L;
        int R;
        int D;

        public Info(int l, int r, int d) {
            L = l;
            R = r;
            D = d;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        INFO = new Info[M];
        for (int i = 0; i < M; i++) {
            INFO[i] = new Info(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    private static String solve() {
        if( M == 0 ) return "Yes";

        List<Node>[] rin = new List[N+1];
        for (int i = 1; i <= N; i++) {
            rin[i] = new ArrayList<>();
        }
        UnionFind uf = new UnionFind(N);

        for (Info info : INFO) {
            rin[info.L].add(new Node(info.R, info.D));
            rin[info.R].add(new Node(info.L, -info.D));
            uf.unite(info.L - 1, info.R -1);
        }

        Set<Integer> roots = new HashSet<>();
        for (int i = 0; i < N; i++) {
            roots.add( uf.root(i) + 1 );
        }

        int[] xs = new int[N+1];
        Arrays.fill(xs, Integer.MAX_VALUE);
        for (int root : roots) {
            xs[root] = 0;
            ArrayDeque<Node> q = new ArrayDeque<>();
            q.addLast(new Node(root, 0));

            while(!q.isEmpty()) {
                Node node = q.poll();

                // この辺で判定できる場合もあるだろうが、最終的に確認するので気にしない
                for (Node next : rin[node.n]) {
                    if( xs[next.n] == Integer.MAX_VALUE ) {
                        xs[next.n] = xs[node.n] + next.d;
                        q.addLast( next );
                    }
                }
            }
        }

        for (Info info : INFO) {
            int l = xs[info.L];
            int r = xs[info.R];

            if( r - l != info.D ) return "No";
        }
        return "Yes";
    }

    private static class Node {
        private int n;
        private int d;

        public Node(int n, int d) {
            this.n = n;
            this.d = d;
        }
    }

    static class UnionFind {

        private final int[] parent;
        private final int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int root(int i) {
            if( parent[i] == i ) {
                return i;
            } else {
                return parent[i] = root(parent[i]);
            }
        }

        public void unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if( ri == rj ) return;

            if( rank[ri] < rank[rj] ) {
                parent[ri] = rj;

            } else {
                parent[rj] = ri;
                if( rank[ri] == rank[rj] ) {
                    rank[ri]++;
                }
            }
        }

        public boolean isSame(int a, int b) {
            return root(a) == root(b);
        }
    }

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

        double nextDouble() {
            return Double.parseDouble(next());
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
