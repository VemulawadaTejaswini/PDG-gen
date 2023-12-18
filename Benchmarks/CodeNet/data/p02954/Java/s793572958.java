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
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DGatheringChildren solver = new DGatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGatheringChildren {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.nextString();

            int n = s.length();

            ArrayList<Segment> r = new ArrayList<>();
            for (int left = 0; left < n; left++) {
                if (s.charAt(left) == 'R') {
                    int right = left;
                    while (right < n && s.charAt(right) == 'R') right++;
                    if (right == n || s.charAt(right) == 'L') right--;
                    r.add(new Segment(left, right));
                }
            }
            ArrayList<Segment> l = new ArrayList<>();
            for (int left = 0; left < n; left++) {
                if (s.charAt(left) == 'L') {
                    int right = left;
                    while (right < n && s.charAt(right) == 'L') right++;
                    if (right == n || s.charAt(right) == 'R') right--;
                    l.add(new Segment(left, right));
                }
            }


            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'R') {
                    int j = i + 1;
                    for (Segment seg : l) {
                        if (i < seg.left) {
                            j = seg.left;
                            break;
                        }
                    }
                    int dist = j - i;
                    if (dist % 2 == 0) {
                        a[j]++;
                    } else {
                        a[j - 1]++;
                    }
                } else {
                    int j = i - 1;
                    for (Segment seg : r) {
                        if (i > seg.right) {
                            j = seg.right;
                        }
                    }

                    int dist = i - j;
                    if (dist % 2 == 0) {
                        a[j]++;
                    } else {
                        a[j + 1]++;
                    }
                }
            }

            out.println(a);
        }

        private class Segment {
            private int left;
            private int right;

            private Segment(int left, int right) {
                this.left = left;
                this.right = right;
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

        public String nextString() {
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

        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void println(int[] array) {
            print(array);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

