import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni(), k = ni(), l = ni();

        int[] p = new int[k];
        int[] q = new int[k];
        for (int i = 0; i < k; i++) {
            p[i] = ni() - 1;
            q[i] = ni() - 1;
        }
        int[] r = new int[l];
        int[] s = new int[l];
        for (int i = 0; i < l; i++) {
            r[i] = ni() - 1;
            s[i] = ni() - 1;
        }

        UnionFind uf1 = new UnionFind(n);
        for (int i = 0; i < k; i++) {
            uf1.union(p[i], q[i]);
        }

        UnionFind uf2 = new UnionFind(n);
        for (int i = 0; i < l; i++) {
            uf2.union(r[i], s[i]);
        }

        ArrayList<ArrayList<Integer>> groups = uf2.groups();

        int[] ans = new int[n];

        for (int i = 0; i < groups.size(); i++) {
            ArrayList<Integer> group = groups.get(i);
            Collections.sort(group, (x1, x2) -> uf1.root(x1) - uf1.root(x2));
            for (int j = 0; j < group.size(); j++) {
                int idx = j;
                int cnt = 1;
                while (idx < group.size() - 1 && uf1.isConnected(group.get(j), group.get(idx + 1))) {
                    idx++;
                    cnt++;
                }
                for (int m = j; m <= idx; m++) {
                    ans[group.get(m)] = cnt;
                }
                j = idx;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) out.print(" ");
            out.print(ans[i]);
        }
        out.println();
    }

    class UnionFind {
        private int[] parent;

        UnionFind(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (parent[y] < parent[x]) {
                    int tmp = y;
                    y = x;
                    x = tmp;
                }
                parent[x] += parent[y];
                parent[y] = x;
                return true;
            }
            return false;
        }

        public boolean isConnected(int x, int y) {
            return root(x) == root(y);
        }

        public int root(int x) {
            return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
        }

        public int size(int x) {
            return -parent[root(x)];
        }

        public ArrayList<ArrayList<Integer>> groups() {
            int n = parent.length;
            ArrayList<ArrayList<Integer>> g = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = root(i);
                if (!hm.containsKey(r)) {
                    hm.put(r, g.size());
                    g.add(new ArrayList<>());
                }
                g.get(hm.get(r)).add(i);
            }
            return g;
        }

        public String toString() {
            return Arrays.toString(parent);
        }
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}