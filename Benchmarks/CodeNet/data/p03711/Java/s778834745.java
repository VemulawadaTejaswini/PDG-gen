import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Vector<Integer> a = new Vector<>();
            Vector<Integer> b = new Vector<>();
            int x = in.nextInt();
            int y = in.nextInt();

            if (x == 2 || y == 2) {
                out.print("No");
                return;
            }

            a.add(1);
            a.add(3);
            a.add(5);
            a.add(7);
            a.add(8);
            a.add(10);
            a.add(12);

            b.add(4);
            b.add(6);
            b.add(9);
            b.add(11);

            if (Collections.binarySearch(a, x) >= 0 && Collections.binarySearch(a, y) >= 0) {
                out.println("Yes");
                return;
            }
            if (Collections.binarySearch(b, x) >= 0 && Collections.binarySearch(b, y) >= 0) {
                out.println("Yes");
                return;
            }

            out.println("No");
            return;
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;

        public InputReader(InputStream st) {
            this.stream = st;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
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
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

