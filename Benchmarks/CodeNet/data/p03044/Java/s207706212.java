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
 * @author Jeel Vaishnav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        ArrayList<Edge>[] adj;
        int[] col;

        void dfs(int i, int par, int ccol) {
            col[i] = ccol;

            for (Edge curE : adj[i]) {
                int j = curE.v;
                int w = curE.weight;

                if (j != par) {
                    dfs(j, i, (ccol + w) % 2);
                }
            }
        }

        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            int n = sc.nextInt();
            adj = new ArrayList[n];
            for (int i = 0; i < n; ++i)
                adj[i] = new ArrayList<>();

            for (int i = 0; i < n - 1; ++i) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                int w = sc.nextInt();
                adj[u].add(new Edge(v, w));
                adj[v].add(new Edge(u, w));
            }

            col = new int[n];
            dfs(0, -1, 0);

            for (int i = 0; i < n; ++i)
                out.println(col[i]);
        }

        class Edge {
            int v;
            int weight;

            Edge(int a, int b) {
                v = a;
                weight = b % 2;
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

