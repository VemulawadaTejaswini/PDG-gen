import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cunbidun
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FMustBeRectangular solver = new FMustBeRectangular();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMustBeRectangular {
        private InputReader in;
        private PrintWriter out;
        private PrinterUtil printer;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.in = in;
            this.out = out;
            this.printer = new PrinterUtil(out);
            int n = in.nextInt();
            ArrayList<PairII>[] col = new ArrayList[100010];
            ArrayList<PairII>[] row = new ArrayList[100010];
            for (int i = 1; i <= 100000; i++) {
                col[i] = new ArrayList<>();
                row[i] = new ArrayList<>();
            }
            int[] x = new int[n + 1];
            int[] y = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                col[x[i]].add(new PairII(x[i], y[i]));
                row[y[i]].add(new PairII(x[i], y[i]));
            }
            boolean[] used = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (col[x[i]].size() == 1 && row[y[i]].size() == 1) used[i] = true;
            }
            TreeSet<Integer> set1 = new TreeSet<>();
            TreeSet<Integer> set2 = new TreeSet<>();
            int tot = 0;
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    set1.add(x[i]);
                    set2.add(y[i]);
                    tot++;
                }
            }
            out.println((long) set1.size() * set2.size() - tot);
        }

    }

    static class InputReader extends InputStream {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

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
            while (isSpaceChar(c))
                c = read();
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

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class PrinterUtil {
        private PrintWriter out;

        public PrinterUtil(PrintWriter out) {
            this.out = out;
        }

    }

    static class PairII implements Comparable<PairII> {
        public int first;
        public int second;

        public PairII(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PairII pair = (PairII) o;

            return first == pair.first && second == pair.second;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(PairII o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }
}

