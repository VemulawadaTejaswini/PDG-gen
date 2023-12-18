import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Schitiz
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B_166 solver = new B_166();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_166 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            int m = in.ni();
            int[] height = new int[n];
            for(int i = 0; i < n; i++) {
                height[i] = in.ni();
            }

            int count = -1;
            boolean[] connected = new boolean[n];
            Arrays.fill(connected, false);
            for(int i = 0; i < m; i++) {
                int index1 = in.ni();
                int index2 = in.ni();
                if(height[index1 - 1] > height[index2 - 1] || height[index1 - 1] < height[index2 - 1]) {
                    if(!connected[index1 - 1] || !connected[index2 - 1]) {
                        count++;
                        connected[index1 - 1] = true;
                        connected[index2 - 1] = true;
                    }
                }
            }
            for(boolean b : connected) if(!b) count++;
            out.println(count);
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
            if(numChars == -1) {
                throw new InputMismatchException();
            }
            if(curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch(IOException e) {
                    throw new InputMismatchException();
                }
                if(numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int ni() {
            int c = read();
            while(isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if(c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if(c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while(!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            if(filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

