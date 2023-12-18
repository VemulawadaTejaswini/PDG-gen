import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
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
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        final long mod = (long) 1e9 + 7;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt(), x, y;
            ArrayList<Integer>[] a = new ArrayList[n];
            long ans = 1;
            for (int i = 0; i < n; i++) {
                a[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                x = s.nextInt() - 1;
                y = s.nextInt() - 1;
                a[x].add(y);
                a[y].add(x);
            }
            boolean[] vis = new boolean[n];
            vis[0] = true;
            LinkedList<dist> l = new LinkedList<>();
            l.add(new dist(0, 0, k));
            while (!l.isEmpty()) {
                dist d = l.poll();
                ans *= k - d.y;
                ans %= mod;
                x = d.x == 0 ? 1 : 2;
                for (int i : a[d.x]) {
                    if (!vis[i]) {
                        vis[i] = true;
                        //w.println(i+" "+x);
                        l.add(new dist(i, x++, k));
                    }
                }
            }
            w.println(ans);
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
}

