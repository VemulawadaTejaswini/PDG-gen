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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int q = in.nextInt();

            while (q-- > 0) {
                StringBuilder sb = new StringBuilder();

                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt() - 1;
                int d = in.nextInt() - 1;

                if (a > b) {

                    int lo = 1;
                    int hi = a;

                    int ans = a;
                    while (lo <= hi) {
                        int mid = (lo + hi) / 2;

                        if ((mid * (b + 1)) >= a) {
//                        if (b <= mid || (b > mid && (b - mid + 1) <= a)) {
//                            ans = Math.min(ans, mid);
//                            hi = mid - 1;
//                        } else {
                            ans = Math.min(ans, mid);
                            hi = mid - 1;
                            //}
                        } else {
                            lo = mid + 1;
                        }
                    }

                    int ca = a;
                    int cb = b;


                    while (ca > 0 || cb > 0) {
                        int j = 0;
                        while (j < ans && ca > 0 && ca > ((cb + ans - 1) / ans) - 1) {
                            sb.append('A');
                            j++;
                            ca--;
                        }
                        j = 0;
                        if (cb > 0) {
                            sb.append('B');
                            cb--;
                            j++;
                        }
                        while (j < ans && cb > 0 && ca < ((cb + ans - 1) / ans)) {
                            sb.append('B');
                            cb--;
                            j++;
                        }
                    }
                } else if (b > a) {
                    int lo = 1;
                    int hi = b;

                    int ans = b;
                    while (lo <= hi) {
                        int mid = (lo + hi) / 2;

                        if ((mid * (a + 1)) >= b) {
//                        if (a <= mid || (a > mid && (a - mid + 1) <= b)) {
//                            ans = Math.min(ans, mid);
//                            hi = mid - 1;
//                        } else {
                            hi = mid - 1;
                            ans = Math.min(ans, mid);
                            //}
                        } else {
                            lo = mid + 1;
                        }
                    }

                    int ca = a;
                    int cb = b;


                    while (ca > 0 || cb > 0) {
                        int j = 0;
                        while (j < ans && cb > 0 && cb > ((ca + ans - 1) / ans) - 1) {
                            sb.append('B');
                            j++;
                            cb--;
                        }
                        j = 0;
                        if (ca > 0) {
                            sb.append('A');
                            ca--;
                            j++;
                        }
                        while (j < ans && ca > 0 && cb < ((ca + ans - 1) / ans)) {
                            sb.append('A');
                            ca--;
                            j++;
                        }
                    }

                    sb = sb.reverse();
                } else {
                    for (int i = 0; i < a; i++) {
                        sb.append('A');
                        sb.append('B');
                    }
                }

                out.println(sb.substring(c, d + 1));
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

