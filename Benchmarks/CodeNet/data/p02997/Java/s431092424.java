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
        EFriendships solver = new EFriendships();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFriendships {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int k = in.ni();
            int temp = ((n - 1) * (n - 2)) / 2;
            ArrayList<EFriendships.pair> arr = new ArrayList<>();
            if (k > temp || n == 2)
                out.println("-1");
            else {
                for (i = 2; i <= n; i++)
                    arr.add(new EFriendships.pair(1, i));
                int count = temp - k;
                for (i = 2; i <= n; i++) {
                    for (j = i + 1; j <= n; j++) {
                        if (count == 0)
                            break;
                        arr.add(new EFriendships.pair(i, j));
                        count--;
                    }
                    if (count == 0)
                        break;
                }
                out.println(arr.size());
                for (EFriendships.pair c : arr)
                    out.println(c.x + " " + c.y);
            }

        }

        static class pair implements Comparable<EFriendships.pair> {
            int x;
            int y;

            public pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(EFriendships.pair arg0) {
                if (x < arg0.x) return -1;
                else if (x == arg0.x) {
                    if (y < arg0.y) return -1;
                    else if (y > arg0.y) return 1;
                    else return 0;
                } else return 1;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof EFriendships.pair)) return false;
                EFriendships.pair key = (EFriendships.pair) o;
                return x == key.x && y == key.y;
            }

            public int hashCode() {
                int result = x;
                result = 31 * result + y;
                return result;
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

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
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

