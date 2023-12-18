import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.SplittableRandom;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            Debug debug = new Debug(out);
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            a = ArrayUtils.sort(a);
            TreeSet<Integer> set = new TreeSet<>();
            ArrayList<int[]> anss = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                int den = a[i] >> 1;
                Integer low = set.floor(den);
                Integer hig = set.ceiling(den);
                set.add(a[i]);
                if (low == null && hig == null) continue;
                if (low == null) {
                    anss.add(new int[]{a[i], hig});
                }
                if (hig == null) {
                    anss.add(new int[]{a[i], low});
                }
                if (low != null && hig != null) {
                    int diff1 = den - low;
                    int diff2 = hig - den;
                    if (diff1 < diff2)
                        anss.add(new int[]{a[i], low});
                    else
                        anss.add(new int[]{a[i], hig});
                }
            }
            Collections.sort(anss, new Comparator<int[]>() {

                public int compare(int[] o1, int[] o2) {
                    long n1 = o1[0];
                    long n2 = o2[0];
                    long d1 = o1[1] * (o1[0] - o1[1]);
                    long d2 = o2[1] * (o2[0] - o2[1]);
                    return -Long.compare(n2 * d1, n1 * d2);
                }
            });
            if (anss.size() == 1) {
                int[] cur = anss.get(0);
                out.println(cur[0] + " " + cur[1]);
            } else {
                int[] cur = anss.get(0);
                out.println(cur[0] + " " + cur[1]);
            }
        }

    }

    static class Debug {
        PrintWriter out;
        boolean oj;
        boolean system;
        long timeBegin;
        Runtime runtime;

        public Debug(PrintWriter out) {
            oj = System.getProperty("ONLINE_JUDGE") != null;
            this.out = out;
            this.timeBegin = System.currentTimeMillis();
            this.runtime = Runtime.getRuntime();
        }

        public Debug() {
            system = true;
            oj = System.getProperty("ONLINE_JUDGE") != null;
            OutputStream outputStream = System.out;
            this.out = new PrintWriter(outputStream);
            this.timeBegin = System.currentTimeMillis();
            this.runtime = Runtime.getRuntime();
        }

    }

    static class ArrayUtils {
        public static int[] sort(int[] a) {
            a = shuffle(a, new SplittableRandom());
            Arrays.sort(a);
            return a;
        }

        public static int[] shuffle(int[] a, SplittableRandom gen) {
            for (int i = 0, n = a.length; i < n; i++) {
                int ind = gen.nextInt(n - i) + i;
                int d = a[i];
                a[i] = a[ind];
                a[ind] = d;
            }
            return a;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

