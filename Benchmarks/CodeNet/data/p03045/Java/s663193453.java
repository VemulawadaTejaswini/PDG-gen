import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        OneorTwo solver = new OneorTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class OneorTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            UnionFind uf = new UnionFind(n);
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int x = Integer.parseInt(in.next()) - 1;
                int y = Integer.parseInt(in.next()) - 1;
                int z = Integer.parseInt(in.next());
                uf.unite(x, y);
            }
            for (int i = 0; i < n; i++) {
                set.add(uf.findSet(i));
            }
            out.print(set.size());
        }

        public class UnionFind {
            private int[] ranks;
            private int[] parents;

            public UnionFind() {
            }

            public UnionFind(int size) {
                ranks = new int[size];
                parents = new int[size];
                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parents[x] = x;
                ranks[x] = 0;
            }

            public int findSet(int x) {
                if (x != parents[x]) {
                    parents[x] = findSet(parents[x]);
                }
                return parents[x];
            }

            public void unite(int x, int y) {
                if (same(x, y)) {
                    return;
                }
                link(findSet(x), findSet(y));
            }

            public boolean same(int x, int y) {
                return findSet(x) == findSet(y);
            }

            private void link(int x, int y) {
                if (ranks[x] > ranks[y]) {
                    parents[y] = parents[x];
                } else {
                    parents[x] = parents[y];
                    if (ranks[x] == ranks[y]) {
                        ranks[y]++;
                    }
                }
            }

        }

    }
}

