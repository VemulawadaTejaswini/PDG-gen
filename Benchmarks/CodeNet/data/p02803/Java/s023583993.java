import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
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
        DMazeMaster solver = new DMazeMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMazeMaster {
        int lx = 0;
        int ly = 0;
        int mxcnt = 0;
        char[][] c;
        boolean[][] vis;
        int[] xi = {1, -1, 0, 0};
        int[] yi = {0, 0, -1, 1};

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int h = s.nextInt(), wi = s.nextInt();
            c = new char[h][];
            vis = new boolean[h][wi];
            for (int i = 0; i < h; i++) c[i] = s.next().toCharArray();
            boolean done = false;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < wi; j++) {
                    if (c[i][j] == '.') {
                        vis[i][j] = true;
                        LinkedList<dist> l = new LinkedList<>();
                        l.add(new dist(i, j, 0));
                        bfs(h, wi, l);
                        done = true;
                        break;
                    }
                }
                if (done) break;
            }
            vis = new boolean[h][wi];
            vis[lx][ly] = true;
            LinkedList<dist> l = new LinkedList<>();
            l.add(new dist(lx, ly, 0));
            bfs(h, wi, l);
            w.println(mxcnt);
        }

        void bfs(int h, int wi, LinkedList<dist> l) {
            while (!l.isEmpty()) {
                dist d = l.poll();
                int x = d.x, y = d.y;
                if (d.z >= mxcnt) {
                    mxcnt = d.z;
                    lx = x;
                    ly = y;
                }
                for (int i = 0; i < 4; i++) {
                    if (x + xi[i] < h && x + xi[i] >= 0 && y + yi[i] < wi && y + yi[i] >= 0 && !vis[x + xi[i]][y + yi[i]] && c[x + xi[i]][y + yi[i]] == '.') {
                        vis[x + xi[i]][y + yi[i]] = true;
                        l.add(new dist(x + xi[i], y + yi[i], d.z + 1));
                    }
                }
            }
        }

    }

    static class dist implements Comparable<dist> {
        public int x;
        public int y;
        public int z;

        public dist(int xi, int yi, int zi) {
            x = xi;
            y = yi;
            z = zi;
        }

        public int compareTo(dist other) {
            if (this.z > other.z) {
                return 1;
            }
            if (this.z < other.z) {
                return -1;
            }
            return 0;
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

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
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

