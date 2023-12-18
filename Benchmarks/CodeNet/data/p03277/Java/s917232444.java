// package arc.arc101;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n  = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        List<Integer> aa = new ArrayList<>(set);
        Collections.sort(aa);

        long comb = (long)n*(n+1)/2;
        int fr = -1;
        int to = aa.size()-1;
        while (to - fr > 1) {
            int med = (to + fr) / 2;
            if (findNth(aa.get(med), a.clone(), comb/2) == 0) {
                fr = med;
            } else {
                to = med;
            }
        }

//        for (int i = 0; i < aa.size(); i++) {
//            debug(i, aa.get(i), findWay(aa.get(i), a.clone()));
//        }


        out.println(aa.get(to));
        out.flush();
    }

    static FenwickTree fen = new FenwickTree(200010);

    private static int findNth(int v, int[] a, long nth) {
        return findWay(v, a) <= nth ? 0 : 1;
    }

    private static long findWay(int v, int[] a) {
        int n = a.length;
        for (int i = 0; i < n ; i++) {
            if (a[i] <= v) {
                a[i] = -1;
            } else {
                a[i] = 1;
            }
        }

        int GETA = fen.data.length/2;
        Arrays.fill(fen.data, 0);

        fen.add(GETA, 1);

        long totalLeqZero = 0;
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += a[i];
            totalLeqZero += fen.range(GETA+sum+1, fen.data.length-1);
            fen.add(GETA+sum, 1);
        }
        return totalLeqZero;
    }

    public static class FenwickTree {
        long N;
        long[] data;

        public FenwickTree(int n) {
            N = n;
            data = new long[n + 1];
        }

        /**
         * Computes value of [1, i].
         * <p>
         * O(logn)
         *
         * @param i
         * @return
         */
        public long sum(int i) {
            long s = 0;
            while (i > 0) {
                s += data[i];
                i -= i & (-i);
            }
            return s;
        }

        /**
         * Computes value of [i, j].
         * <p>
         * O(logn)
         *
         * @param i
         * @param j
         * @return
         */
        public long range(int i, int j) {
            return sum(j) - sum(i - 1);
        }

        /**
         * Sets value x into i-th position.
         * <p>
         * O(logn)
         *
         * @param i
         * @param x
         */
        public void set(int i, long x) {
            add(i, x - range(i, i));
        }

        /**
         * Adds value x into i-th position.
         * <p>
         * O(logn)
         *
         * @param i
         * @param x
         */
        public void add(int i, long x) {
            while (i <= N) {
                data[i] += x;
                i += i & (-i);
            }
        }
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}