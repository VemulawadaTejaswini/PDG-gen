import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDecayedBridges solver = new DDecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecayedBridges {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            DisjointSetArr dsu = new DisjointSetArr(n);
            Pair[] edges = new Pair[m];
            long[] res = new long[m];
            res[m - 1] = (long) n * (n - 1) / 2;
            for (int i = 0; i < n; i++) {
                dsu.makeSet(i);
            }
            for (int i = 0; i < m; i++) {
                edges[i] = new Pair(in.nextInt() - 1, in.nextInt() - 1);
            }
            for (int i = m - 1; i >= 1; i--) {
                int v1 = edges[i].v1;
                int v2 = edges[i].v2;
                if (dsu.findSet(v1) == dsu.findSet(v2)) {
                    res[i - 1] = res[i];
                } else {
                    res[i - 1] = Math.max(res[i] - dsu.findSize(v1) * dsu.findSize(v2), 0);
                    dsu.union(v1, v2);
                }
            }
            for (long i : res) {
                out.println(i);
            }
        }

        class Pair {
            int v1;
            int v2;

            public Pair(int v1, int v2) {
                this.v1 = v1;
                this.v2 = v2;
            }

        }

        class DisjointSetArr {
            private int[] parent;
            private int[] rank;
            private int[] size;

            DisjointSetArr(int n) {
                parent = new int[n];
                rank = new int[n];
                size = new int[n];
            }

            void makeSet(int i) {
                parent[i] = i;
                size[i] = 1;
            }

            void union(int i, int j) {
                int pi = findSet(i);
                int pj = findSet(j);

                if (rank[pi] == rank[pj]) {
                    ++rank[pi];
                    parent[i] = pj;
                } else if (rank[pi] > rank[pj]) {
                    parent[j] = pi;
                } else {
                    parent[i] = pj;
                }
                size[i] = size[pi] + size[pj];
                size[j] = size[pi] + size[pj];
            }

            int findSize(int i) {
                return size[i];
            }

            int findSet(int i) {
                if (parent[i] == i) {
                    return i;
                }
                return parent[i] = findSet(parent[i]);
            }

        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

