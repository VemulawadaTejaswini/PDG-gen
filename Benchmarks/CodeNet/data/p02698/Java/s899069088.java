import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FLISOnTree solver = new FLISOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLISOnTree {
        ArrayList<Integer>[] adj;
        int[] left;
        int[] right;
        int time;
        int[] tree;
        int[] lazy;
        int[] res;

        void dfs(int x, int p) {
            time++;
            left[x] = time;
            for (int y : adj[x]) {
                if (y != p) {
                    dfs(y, x);
                }
            }
            right[x] = time;
        }

        void pushLazy(int n, int nL, int nR) {
            tree[n] = Math.max(lazy[n], tree[n]);
            if (nL != nR) {
                lazy[2 * n + 1] = Math.max(lazy[n], lazy[2 * n + 1]);
                lazy[2 * n + 2] = Math.max(lazy[n], lazy[2 * n + 2]);
            }
            lazy[n] = 0;
        }

        void update(int n, int nL, int nR, int l, int r, int x) {
            pushLazy(n, nL, nR);
            if (nR < l || r < nL)
                return;
            if (l <= nL && nR <= r) {
                lazy[n] = x;
                pushLazy(n, nL, nR);
                return;
            }
            update(2 * n + 1, nL, (nL + nR) / 2, l, r, x);
            update(2 * n + 2, (nL + nR) / 2 + 1, nR, l, r, x);
            tree[n] = Math.max(tree[2 * n + 1], tree[2 * n + 2]);
        }

        int query(int n, int nL, int nR, int idx) {
            pushLazy(n, nL, nR);
            if (nR < idx || idx < nL)
                return 0;
            if (nL == idx && nR == idx)
                return tree[n];
            int ret = Math.max(query(2 * n + 1, nL, (nL + nR) / 2, idx), query(2 * n + 2, (nL + nR) / 2 + 1, nR, idx));
            return ret;
        }

        void dfs2(int x, int p) {
            if (p != -1)
                res[x] = Math.max(res[x], res[p]);
            for (int y : adj[x]) {
                if (y != p)
                    dfs2(y, x);
            }
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();
            Pair[] p = new Pair[n];
            for (int i = 0; i < n; i++)
                p[i] = new Pair(i, a[i]);
            Arrays.sort(p, new Comparator<Pair>() {

                public int compare(Pair p1, Pair p2) {
                    if (p1.w < p2.w)
                        return -1;
                    if (p1.w > p2.w)
                        return 1;
                    return 0;
                }
            });
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                adj[u].add(v);
                adj[v].add(u);
            }
            left = new int[n];
            right = new int[n];
            time = -1;
            dfs(0, -1);
            int sz = 1 << (int) Math.ceil(Math.log(n) / Math.log(2) + 1);
            tree = new int[sz];
            lazy = new int[sz];
            res = new int[n];
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && p[i].w == p[j].w) {
                    int x = p[j].i;
                    res[x] = query(0, 0, n - 1, left[x]) + 1;
                    j++;
                }
                j = i;
                while (j < n && p[i].w == p[j].w) {
                    int x = p[j].i;
                    update(0, 0, n - 1, left[x], right[x], res[x]);
                    j++;
                }
                i = j;
            }
            dfs2(0, -1);
            for (i = 0; i < n; i++)
                w.println(res[i]);
        }

        class Pair {
            int i;
            int w;

            Pair(int i, int w) {
                this.i = i;
                this.w = w;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

