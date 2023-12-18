import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N, M;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            UnionFind uf = new UnionFind(N);

            for (int i = 0; i < M; ++i) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                int z = in.nextInt();
                uf.unite(x, y);
            }

            Set<Integer> parent = new HashSet<>();
            for (int i = 0; i < N; ++i) {
                parent.add(uf.root(i));
            }

            out.println(parent.size());
        }
    }

    static class UnionFind {
        private int[] rank, parent, size;

        public UnionFind(int n) {
            this.rank = new int[n];
            this.parent = new int[n];
            this.size = new int[n];
            for (int i = 0; i < n; ++i) {
                parent[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
        }

        public int getSize(int x) {
            return size[root(x)];
        }

        public boolean same(int x, int y) {
            return root(x) == root(y);
        }

        public void unite(int x, int y) {
            int a = root(x);
            int b = root(y);

            if (rank[a] < rank[b]) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            parent[b] = a;
            if (rank[a] == rank[b])
                rank[a]++;

            size[a] += size[b];
        }

        public int root(int x) {
            if (parent[x] != x) {
                parent[x] = root(parent[x]);
            }
            return parent[x];
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}