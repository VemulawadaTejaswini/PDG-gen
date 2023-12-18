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
 *
 * @author ankur
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = in.nextIntArray(n);
            int b[] = in.nextIntArray(n);
            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    out.print(-1);
                    return;
                }
            }
            long ans = 0;
            while (true) {
                int val = -1;
                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        if (a[i] - b[i] > b[i]) {
                            int x = a[i] - b[i];
                            for (int j = b[i] + 1; j <= 50; j++) {
                                if (x % j == 0) {
                                    val = Math.max(val, j);
                                    break;
                                }
                            }
                        }
                    }
                }
                // System.out.println(val);
                if (val == -1) {
                    break;
                }
                ans += (long) Math.pow(2, val);
                for (int i = 0; i < n; i++) {
                    if ((a[i] % val) == b[i]) {
                        a[i] = a[i] % val;
                    } else {
                        int va = a[i] % val;
                        if (va - b[i] > b[i]) {
                            a[i] = va;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    out.print(-1);
                    return;
                }
            }
            out.print(ans);


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
            //*-*------clare------
//remeber while comparing 2 non primitive data type not to use ==
//remember Arrays.sort for primitive data has worst time case complexity of 0(n^2) bcoz it uses quick sort
//again silly mistakes ,yr kb tk krta rhega ye mistakes
//try to write simple codes ,break it into simple things
//knowledge>rating
        /*
        public class Main
        implements Runnable{
    public static void main(String[] args) {
        new Thread(null,new Main(),"Main",1<<26).start();

    }
    public void run() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();//chenge the name of task
        solver.solve(1, in, out);
        out.close();
    }
         */

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

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

