import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
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
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            ArrayList<Integer>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            for (int i = 0; i < m; i++)
                adj[s.nextInt() - 1].add(s.nextInt() - 1);
            int[][] d = new int[n][3];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < 3; j++)
                    d[i][j] = -1;
            int src = s.nextInt() - 1, dst = s.nextInt() - 1;
            d[src][0] = 0;
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(src, 0));
            while (!q.isEmpty()) {
                Pair p = q.poll();
                for (int j : adj[p.i]) {
                    if (d[j][(p.r + 1) % 3] == -1) {
                        d[j][(p.r + 1) % 3] = d[p.i][p.r] + 1;
                        q.add(new Pair(j, (p.r + 1) % 3));
                    }
                }
            }
            if (d[dst][0] != -1)
                w.println(d[dst][0] / 3);
            else
                w.println(-1);
        }

        class Pair {
            int i;
            int r;

            Pair(int i, int r) {
                this.i = i;
                this.r = r;
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

