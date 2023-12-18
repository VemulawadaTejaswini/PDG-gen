import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[] p = in.nextIntArray(n);
            DSU dsu = new DSU(n);
            for (int i = 0; i < m; i++) {
                dsu.unite(in.nextInt() - 1, in.nextInt() - 1);
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (dsu.get(i) == dsu.get(p[i] - 1)) {
                    ans++;
                }
            }
            out.println(ans);
        }

    }

    static class DSU {
        int[] parent;
        int[] rank;
        int[] size;
        int sets;

        public DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            size = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            this.sets = n;
        }

        public int get(int v) {
            if (parent[v] == v) {
                return v;
            }
            return parent[v] = get(parent[v]);
        }

        public boolean unite(int u, int v) {
            u = get(u);
            v = get(v);
            if (u == v) {
                return false;
            }
            sets--;
            if (rank[u] == rank[v]) {
                rank[u]++;
            }
            if (rank[u] > rank[v]) {
                parent[v] = u;
                size[u] += size[v];
            } else {
                parent[u] = v;
                size[v] += size[u];
            }
            return true;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}

