import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cunbidun
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PIndependentSet solver = new PIndependentSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class PIndependentSet {
        private static final int MOD = (int) 1e9 + 7;
        private static final int MAXA = (int) 1e5 + 10;
        ArrayList<Integer>[] tree;
        int[][] f = new int[MAXA][2];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            if (n == 1) {
                out.println(2);
                return;
            }
            tree = in.nextTree(n);
            for (int i = 1; i <= n; i++) {
                f[i][0] = f[i][1] = 1;
            }
            dfs(1, 1);
            out.println(Op.addMod(f[1][1], f[1][0], MOD));
        }

        private void dfs(int u, int l) {
            for (int v : tree[u]) {
                if (v != l) {
                    dfs(v, u);
                    f[u][0] = Op.mulMod(f[u][0], Op.addMod(f[v][0], f[v][1], MOD), MOD);
                    f[u][1] = Op.mulMod(f[u][1], f[v][0], MOD);
                }
            }
        }

    }

    static class Op {
        public static int addMod(int x, int y, int MOD) {
            return ((x + y) >= MOD ? x + y - MOD : x + y);
        }

        public static int mulMod(int x, int y, int MOD) {
            return (int) (((long) x * y) % MOD);
        }

    }

    static class InputReader extends InputStream {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

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
            while (isSpaceChar(c))
                c = read();
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

        public ArrayList<Integer>[] nextTree(int n) {

            ArrayList<Integer>[] tree = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                int u = nextInt();
                int v = nextInt();
                tree[u].add(v);
                tree[v].add(u);
            }
            return tree;
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

