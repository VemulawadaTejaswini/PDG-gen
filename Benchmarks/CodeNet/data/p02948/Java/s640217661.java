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
import java.util.Collections;
import java.util.ArrayList;
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
        DSummerVacation solver = new DSummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSummerVacation {
        static final int MASK = (1 << 17) - 1;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            boolean[] filled = new boolean[m + 2];
            DisjointSets ds = new DisjointSets(m + 1);
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                a[i] = in.nextInt();
                al.add((a[i] << 17) | b[i]);
            }
            Collections.sort(al);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = al.get(n - 1 - i);
                int _a = x >> 17;
                int _b = x & MASK;
                if (_b > m) continue;
                int pos = !filled[m - _b] ? m - _b : ds.root(m - _b) - 1;
                if (pos < 0) continue;
                if (pos + 1 <= m && filled[pos + 1]) {
                    ds.unite(pos, pos + 1);
                }
                if (pos - 1 >= 0 && filled[pos - 1]) ds.unite(pos, pos - 1);
                filled[pos] = true;
                ans += _a;
            }
            out.println(ans);
        }

        public class DisjointSets {
            int[] p;

            DisjointSets(int size) {
                p = new int[size];
                for (int i = 0; i < size; i++)
                    p[i] = i;
            }

            public int root(int x) {
                return x == p[x] ? x : (p[x] = root(p[x]));
            }

            boolean unite(int a, int b) {
                a = root(a);
                b = root(b);
                if (a < b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if (a != b) {
                    p[a] = b;
                    return true;
                }
                return false;
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

        public void println(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
            writer.print('\n');
        }

        public void close() {
            writer.close();
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
            while (isSpaceChar(c)) c = read();
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

