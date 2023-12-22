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
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            DFriends solver = new DFriends();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DFriends {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            dsu d = new dsu(n);
            int mx = 0;
            while (m-- > 0) d.unite(s.nextInt() - 1, s.nextInt() - 1);
            for (int i = 0; i < n; i++) mx = Math.max(mx, d.getSize(i));
            w.println(mx);
        }

    }

    static class dsu {
        public int con;
        public int[] par;
        public int[] sz;
        int n;

        public dsu(int n) {
            par = new int[n];
            sz = new int[n];
            this.n = n;
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
}

