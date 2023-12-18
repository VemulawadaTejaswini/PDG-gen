import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
            int h = in.nextInt();
            int w = in.nextInt();

            char[][] f = new char[w][h];
            for (int y = 0; y < h; y++) {
                String s = in.next();
                for (int x = 0; x < w; x++) {
                    f[x][y] = s.charAt(x);
                }
            }

            UnionFindTree xutf = new UnionFindTree(h * w);
            UnionFindTree yutf = new UnionFindTree(h * w);

            for (int y = 0; y < h; y++) {
                boolean po = false;
                for (int x = 1; x < w; x++) {
                    if (!po && f[x][y] != '#')
                        xutf.unite(y * w + x, y * w + x - 1);
                    po = f[x][y] == '#';
                }
            }

            for (int x = 0; x < w; x++) {
                boolean po = false;
                for (int y = 1; y < h; y++) {
                    if (!po && f[x][y] != '#')
                        yutf.unite(y * w + x, (y - 1) * w + x);
                    po = f[x][y] == '#';
                }
            }

            int ans = 0;
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    ans = Math.max(xutf.getScore(y * w + x) + yutf.getScore(y * w + x) - 1, ans);
                }
            }
            out.println(ans);
        }

        public class UnionFindTree {
            private int[] parent;
            private int[] rank;
            private int[] score;
            private int size;

            public UnionFindTree(int size) {
                this.size = size;
                parent = new int[size];
                rank = new int[size];
                score = new int[size];
                for (int i = 0; i < size; i++) {
                    parent[i] = i;
                    rank[i] = 0;
                    score[i] = 1;
                }
            }

            public int find(int index) {
                if (parent[index] == index) return index;
                else {
                    parent[index] = find(parent[index]);
                    return parent[index];
                }
            }

            public int getScore(int index) {
                return score[find(index)];
            }

            public void unite(int index1, int index2) {
                int parent1 = find(index1);
                int parent2 = find(index2);
                if (parent1 == parent2) return;

                if (rank[parent1] < rank[parent2]) {
                    parent[parent1] = parent2;
                    score[parent2] += score[parent1];
                } else {
                    parent[parent2] = parent1;
                    score[parent1] += score[parent2];
                    if (rank[parent1] == rank[parent2]) rank[parent1]++;
                }

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
            this.bufPointer = 0;
            this.bufLength = 0;
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

        private static boolean isPrintableChar(int c) {
            return c >= 33 && c <= 126;
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();

            int b = readByte();
            while (!isPrintableChar(b))
                b = readByte();

            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }

            return sb.toString();
        }

        public int nextInt() {
            int n = 0;

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

    }
}

