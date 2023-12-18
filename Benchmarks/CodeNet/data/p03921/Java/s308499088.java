import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static Entry[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        E = new Entry[N];
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            E[i] = new Entry(k, sc.nextIntArray(k));
        }

        System.out.println( solve() ? "YES" : "NO" );
    }

    static class Entry {
        int K;
        int[] L;

        public Entry(int k, int[] l) {
            K = k;
            L = l;
        }
    }

    static boolean solve() {
        UnionFind uf = new UnionFind(M+1);

        for (Entry entry : E) {
            if( entry.K > 1 ) {
                for (int i = 1; i < entry.K; i++) {
                    uf.unite(entry.L[0], entry.L[i]);
                }
            }
        }

        int root = uf.root(E[0].L[0]);
        fe: for (Entry e : E) {
            for (int lang : e.L) {
                if( root == uf.root(lang) ) continue fe;
            }
            return false;
        }
        return true;
    }

    static class UnionFind {

        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int root(int x) {
            if( parent[x] == x ) {
                return x;
            } else {
                parent[x] = root(parent[x]);
                return parent[x];
            }
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if( x == y ) return;

            if( rank[x] < rank[y] ) {
                parent[x] = y;
            } else {
                parent[y] = x;
                if( rank[x] == rank[y]) rank[x]++;
            }
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

