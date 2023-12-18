import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        InputStreamScanner in = new InputStreamScanner(System.in);
        new Main().solve(in, out);
        out.flush();
    }

    private void solve(InputStreamScanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt() - 1;
            b[i] = in.nextInt() - 1;
        }

        long[] r = new long[m];
        long c = (long)n * (n - 1) / 2;
        UnionFindTree uft = new UnionFindTree(n);

        for (int i = m - 1; i > 0; i--) {
            r[i] = c;

            if (uft.find(a[i]) != uft.find(b[i])) {
                c -= (uft.size(a[i]) * uft.size(b[i]));
                uft.united(a[i], b[i]);
            }
        }

        r[0] = c;

        for (int i = 0; i < m; i++) {
            out.println(r[i]);
        }

    }

    static class UnionFindTree {
        private int[] parent;

        UnionFindTree(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
        }

        int find(int x) {
            if (parent[x] < 0) {
                // parent itself
                return x;
            } else {
                // find and set parent
                return parent[x] = find(parent[x]);
            }
        }

        boolean united(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) {
                // already united
                return false;
            }

            if (size(rootX) < size(rootY)) {
                int tmp = rootX;
                rootX = rootY;
                rootY = tmp;
            }

            parent[rootX] += parent[rootY];
            parent[rootY] = rootX;
            return true;
        }

        int size(int x) {
            return -parent[find(x)];
        }

        boolean isSame(int x, int y) {
            return find(x) == find(y);
        }

    }

    static class InputStreamScanner {

        private InputStream in;

        private byte[] buf = new byte[1024];
        private int len = 0;
        private int off = 0;

        InputStreamScanner(InputStream in)	{
            this.in = in;
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); !isSpace(b);){
                sb.appendCodePoint(b);
                b = read();
            }
            return sb.toString();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        char nextChar() {
            return (char)skip();
        }

        int skip() {
            for (int b; (b = read()) != -1;) {
                if (!isSpace(b)) {
                    return b;
                }
            }
            return -1;
        }

        private boolean isSpace(int c) {
            return c < 33 || c > 126;
        }

        private int read() {
            if (len == -1) {
                throw new InputMismatchException("End of Input");
            }
            if (off >= len){
                off = 0;
                try {
                    len = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException(e.getMessage());
                }
                if (len <= 0) {
                    return -1;
                }
            }
            return buf[off++];
        }
    }
}
