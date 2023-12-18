import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            DFriendSuggestions.QuickUnion uf = new DFriendSuggestions.QuickUnion(n);
            int ar[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                uf.union(a, b);
                ar[a] += 1;
                ar[b] += 1;
            }
            int ans[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int a = uf.root(i);
                int b = uf.size[a];
                b -= 1;
                b -= ar[i];
                ans[i] = b;
            }
            for (int i = 0; i < k; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (uf.root(a) == uf.root(b)) {
                    ans[a] -= 1;
                    ans[b] -= 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++)
                sb.append(ans[i]).append(" ");
            out.println(sb.toString());
        }

        static class QuickUnion {
            int ar[];
            int size[];

            public QuickUnion(int n) {
                ar = new int[n + 1];
                for (int i = 1; i < n; i++)
                    ar[i] = i;
                size = new int[n + 1];
                Arrays.fill(size, 1);
            }

            public int root(int r) {
                int i = r;
                while (i != ar[i]) {
                    i = ar[i];
                }
                int j = r;
                while (j != ar[j]) {
                    int f = j;
                    j = ar[j];
                    ar[f] = i;
                }
                return i;
            }

            public void union(int a, int b) {
                int i = root(a);
                int j = root(b);
                ar[j] = i;
                if (i != j)
                    size[i] += size[j];
                ar[a] = i;
                ar[j] = i;
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

