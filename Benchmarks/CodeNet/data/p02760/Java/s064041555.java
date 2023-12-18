import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.HashMap;
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
        BBingo solver = new BBingo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBingo {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int ar[][] = new int[3][3];
            for (int i = 0; i < 3; i++)
                ar[i] = in.nextIntArray(3);
            int n = in.nextInt();
            HashMap<Integer, Integer> set = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (!set.containsKey(a))
                    set.put(a, 0);
                set.put(a, set.get(a) + 1);
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (set.containsKey(ar[i][j]) && set.get(ar[i][j]) > 0) {
                        set.put(ar[i][j], set.get(ar[i][j]) - 1);
                        ar[i][j] = 0;
                    }
                }
            }
            int c = 0;
            for (int i = 0; i < 3; i++) {
                int sum = 0;
                for (int j : ar[i])
                    sum += j;
                if (sum == 0)
                    c++;
            }
            for (int i = 0; i < 3; i++) {
                int sum = 0;
                for (int j = 0; j < 3; j++) {
                    sum += ar[j][i];
                }
                if (sum == 0)
                    c++;
            }
            if (ar[0][0] == 0 && ar[1][1] == 0 && ar[2][2] == 0)
                c++;
            if (c == 0)
                out.println("No");
            else
                out.println("Yes");
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
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

