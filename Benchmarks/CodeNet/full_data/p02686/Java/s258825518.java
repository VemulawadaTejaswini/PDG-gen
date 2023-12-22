import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.stream.Stream;
import java.io.Writer;
import java.util.Optional;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FBracketSequencing solver = new FBracketSequencing();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBracketSequencing {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.readInt();

            var items = in.streamStrings(n).map(this::getVal).toArray(IntPt[]::new);

            Arrays.sort(items, (a, b) -> {
                if (a.x == b.x) {
                    return Integer.compare(b.y, a.y);
                }
                return Integer.compare(a.x, b.x);
            });

            var res = Arrays.stream(items).reduce(this::merge).get();

            if (res.x == 0 && res.y == 0) {
                out.println("Yes");
            } else {
                out.println("No");
            }

        }

        IntPt merge(IntPt a, IntPt b) {
            int mergZ = a.y - b.x;

            if (mergZ < 0) {
                return new IntPt(a.x + (-mergZ), b.y);
            } else {
                return new IntPt(a.x, a.y - b.x + b.y);
            }
        }

        IntPt getVal(String s) {
            int res1 = 0;
            int res2 = 0;
            int opened1 = 0;
            int opened2 = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    opened1++;
                } else {
                    opened1--;
                    res1 = Math.max(res1, -opened1);
                }
            }

            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ')') {
                    opened2++;
                } else {
                    opened2--;
                    res2 = Math.max(res2, -opened2);
                }
            }
            return new IntPt(res1, res2);
        }

    }

    static class IntPt implements Comparable<IntPt>, IPt<Integer, Integer> {
        public final int x;
        public final int y;

        public IntPt(int k, int v) {
            x = k;
            y = v;
        }

        public IntPt(IntPt entry) {
            this(entry.getX(), entry.getY());
        }

        public Integer getX() {
            return x;
        }

        public Integer getY() {
            return y;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof IntPt)) {
                return false;
            } else {
                return x == ((IntPt) o).x && y == ((IntPt) o).y;
            }
        }

        public int hashCode() {
            int result = Integer.hashCode(x);

            final int h = Integer.hashCode(y);
            result = 37 * result + h ^ (h >>> 16);

            return result;
        }

        public String toString() {
            return "[" + getX() + ", " + getY() + "]";
        }

        public int compareTo(IntPt o) {
            if (x == o.x) {
                return Integer.compare(y, o.y);
            }
            return Integer.compare(x, o.x);
        }

    }

    static interface IPt<A, B> {
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

        private int read() {
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public Stream<String> streamStrings(final int n) {
            return IntStream.range(0, n).boxed().map(operand -> readString());
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

