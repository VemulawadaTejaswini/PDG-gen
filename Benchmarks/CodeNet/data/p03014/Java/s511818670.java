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
        public void solve(int testNumber, InputReader sc, OutputWriter out) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            char ar1[][] = new char[h][w];
            for (int i = 0; i < h; i++) {
                ar1[i] = sc.nextString().toCharArray();
            }
            int c1[][] = new int[h][w];
            for (int i = 0; i < h; i++) {
                int f = -1;
                for (int j = 0; j < w; j++) {
                    if (ar1[i][j] == '#')
                        f = j;
                    c1[i][j] = f;
                }
            }
            int c2[][] = new int[h][w];
            for (int i = 0; i < h; i++) {
                int f = w;
                for (int j = w - 1; j >= 0; j--) {
                    if (ar1[i][j] == '#')
                        f = j;
                    c2[i][j] = f;
                }
            }
            int c3[][] = new int[h][w];
            for (int i = 0; i < w; i++) {
                int f = -1;
                for (int j = 0; j < h; j++) {
                    if (ar1[j][i] == '#')
                        f = i;
                    c3[j][i] = f;
                }
            }
            int c4[][] = new int[h][w];
            for (int i = 0; i < w; i++) {
                int f = h;
                for (int j = h - 1; j >= 0; j--) {
                    if (ar1[j][i] == '#')
                        f = i;
                    c4[j][i] = f;
                }
            }
            int ans = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (ar1[i][j] == '#')
                        continue;
                    int a = c1[i][j];
                    int b = c2[i][j];
                    int c = c3[i][j];
                    int d = c4[i][j];
                    int dif1 = b - a;
                    int dif2 = d - c;
                    dif1 -= 1;
                    dif2 -= 1;
                    int aa = dif1 + dif2;
                    aa -= 1;
                    if (aa > ans)
                        ans = aa;
                }
            }
            out.println(ans);
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
}

