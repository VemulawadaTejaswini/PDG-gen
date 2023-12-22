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
        int h = ni();
        int w = ni();
        char[][] b = new char[h][w];
        for (int i = 0; i < h; i++) {
            b[i] = ns().toCharArray();
        }
        nia(2);

        UnionFind uf = new UnionFind(h * w);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i != h - 1 && b[i][j] == b[i + 1][j]) uf.union(i * w + j, (i + 1) * w + j);
                if (j != w - 1 && b[i][j] == b[i][j + 1]) uf.union(i * w + j, i * w + j + 1);
            }
        }

        out.println(uf.groups().size());
    }

    class UnionFind {
        private int[] parent;

        public UnionFind(int size) {
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