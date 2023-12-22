import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.TreeSet;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    static final int D = 365;
    static final int A = 26;
    static final int[] c = new int[A];
    static final int[][] s = new int[D][A];
    static final double[][] w = new double[D][A];
    static final int[] x = new int[D];
    static final ArrayList<TreeSet<Integer>> lists = new ArrayList<>(A);
    static final int CLIMB = 300000;
    static final int SWAP = 700000;
    static final Random rnd;
    static {
        rnd = new Random(System.nanoTime());
        for (int i = 0; i < A; i++) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(-1);
            set.add(D);
            lists.add(set);
        }
    }

    public static void main(String[] args) {
        A(false);
    }

    static void A(boolean debug) {
        if (debug) {
            try {
                System.setIn(new FileInputStream(new File("tester/example/sample2.in")));
                System.setOut(new PrintStream(new File("out")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        input();
        setWeight(50);
        long score;
        score = initialize();
        score = climb(score, debug);
        score = swapClimb(score, debug);
        if (debug) {
            long expected = score()[D - 1];
            if (expected != score) {
                System.out.println(score);
                System.out.println(expected);
                String err = String.format("\nexpected = %d\nactual = %d", expected, score);
                throw new RuntimeException(err);
            }
        }
        output();
    }

    static long climb(long initailScore, boolean debug) {
        StringBuilder db = new StringBuilder();
        long max = initailScore;
        for (int i = 0; i < CLIMB; i++) {
            int day = weightedRandomDay(D);
            int fr = x[day];
            int to = weightedRandomContest(day);
            long newScore = ifChanged(day, fr, to, max);
            if (newScore > max) {
                change(day, fr, to);
                max = newScore;
            }
            if (debug) {
                db.append(max).append('\n');
            }
        }
        if (debug) {
            System.out.print(db);
        }
        return max;
    }

    static long swapClimb(long tmpScore, boolean debug) {
        StringBuilder db = new StringBuilder();
        long max = tmpScore;
        for (int i = 0; i < SWAP; i++) {
            int day1 = weightedRandomDay(D);
            int day2;
            do {day2 = weightedRandomDay(day1);} while (x[day1] == x[day2]);
            long newScore = ifSwapped(day1, day2, max);
            if (newScore > max) {
                swap(day1, day2);
                max = newScore;
            }
            if (debug) {
                db.append(max).append('\n');
            }
        }
        if (debug) {
            System.out.print(db);
        }
        return max;
    }

    static long ifChanged(int day, int fr, int to, long oldScore) {
        long newScore = oldScore;
        int l, r;
        l = lists.get(fr).lower(day);
        r = lists.get(fr).higher(day);
        newScore += ((r - day - 1) * (r - day) + (day - l - 1) * (day - l)) * c[fr] / 2;
        newScore -= (r - l - 1) * (r - l) * c[fr] / 2;
        l = lists.get(to).lower(day);
        r = lists.get(to).higher(day);
        newScore -= ((r - day - 1) * (r - day) + (day - l - 1) * (day - l)) * c[to] / 2;
        newScore += (r - l - 1) * (r - l) * c[to] / 2;
        newScore += s[day][to] - s[day][fr];
        return newScore;
    }

    static long ifSwapped(int day1, int day2, long oldScore) {
        int x1 = x[day1];
        int x2 = x[day2];
        long newScore = ifChanged(day1, x1, x2, oldScore);
        change(day1, x1, x2);
        newScore = ifChanged(day2, x2, x1, newScore);
        change(day1, x2, x1);
        return newScore;
    }

    static void change(int day, int fr, int to) {
        lists.get(fr).remove(day);
        lists.get(to).add(day);
        x[day] = to;
    }


    static void swap(int day1, int day2) {
        int x1 = x[day1];
        int x2 = x[day2];
        lists.get(x1).remove(day1);
        lists.get(x2).remove(day2);
        lists.get(x1).add(day2);
        lists.get(x2).add(day1);
        x[day1] = x2;
        x[day2] = x1;
    }

    static void setWeight(int param) {
        for (int i = 0; i < D; i++) {
            double sum = 0;
            for (int j = 0; j < A; j++) {
                sum += c[j] * param + s[i][j];
            }
            for (int j = 0; j < A; j++) {
                w[i][j] = (c[j] * param + s[i][j]) / sum;
                if (j > 0) {
                    w[i][j] += w[i][j - 1];
                }
            }
        }
    }

    static int weightedRandomContest(int day) {
        double v = rnd.nextInt((int) 1e9) / 1e9;
        int l = -1, r = A;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (w[day][m] < v) {
                l = m;
            } else {
                r = m;
            }
        }
        return r == A ? 0 : r;
    }

    static int weightedRandomDay(int c) {
        int v = rnd.nextInt(D * (D + 1) / 2) + 1;
        int l = 0, r = D;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (m * (m - 1) / 2 <= v) {
                l = m;
            } else {
                r = m;
            }
        }
        return (r + c - 1) % D;
    }

    static long initialize() {
        int[] last = new int[A];
        long score = 0;
        for (int i = 0; i + 2 < D; i += 3) {
            long max = -Const.LINF;
            int mx1 = -1, mx2 = -1, mx3 = -1;
            for (int x1 = 0; x1 < A; x1++) for (int x2 = 0; x2 < A; x2++) for (int x3 = 0; x3 < A; x3++) {
                int l1 = last[x1], l2 = last[x2], l3 = last[x3];
                long delta = 0;
                last[x1] = i + 1;
                delta += s[i][x1];
                for (int j = 0; j < A; j++) {
                    delta -= c[j] * (i + 1 - last[j]);
                }
                last[x2] = i + 2;
                delta += s[i + 1][x2];
                for (int j = 0; j < A; j++) {
                    delta -= c[j] * (i + 2 - last[j]);
                }
                last[x3] = i + 3;
                delta += s[i + 2][x3];
                for (int j = 0; j < A; j++) {
                    delta -= c[j] * (i + 3 - last[j]);
                }
                if (delta > max) {
                    max = delta;
                    mx1 = x1; mx2 = x2; mx3 = x3;
                }
                last[x1] = l1; last[x2] = l2; last[x3] = l3;
            }
            x[i] = mx1;
            x[i + 1] = mx2;
            x[i + 2] = mx3;
            last[mx1] = i + 1;
            last[mx2] = i + 2;
            last[mx3] = i + 3;
            lists.get(mx1).add(i);
            lists.get(mx2).add(i + 1);
            lists.get(mx3).add(i + 2);
            score += max;
        }
        long max = -Const.LINF;
        int mx1 = -1, mx2 = -1;
        for (int x1 = 0; x1 < A; x1++) for (int x2 = 0; x2 < A; x2++) {
            int l1 = last[x1], l2 = last[x2];
            long delta = 0;
            last[x1] = D - 1;
            delta += s[D - 2][x1];
            for (int j = 0; j < A; j++) {
                delta -= c[j] * (D - 1 - last[j]);
            }
            last[x2] = D;
            delta += s[D - 1][x2];
            for (int j = 0; j < A; j++) {
                delta -= c[j] * (D - last[j]);
            }
            if (delta > max) {
                max = delta;
                mx1 = x1; mx2 = x2;
            }
            last[x1] = l1; last[x2] = l2;
        }
        x[D - 2] = mx1;
        x[D - 1] = mx2;
        last[mx1] = D - 1;
        last[mx2] = D;
        lists.get(mx1).add(D - 2);
        lists.get(mx2).add(D - 1);
        score += max;
        return score;
    }

    static void input() {
        In.ni();
        Arrays.setAll(c, $ -> In.ni());
        for (int i = 0; i < D; i++) Arrays.setAll(s[i], $ -> In.ni());
    }

    static void output() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < D; i++) sb.append(x[i] + 1).append('\n');
        System.out.print(sb);
        System.out.flush();
    }

    static void B() {
        input();
        Arrays.setAll(x, $ -> In.ni() - 1);
        for (int i = 0; i < D; i++) {
            lists.get(x[i]).add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (long v : score()) sb.append(v).append('\n');
        System.out.print(sb);
    }

    static void C() {
        input();
        Arrays.setAll(x, $ -> In.ni() - 1);
        for (int i = 0; i < D; i++) {
            lists.get(x[i]).add(i);
        }
        StringBuilder sb = new StringBuilder();
        long score = score()[D - 1];
        int m = In.ni();
        while (m --> 0) {
            int day = In.ni() - 1;
            int fr = x[day];
            int to = In.ni() - 1;
            score = ifChanged(day, fr, to, score);
            change(day, fr, to);
            sb.append(score).append('\n');
        }
        System.out.print(sb);
    }

    static long[] score() {
        int[] last = new int[A];
        long[] score = new long[D];
        for (int i = 0; i < D; i++) {
            last[x[i]] = i + 1;
            score[i] += s[i][x[i]];
            for (int j = 0; j < A; j++) {
                score[i] -= c[j] * (i + 1 - last[j]);
            }
            if (i > 0) {
                score[i] += score[i - 1];
            }
        }
        return score;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};

    private Const(){}
}
