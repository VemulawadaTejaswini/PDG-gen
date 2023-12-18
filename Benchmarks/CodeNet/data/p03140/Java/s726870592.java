import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BTouitsu solver = new BTouitsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTouitsu {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt();
            String s1 = in.readLine(), s2 = in.readLine(), s3 = in.readLine();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                char ch1 = s1.charAt(i), ch2 = s2.charAt(i), ch3 = s3.charAt(i);
                if (ch1 != ch2 && ch2 != ch3 && ch3 != ch1) {
                    ans += 2;
                }
                if (ch1 == ch2 && ch2 == ch3) {
                    ans += 0;
                }
                if (ch1 == ch2 && ch2 != ch3) {
                    ans += 1;
                }
                if (ch2 == ch3 && ch1 != ch2) {
                    ans += 1;
                }
                if (ch3 == ch1 && ch1 != ch2) {
                    ans += 1;
                }
            }
            out.println(ans);
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

