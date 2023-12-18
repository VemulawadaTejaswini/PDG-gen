import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
            int n = in.nextInt();

            City[] dx = new City[n];
            City[] dy = new City[n];

            for (int i = 0; i < n; i++) {
                City cc = new City(in.nextLong(), in.nextLong(), i);
                dx[i] = cc;
                dy[i] = cc;
            }

            Arrays.sort(dx, Comparator.comparing(City::getX));
            Arrays.sort(dy, Comparator.comparing(City::getY));

            Bridge[] bridges = new Bridge[n * 2 - 2];
            for (int i = 0; i < n - 1; i++) {
                bridges[i * 2] = new Bridge(dx[i].getN(), dx[i + 1].getN(), dx[i + 1].getX() - dx[i].getX());
                bridges[i * 2 + 1] = new Bridge(dy[i].getN(), dy[i + 1].getN(), dy[i + 1].getY() - dy[i].getY());
            }
            Arrays.sort(bridges, Comparator.comparing(Bridge::getD));

            UnionFindTree uft = new UnionFindTree(n);
            long ans = 0;
            for (Bridge cb : bridges) {
                int c1 = cb.getC1();
                int c2 = cb.getC2();
                if (!uft.same(c1, c2)) {
                    ans += cb.getD();
                    uft.unite(c1, c2);
                }
            }
            out.println(ans);

        }

        private class City {
            long x;
            long y;
            int n;

            City(long x, long y, int n) {
                this.n = n;
                this.x = x;
                this.y = y;
            }

            public int getN() {
                return n;
            }

            public long getX() {
                return x;
            }

            public long getY() {
                return y;
            }

        }

        private class Bridge {
            int c1;
            int c2;
            long d;

            Bridge(int c1, int c2, long d) {
                this.c1 = c1;
                this.c2 = c2;
                this.d = d;
            }

            public long getD() {
                return d;
            }

            public int getC1() {
                return c1;
            }

            public int getC2() {
                return c2;
            }

        }

    }

    static class UnionFindTree {
        private int[] parent;
        private int[] rank;
        private int size;

        public UnionFindTree(int size) {
            this.size = size;
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int index) {
            if (parent[index] == index) return index;
            else {
                parent[index] = find(parent[index]);
                return parent[index];
            }
        }

        public boolean same(int index1, int index2) {
            return find(index1) == find(index2);
        }

        public void unite(int index1, int index2) {
            int parent1 = find(index1);
            int parent2 = find(index2);
            if (parent1 == parent2) return;

            if (rank[parent1] < rank[parent2]) {
                parent[parent1] = parent2;
            } else {
                parent[parent2] = parent1;
                if (rank[parent1] == rank[parent2]) rank[parent1]++;
            }
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }
}

