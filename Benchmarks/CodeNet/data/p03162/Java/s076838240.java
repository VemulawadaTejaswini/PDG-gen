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
 * @author real
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Vacation solver = new Vacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class Vacation {
        int n;
        int[][] act;
        int[][][] dp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            act = new int[3][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    act[j][i] = in.nextInt();
                }
            }
            dp = in.memset(n + 1, 3, 2, -1);
            int mx = 0;
            for (int i = 0; i < 3; i++) {
                mx = Math.max(mx, solve(0, i, 0));
            }
            out.println(mx);
        }

        int solve(int day, int activity, int ct) {
            if (day == n)
                return 0;
            if (dp[day][activity][ct] != -1)
                return dp[day][activity][ct];
            int max = 0;
            if (ct == 1) {
                for (int i = 0; i < 3; i++) {
                    if (i != activity) {
                        max = Math.max(max, solve(day + 1, i, 1) + act[i][day]);
                    }
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (i == activity) {
                        max = Math.max(max, solve(day + 1, i, ct + 1) + act[i][day]);
                    } else {
                        max = Math.max(max, solve(day + 1, i, 1) + act[i][day]);
                    }
                }
            }
            return dp[day][activity][ct] = max;
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
            // for test cases make sure println(); ;)
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

        public int[][][] memset(int n, int m, int l, int val) {
            int ar[][][] = new int[n][][];
            for (int i = 0; i < n; i++) {
                ar[i] = memset(m, l, val);
            }
            return ar;
        }

        public int[][] memset(int n, int m, int val) {
            int ar[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                ar[i] = memset(m, val);
            }
            return ar;
        }

        public int[] memset(int n, int val) {
            int ar[] = new int[n];
            Arrays.fill(ar, val);
            return ar;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

