import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ankur
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        newsihsabjsf solver = new newsihsabjsf();
        solver.solve(1, in, out);
        out.close();
    }

    static class newsihsabjsf {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int ar[] = in.nextIntArray(n);

            int min = in.min(ar);
            int max = in.max(ar);
            int xi = -1;
            int ni = -1;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == min) {
                    ni = i;
                    //   break;
                }
                if (ar[i] == max)
                    xi = i;
            }
            for (int i = 1; i < n; i++) {
                if (ar[i - 1] > ar[i]) {
                    if (Math.abs(max) > Math.abs(min)) {
                        ar[i] += 2 * max;
                        list.add(xi);
                        list.add(i);
                        list.add(xi);
                        list.add(i);
                        if (max < ar[i]) {
                            max = ar[i];
                            xi = i;
                        }
                    } else {
                        list.add(ni);
                        list.add(i - 1);
                        list.add(ni);
                        list.add(i - 1);
                        ar[i - 1] += 2 * min;
                        if (ar[i - 1] < min) {
                            min = ar[i - 1];
                            ni = i - 1;
                        }
                    }
                }

            }
            out.println(list.size() / 2);
            for (int i = 0; i < list.size(); i += 2) {
                out.println((list.get(i) + 1) + " " + (list.get(i + 1) + 1));
            }
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

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int max(int ar[]) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < ar.length; i++) {
                max = Math.max(max, ar[i]);
            }
            return max;
        }

        public int min(int ar[]) {
            int min = Integer.MAX_VALUE;
            for (int x : ar)
                min = Math.min(min, x);
            return min;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

