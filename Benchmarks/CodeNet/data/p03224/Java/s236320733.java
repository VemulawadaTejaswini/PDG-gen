import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();

            if (n <= 2) {
                out.printLine("No");
                return;
            }

            int k = 1;
            while (k * (k - 1) / 2 <= n) {
                k++;
            }
            k--;

            if (k * (k - 1) / 2 != n) {
                out.printLine("No");
                return;
            }

            List<D.IndexPair> indexPairs = new ArrayList<>();
            for (int i = 0, num = 1; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    indexPairs.add(new D.IndexPair(i, j, num++));
                }
            }
            if (indexPairs.size() != n) {
                throw new AssertionError();
            }

            //noinspection unchecked
            List<Integer>[] ans = new List[k];
            for (int i = 0; i < k; i++) {
                ans[i] = new ArrayList<>();
            }
            for (D.IndexPair indexPair : indexPairs) {
                ans[indexPair.x].add(indexPair.val);
                ans[indexPair.y].add(indexPair.val);
            }

            out.printLine("Yes");
            out.printLine(k);
            for (List<Integer> list : ans) {
                out.print(list.size());
                for (int x : list) {
                    out.print(' ');
                    out.print(x);
                }
                out.printLine();
            }
        }

        static class IndexPair {
            int x;
            int y;
            int val;

            public IndexPair(int x, int y, int val) {
                this.x = x;
                this.y = y;
                this.val = val;
            }

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

        public void printLine() {
            writer.println();
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
        }

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
        }

        public void printLine(int i) {
            writer.println(i);
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

        public int readInt() {
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

