import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Random;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            Random random = new Random(0xdead);

//        for (int it = 0; it < 10000; ++it) {
//            int n = random.nextInt(32) + 1;
//            int[] X = new int[n];
//            int[] Y = new int[n];
//            long[] V = new long[n];
//            for (int i = 0;i < n; ++i) {
//              X[i] = random.nextInt(100);
//              Y[i] = random.nextInt(100);
//              V[i] = Math.abs(random.nextLong() % (long)(1e15)) + 1;
//            }
//            int m = random.nextInt(32);
//            int[] T = new int[m];
//            int[] coord = new int[m];
//            int[] lim = new int[m];
//            for (int i = 0; i < m; ++i) {
//                char c = "LRDU".charAt(random.nextInt(4));
//                T[i] = c;
//                coord[i] = random.nextInt(100);
//                lim[i] = random.nextInt(100);
//            }
//            long res = megaSolve(n, X, Y, V, m, T, coord, lim);
////            res.longValue();
//            System.err.println(it);
//        }

            int n = in.nextInt();
//        int n = 80;
            int[] X = new int[n];
            int[] Y = new int[n];
            long[] V = new long[n];
            for (int i = 0; i < n; ++i) {
                X[i] = in.nextInt();
                Y[i] = in.nextInt();
                V[i] = in.nextLong();
//            X[i] = random.nextInt(100);
//            Y[i] = random.nextInt(100);
//            V[i] = Math.abs(random.nextLong() % (long)(1e15));
            }
            int m = in.nextInt();
//        int m = 320;
            int[] T = new int[m];
            int[] coord = new int[m];
            int[] lim = new int[m];
            for (int i = 0; i < m; ++i) {
                char c = in.nextToken().toCharArray()[0];
//            char c = "LRDU".charAt(random.nextInt(4));
                T[i] = c;
                coord[i] = in.nextInt();
                lim[i] = in.nextInt();
//            coord[i] = random.nextInt(100);
//            lim[i] = random.nextInt(1000);

            }

            long res = megaSolve(n, X, Y, V, m, T, coord, lim);
            out.printLine(Math.max(0, res));
        }

        public long megaSolve(int n, int[] x, int[] y, long[] v, int m, int[] t, int[] coord, int[] lim) {
            boolean[][] matches = new boolean[m][n];

            for (int i = 0; i < m; ++i) {
                char c = (char) t[i];
                for (int j = 0; j < n; ++j) {
                    if (c == 'L') matches[i][j] = (x[j] <= coord[i]);
                    if (c == 'R') matches[i][j] = (x[j] >= coord[i]);
                    if (c == 'D') matches[i][j] = (y[j] <= coord[i]);
                    if (c == 'U') matches[i][j] = (y[j] >= coord[i]);
                }
            }

            Rational[][] a = new Rational[m + n][n];
            for (int i = 0; i < m; ++i)
                for (int j = 0; j < n; ++j)
                    a[i][j] = matches[i][j] ? Rational.ONE : Rational.ZERO;
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j) {
                    a[m + i][j] = (i == j ? Rational.ONE : Rational.ZERO);
//                a[m + n + i][j] = (i == j ? Rational.ONE : Rational.ZERO).negate();
                }
            Rational[] b = new Rational[m + n];
            for (int i = 0; i < m; ++i)
                b[i] = Rational.valueOf(lim[i]);
            for (int i = 0; i < n; ++i) {
                b[m + i] = Rational.ONE;
//            b[m + n + i] = Rational.ZERO;
            }
            Rational[] c = new Rational[n];
            for (int i = 0; i < n; ++i)
                c[i] = Rational.valueOf(v[i]);
            Rational[] X = new Rational[n];
            Simplex.simplex(a, b, c, X);
//        for (int i = 0; i < n; ++i)
//            System.err.print(v[i] + " * " + X[i].toString() + " ");
//        System.err.println();
            int[] vals = new int[n];
            int nhalf = 0;
            for (int i = 0; i < n; ++i) {
                Rational cur = X[i].mul(Rational.valueOf(12));
                vals[i] = (int) cur.longValue();
                if (vals[i] != 0 && vals[i] != 12) ++nhalf;
//            if (X[i].den.equals(BigInteger.ONE)) {
//                vals[i] = X[i].num.equals(BigInteger.ONE) ? 2 : 0;
//            } else {
//                Assert.assertTrue(X[i].den.equals(BigInteger.valueOf(2)));
//                vals[i] = X[i].num.equals(BigInteger.ONE) ? 1 : 0;
//                if (vals[i] == 1) ++nhalf;
//            }
            }

            long res = 0;
            for (int i = 0; i < n; ++i)
                if (vals[i] == 12)
                    res += v[i];
            int[] sat = new int[m];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    if (matches[j][i])
                        sat[j] += vals[i];

            ArrayList<Integer>[] g = new ArrayList[nhalf];
            long[] nv = new long[nhalf];
            for (int i = 0; i < g.length; ++i)
                g[i] = new ArrayList<>();
            nhalf = 0;
            for (int i = 0; i < n; ++i) {
                if (vals[i] == 0 || vals[i] == 12) continue;
                nv[nhalf] = v[i];
                for (int j = 0; j < m; ++j)
                    if (matches[j][i]) {
                        Assert.assertTrue(sat[j] <= 12 * lim[j]);
                        if (sat[j] > 12 * (lim[j] - 1))
                            g[nhalf].add(j);
                    }
                ++nhalf;
            }
            Assert.assertTrue(nhalf == g.length);
            res += brute(g, nv);
            return res;
        }

        private long brute(ArrayList<Integer>[] g, long[] v) {
            int n = g.length;
            if (n == 0) return 0;
            ArrayList<Integer>[] rg = new ArrayList[400];
            for (int i = 0; i < rg.length; ++i)
                rg[i] = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                Assert.assertTrue(!g[i].isEmpty());
                for (int x : g[i])
                    rg[x].add(i);
            }
            ArrayList<Integer> order = new ArrayList<>();
            for (int i = 0; i < n; ++i)
                order.add(i);
            Random random = new Random(0xbeef);
            long res = 0;
            for (int it = 0; it < 1000; ++it) {
                Collections.shuffle(order, random);
                long cur = 0;
                boolean[] alive = new boolean[n];
                Arrays.fill(alive, true);
                for (int x : order) {
                    if (!alive[x]) continue;
                    cur += v[x];
                    for (int y : g[x])
                        for (int z : rg[y])
                            alive[z] = false;
                }
                res = Math.max(res, cur);
            }
            if (res == 0) {
                System.err.println(n);
                for (int i = 0; i < n; ++i)
                    System.err.println(v[i]);
            }
            Assert.assertTrue(res > 0);
            return res;
        }

    }

    static class Simplex {
        public static Rational simplex(Rational[][] A, Rational[] b, Rational[] c, Rational[] x) {
            int m = A.length;
            int n = A[0].length + 1;
            int[] index = new int[n + m];
            for (int i = 0; i < n + m; i++) {
                index[i] = i;
            }
            Rational[][] a = new Rational[m + 2][n + 1];
            for (Rational[] a1 : a) {
                Arrays.fill(a1, Rational.ZERO);
            }
            int L = m;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 1; j++) {
                    a[i][j] = A[i][j].negate();
                }
                a[i][n - 1] = Rational.ONE;
                a[i][n] = b[i];
                if (a[L][n].compareTo(a[i][n]) > 0) {
                    L = i;
                }
            }
            for (int j = 0; j < n - 1; j++) {
                a[m][j] = c[j];
            }
            a[m + 1][n - 1] = Rational.ONE.negate();
            for (int E = n - 1; ; ) {
                if (L < m) {
                    int t = index[E];
                    index[E] = index[L + n];
                    index[L + n] = t;
                    a[L][E] = a[L][E].inverse();
                    for (int j = 0; j <= n; j++) {
                        if (j != E) {
                            a[L][j] = a[L][j].mul(a[L][E].negate());
                        }
                    }
                    for (int i = 0; i <= m + 1; i++) {
                        if (i != L) {
                            for (int j = 0; j <= n; j++) {
                                if (j != E) {
                                    a[i][j] = a[i][j].add(a[L][j].mul(a[i][E]));
                                }
                            }
                            a[i][E] = a[i][E].mul(a[L][E]);
                        }
                    }
                }
                E = -1;
                for (int j = 0; j < n; j++) {
                    if (E < 0 || index[E] > index[j]) {
                        if (a[m + 1][j].signum() > 0 || a[m + 1][j].signum() == 0 && a[m][j].signum() > 0) {
                            E = j;
                        }
                    }
                }
                if (E < 0) {
                    break;
                }
                L = -1;
                for (int i = 0; i < m; i++) {
                    if (a[i][E].signum() < 0) {
                        Rational d;
                        if (L < 0 || (d = a[L][n].div(a[L][E]).sub(a[i][n].div(a[i][E]))).signum() < 0 || d.signum() == 0
                                && index[L + n] > index[i + n]) {
                            L = i;
                        }
                    }
                }
                if (L < 0) {
                    return Rational.POSITIVE_INFINITY;
                }
            }
            if (a[m + 1][n].signum() < 0) {
                return null;
            }
            if (x != null) {
                Arrays.fill(x, Rational.ZERO);
                for (int i = 0; i < m; i++)
                    if (index[n + i] < n - 1)
                        x[index[n + i]] = a[i][n];
            }
            return a[m][n];
        }

    }

    static class Assert {
        public static void assertTrue(boolean flag) {
//        if (!flag)
//        while (true);
            if (!flag)
                throw new AssertionError();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buffer = new byte[10000];
        private int cur;
        private int count;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isSpace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (count == -1) {
                throw new InputMismatchException();
            }
            try {
                if (cur >= count) {
                    cur = 0;
                    count = stream.read(buffer);
                    if (count <= 0)
                        return -1;
                }
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            return buffer[cur++];
        }

        public int readSkipSpace() {
            int c;
            do {
                c = read();
            } while (isSpace(c));
            return c;
        }

        public String nextToken() {
            int c = readSkipSpace();
            StringBuilder sb = new StringBuilder();
            while (!isSpace(c)) {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        public int nextInt() {
            int sgn = 1;
            int c = readSkipSpace();
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = read();
            } while (!isSpace(c));
            res *= sgn;
            return res;
        }

        public long nextLong() {
            long sgn = 1;
            int c = readSkipSpace();
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10L + (long) (c - '0');
                c = read();
            } while (!isSpace(c));
            res *= sgn;
            return res;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class Rational implements Comparable<Rational> {
        public BigInteger num;
        public BigInteger den;
        public static final Rational ZERO = new Rational(0);
        public static final Rational ONE = new Rational(1);
        public static final Rational POSITIVE_INFINITY = new Rational(1, 0);

        public Rational(long num) {
            this.num = BigInteger.valueOf(num);
            this.den = BigInteger.ONE;
        }

        public Rational(long num, long den) {
            this(BigInteger.valueOf(num), BigInteger.valueOf(den));
        }

        public Rational(BigInteger num, BigInteger den) {
            this.num = num;
            this.den = den;
            reduce();
        }

        void reduce() {
            if (!den.abs().equals(BigInteger.ONE)) {
                BigInteger gcd = num.gcd(den);
                if (gcd.signum() != 0 && !gcd.equals(BigInteger.ONE)) {
                    num = num.divide(gcd);
                    den = den.divide(gcd);
                }
            }
            if (den.signum() < 0 || den.signum() == 0 && num.signum() < 0) {
                num = num.negate();
                den = den.negate();
            }
        }

        public Rational add(Rational r) {
            return new Rational(num.multiply(r.den).add(r.num.multiply(den)), den.multiply(r.den));
        }

        public Rational sub(Rational r) {
            return new Rational(num.multiply(r.den).subtract(r.num.multiply(den)), den.multiply(r.den));
        }

        public Rational mul(Rational r) {
            return new Rational(num.multiply(r.num), den.multiply(r.den));
        }

        public Rational div(Rational r) {
            return new Rational(num.multiply(r.den), den.multiply(r.num));
        }

        public Rational negate() {
            return new Rational(num.negate(), den);
        }

        public Rational inverse() {
            return new Rational(den, num);
        }

        public int signum() {
            return num.signum();
        }

        public long longValue() {
            reduce();
            boolean okish = num.mod(den).equals(BigInteger.ZERO);
            if (!okish) {
                System.err.println(num + " / " + den);
                throw new RuntimeException();
            }
            return num.divide(den).longValue();
        }

        public int compareTo(Rational other) {
            return (num.multiply(other.den).compareTo(other.num.multiply(den)));
        }

        public boolean equals(Object obj) {
            return num.equals(((Rational) obj).num) && den.equals(((Rational) obj).den);
        }

        public int hashCode() {
            return num.hashCode() * 31 + den.hashCode();
        }

        public String toString() {
            return num + "/" + den;
        }

        public static Rational valueOf(long x) {
            return new Rational(x);
        }

    }
}

