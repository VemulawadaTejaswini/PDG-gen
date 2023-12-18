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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            String[] s = in.readStringArray(h);

            int[][] u = new int[h][w];
            int[][] d = new int[h][w];
            int[][] l = new int[h][w];
            int[][] r = new int[h][w];

            for (int i = 0; i < w; i++) {
                int cnt = 0;
                for (int j = 0; j < h; j++) {
                    cnt = s[j].charAt(i) == '.' ? cnt + 1 : 0;
                    u[j][i] = cnt;
                }
            }

            for (int i = 0; i < w; i++) {
                int cnt = 0;
                for (int j = 0; j < h; j++) {
                    cnt = s[h - 1 - j].charAt(i) == '.' ? cnt + 1 : 0;
                    d[h - 1 - j][i] = cnt;
                }
            }

            for (int i = 0; i < h; i++) {
                int cnt = 0;
                for (int j = 0; j < w; j++) {
                    cnt = s[i].charAt(j) == '.' ? cnt + 1 : 0;
                    l[i][j] = cnt;
                }
            }

            for (int i = 0; i < h; i++) {
                int cnt = 0;
                for (int j = 0; j < w; j++) {
                    cnt = s[i].charAt(w - 1 - j) == '.' ? cnt + 1 : 0;
                    r[i][w - 1 - j] = cnt;
                }
            }

            int ans = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (s[i].charAt(j) == '.') {
                        ans = Math.max(ans, u[i][j] + d[i][j] + l[i][j] + r[i][j] - 3);
                    }
                }
            }

            out.printLine(ans);
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

        public String[] readStringArray(int size) {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = readString();
            }
            return array;
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

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

