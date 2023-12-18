import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        static boolean visited[];
        static int ans[];
        static ArrayList<DEvenRelation.pair> arr[];

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            arr = new ArrayList[n + 1];
            for (i = 1; i <= n; i++)
                arr[i] = new ArrayList<DEvenRelation.pair>();
            visited = new boolean[n + 1];
            ans = new int[n + 1];
            for (i = 0; i < n - 1; i++) {
                long a = in.ni();
                long b = in.nl();
                long w = in.nl();
                arr[(int) a].add(new DEvenRelation.pair(b, w));
                arr[(int) b].add(new DEvenRelation.pair(a, w));
            }
            dfs(1, 0);
            for (i = 1; i <= n; i++)
                out.println(ans[i]);
        }

        public void dfs(long a, long dis) {
            if (visited[(int) a])
                return;
            visited[(int) a] = true;
            if (dis % 2 == 0)
                ans[(int) a] = 0;
            else
                ans[(int) a] = 1;
            for (DEvenRelation.pair c : arr[(int) a]) {
                long x = c.x;
                if (visited[(int) x])
                    continue;
                dfs(x, dis + c.y);
            }


        }

        static class pair implements Comparable<DEvenRelation.pair> {
            long x;
            long y;

            public pair(long x, long y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(DEvenRelation.pair arg0) {
                if (x < arg0.x) return -1;
                else if (x == arg0.x) {
                    if (y < arg0.y) return -1;
                    else if (y > arg0.y) return 1;
                    else return 0;
                } else return 1;
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

        public long nl() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}

