import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Bridge solver = new Bridge();
        solver.solve(1, in, out);
        out.close();
    }

    static class Bridge {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] aa = new int[m];
            int[] bb = new int[m];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                aa[i] = a;
                bb[i] = b;
            }

            long result = 0;
            for (int i = 0; i < m; i++) {
                UnionFind uf = new UnionFind(n);
                for (int j = 0; j < m; j++) {
                    if (i == j) {
                        continue;
                    }
                    uf.unite(aa[j], bb[j]);
                }
                int a = aa[i];
                int b = bb[i];
                if (uf.same(a, b)) {
                    continue;
                }
                uf.unite(a, b);
                if (uf.same(a, b)) {
                    result++;
                }
            }

            out.println(result);
        }

        public class UnionFind {
            private int[] size;
            private int[] parents;

            public UnionFind() {
            }

            public UnionFind(int size) {
                this.size = new int[size];
                this.parents = new int[size];
                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parents[x] = x;
                size[x] = 1;
            }

            public int findSet(int x) {
                if (x != parents[x]) {
                    parents[x] = findSet(parents[x]);
                }
                return parents[x];
            }

            public boolean unite(int x, int y) {
                if (same(x, y)) {
                    return false;
                }
                link(findSet(x), findSet(y));
                return true;
            }

            public boolean same(int x, int y) {
                return findSet(x) == findSet(y);
            }

            private void link(int x, int y) {
                if (size[x] > size[y]) {
                    parents[y] = parents[x];
                    size[x] += size[y];
                } else {
                    parents[x] = parents[y];
                    size[y] += size[x];
                }
            }

        }

    }
}

