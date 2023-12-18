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
 * @author Puneet    //FastRead class is taken from different online Sources
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastInput in = new FastInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        int[] parent = new int[1000001];
        int[] size = new int[1000001];

        public void solve(int testNumber, FastInput in, PrintWriter out) {

            for (int i = 0; i < 1000001; i++) {
                parent[i] = i;
                size[i] = 1;
            }

            int n = in.ni(), m = in.ni();
            ArrayList<Pair> pr = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                pr.add(new Pair(in.ni(), in.ni()));
            }

            long[] ans = new long[m];

            for (int i = m - 1; i >= 0; i--) {

                long sz1 = 0, sz2 = 0;

                if (find_set(pr.get(i).a) != find_set(pr.get(i).b)) {
                    sz1 = size[find_set(pr.get(i).a)];
                    sz2 = size[find_set(pr.get(i).b)];
                    union_sets(pr.get(i).a, pr.get(i).b);
                }

//            out.println(sz1+" "+sz2);

                ans[i] = (sz1 * sz2);
            }

            out.println(ans[0]);

            for (int i = 1; i < m; i++) {

                ans[i] += ans[i - 1];
                out.println(ans[i]);
            }
        }

        int find_set(int v) {
            if (v == parent[v])
                return v;
            return parent[v] = find_set(parent[v]);
        }

        void union_sets(int a, int b) {

            a = find_set(a);
            b = find_set(b);
            if (a != b) {
                if (size[a] < size[b]) {
                    int t = a;
                    a = b;
                    b = t;
                }
                parent[b] = a;
                size[a] += size[b];

            }

        }

        class Pair {
            int a;
            int b;

            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }

        }

    }

    static class FastInput {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastInput.SpaceCharFilter filter;

        public FastInput(InputStream stream) {
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

        public int ni() {
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

