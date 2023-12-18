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
 * @author ankur
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
            int n = in.nextInt();
            int ar[] = in.nextIntArray(n);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += ar[i];
            }
            long tosub = (long) n * (n + 1);
            tosub = tosub / 2;
            pair arr[] = new pair[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new pair(ar[i], i + 1);
            }
            Arrays.sort(arr);
            long mult = n;
            long ans = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                //System.out.println(arr[i].val);
                long val = arr[i].val;
                long b = arr[i].val - arr[i].ind;
                //System.out.println(b);
                ans = Math.min(ans, sum - mult * b - tosub);
                sum = sum - 2 * val;
                tosub = tosub - 2 * arr[i].ind;
                mult = mult - 2;
                // System.out.println(ans);
            }
            out.print(ans);


        }

        class pair implements Comparable<pair> {
            int val;
            int ind;

            pair(int v, int i) {
                val = v;
                ind = i;
            }

            public int compareTo(pair o) {
                return this.val - this.ind - o.val + o.ind;
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

