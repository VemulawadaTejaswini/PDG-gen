import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPeopleOnALine solver = new DPeopleOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPeopleOnALine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            WeightedUnionFind wuf = new WeightedUnionFind(n);
            for (int i = 0; i < m; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;
                int w = in.nextInt();
                if (wuf.same(l, r)) {
                    if (wuf.dif(l, r) != w) {
                        out.println("No");
                        return;
                    }
                } else {
                    wuf.union(l, r, w);
                }
            }
            out.println("Yes");

        }

    }

    static class WeightedUnionFind extends UnionFind {
        long[] dif;

        public WeightedUnionFind(int n) {
            super(n);
            dif = new long[n];
        }

        public void union(int x, int y, long w) {
            w = w + dif[x] - dif[y];
            x = find(x);
            y = find(y);
            if (height[x] < height[y]) {
                int tmp = x;
                x = y;
                y = tmp;
                w = -w;
            }
            if (height[x] == height[y]) {
                ++height[x];
            }
            parent[y] = x;
            dif[y] = w;
        }

        public int find(int x) {
            if (parent[x] == x) return x;
            int r = find(parent[x]);
            dif[x] += dif[parent[x]];
            return parent[x] = r;
        }

        public long dif(int x, int y) {
            return dif[y] - dif[x];
        }

    }

    static class UnionFind {
        protected int[] parent;
        protected int[] height;
        protected int[] size;

        public UnionFind(int size) {
            this.parent = new int[size];
            this.height = new int[size];
            this.size = new int[size];

            for (int i = 0; i < size; i++) {
                makeSet(i);
            }
        }

        private void makeSet(int i) {
            parent[i] = i;
            height[i] = 0;
            size[i] = 1;
        }

        public int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }
}

