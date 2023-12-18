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
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int a = in.nextInt();
            int b = in.nextInt();

            List<Integer> l = new ArrayList<>();

            if ((a & 1) != 0) {
                l.add(1);
                l.add(0);
            } else {
                l.add(0);
                l.add(1);
            }

            for (int i = 1; i < n; i++) {
                ArrayList<Integer> l2 = new ArrayList<>(l);

                Collections.reverse(l2);

                ArrayList<Integer> ml = new ArrayList<>();

                if ((a & (1 << i)) != 0) {
                    for (int j = 0; j < l.size(); j++) {
                        ml.add(l.get(j) + (1 << i));
                    }
                    for (int j = 0; j < l2.size(); j++) {
                        ml.add(l2.get(j));
                    }
                } else {
                    for (int j = 0; j < l.size(); j++) {
                        ml.add(l.get(j));
                    }
                    for (int j = 0; j < l2.size(); j++) {
                        ml.add(l2.get(j) + (1 << i));
                    }
                }

                l = ml;
            }

            if (l.get(l.size() - 1) == b) {
                out.println("YES");
                for (int i = 0; i < l.size(); i++) {
                    out.print(l.get(i) + " ");
                }
            } else {
                out.println("NO");
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

