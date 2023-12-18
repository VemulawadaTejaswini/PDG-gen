import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static long N;
    static int M, Q;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextLong();
        M = sc.nextInt();
        Q = sc.nextInt();
        A = new int[Q];
        for (int i = 0; i < Q; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    static long solve() {
        if( M % 7 != 0 ) {
            int[] B = new int[Q * 7];

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < Q; j++) {
                    B[i*Q + j] = A[j] + i*M;
                }
            }

            M *= 7;
            Q *= 7;
            A = B;
        }

//        System.out.println(N + " " + M + " " + Q);
//        System.out.println( Arrays.toString(A) );

        int c1 = count(1);
        int c2 = count(2);

        // c1 = a + b
        // c2 = 2a + b
        int a = c2 - c1;
        int b = c1 - a;

        return (long)a * (N / (M/7)) + b;
    }

    static int count(int z) {
        boolean[][] marked = new boolean[z*M/7][7];

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < Q; j++) {
                int a = A[j];
                int week = (a + i*M) / 7;
                int day = (a + i*M) % 7;
                marked[week][day] = true;
            }
        }

//        System.out.println();
//        for (boolean[] bool : marked) {
//            System.out.println( Arrays.toString(bool) );
//        }

        int lastWeek = z * M / 7 - 1;
        UnionFind uf = new UnionFind( z * M );
        for (int i = 0; i < z * M; i++) {
            int week = i / 7;
            int day = i % 7;

            if( day != 6 ) {
                unite(uf, marked, week, day, week, day+1);
            }

            if( week != lastWeek ) {
                unite(uf, marked, week, day, week+1, day);
            }
        }

        Set<Integer> uniq = new HashSet<>();
        for (int i = 0; i < z * M; i++) {
            int week = i / 7;
            int day = i % 7;

            if( !marked[week][day] ) {
                uniq.add( uf.root(i) );
            }
        }
        return uniq.size();
    }

    static void unite(UnionFind uf, boolean[][] marked, int w1, int d1, int w2, int d2) {
        if( !marked[w1][d1] && !marked[w2][d2] ) {
            uf.unite( w1 * 7 + d1, w2 * 7 + d2);
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
