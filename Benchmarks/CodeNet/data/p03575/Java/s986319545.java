import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
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
        CBridge solver = new CBridge();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBridge {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Vec2i[] v = new Vec2i[m];
            for (int i = 0; i < m; i++) {
                v[i] = new Vec2i(in.nextInt() - 1, in.nextInt() - 1);
            }
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                UnionFindTree uf = new UnionFindTree(n);
                for (int j = 0; j < m; j++) {
                    if (i != j) {
                        uf.union(v[j].x, v[j].y);
                    }
                }
                boolean f = true;
                for (int k = 0; k < n; k++) {
                    f &= uf.same(0, k);
                }
                if (!f) cnt++;
            }

            out.println(cnt);

        }

    }

    static class UnionFindTree {
        private int[] parent;
        private int[] height;
        private int[] size;

        public UnionFindTree(int size) {
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

        public void union(int x, int y) {

            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) { //既に結合済み
                return;
            }

            if (height[rootX] > height[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];

            } else if (height[rootX] < height[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];

            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
                height[rootX]++;
            }
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }

    static class Vec2i {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Vec2i{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }
}

