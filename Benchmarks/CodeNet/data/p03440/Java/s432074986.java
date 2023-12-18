import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] A;
    static int[] X;
    static int[] Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(N);
        X = new int[M];
        Y = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    static String solve() {
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            uf.unite(X[i], Y[i]);
        }

        int[] cnt = new int[N];
        for (int i = 0; i < N; i++) {
            cnt[uf.root(i)]++;
        }

        int G = 0;
        for (int i = 0; i < N; i++) {
            if( cnt[i] > 0 ) G++;
        }
        if( G == 1 ) {
            return "" + 0;
        }
        if( (G-1) * 2 > N ) {
            return "Impossible";
        }

        int[][] group = new int[N][];
        for (int i = 0; i < N; i++) {
            if( cnt[i] > 0 ) {
                group[i] = new int[cnt[i]];
            }
        }
        for (int i = 0; i < N; i++) {
            int root = uf.root(i);
            group[root][--cnt[root]] = A[i];
        }

        for (int i = 0; i < N; i++) {
            if( group[i] != null ) {
                Arrays.sort(group[i]);
            }
        }

        int[] tails = new int[N-G];
        int t = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if( group[i] != null ) {
                int[] costs = group[i];
                ans += costs[0];
                System.arraycopy(costs, 1, tails, t, costs.length-1);
                t += costs.length-1;
            }
        }

        Arrays.sort(tails);
        for (int i = 0; i < G - 2; i++) {
            ans += tails[i];
        }
        return "" + ans;
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
