import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            ArrayList<Integer>[] f = new ArrayList[n], b = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                f[i] = new ArrayList<>();
                b[i] = new ArrayList<>();
            }
            dsu d = new dsu(n);
            while (m-- > 0) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                f[u].add(v);
                f[v].add(u);
                d.unite(u, v);
            }
            while (k-- > 0) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                b[u].add(v);
                b[v].add(u);
            }
            for (int i = 0; i < n; i++) {
                int par = d.getPar(i), ans = d.getSize(par) - f[i].size() - 1;
                for (int j : b[i]) if (d.getPar(j) == par) ans--;
                w.print(ans + " ");
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class dsu {
        public int con;
        public int[] par;
        public int[] sz;

        public dsu(int n) {
            par = new int[n];
            sz = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
                sz[i] = 1;
            }
            con = n;
        }

        public int getPar(int k) {
            while (k != par[k]) {
                par[k] = par[par[k]];
                k = par[k];
            }
            return k;
        }

        public int getSize(int k) {
            return sz[getPar(k)];
        }

        public boolean unite(int u, int v) {
            int par1 = getPar(u), par2 = getPar(v);
            if (par1 == par2)
                return false;

            con--;
            if (sz[par1] > sz[par2]) {
                int tem = par1;
                par1 = par2;
                par2 = tem;
            }
            sz[par2] += sz[par1];
            sz[par1] = 0;
            par[par1] = par[par2];
            return true;
        }

    }
}

