import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FStringsOfEternity solver = new FStringsOfEternity();
        solver.solve(1, in, out);
        out.close();
    }

    static class FStringsOfEternity {
        boolean isInf = false;
        boolean[] called;
        String s;
        String t;
        RollingHash hash;
        long cmp;
        int[] mem;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            s = in.next();
            t = in.next();
            int repeat = (t.length() - 1 + s.length()) / s.length();

            called = new boolean[s.length()];
            mem = new int[s.length()];
            ArrayUtil.fill(called, false);
            ArrayUtil.fill(mem, -1);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= repeat; i++)
                sb.append(s);
            sb.append("*");
            int len = sb.length();
            sb.append(t);
            hash = new RollingHash(new String(sb));

            // tのhash
            cmp = hash.slice(len, t.length());
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                res = Math.max(res, calc(i, i, false));
                if (isInf) {
                    out.println(-1);
                    return;
                }
            }
            out.println(res);
        }

        int calc(int start, int index, boolean inLoop) {
            if (inLoop && (start == index)) {
                isInf = true;
                return 0;
            }
            if (mem[index] != -1) return mem[index];
            return mem[index] = hash.slice(index, t.length()) == cmp ? calc(start, (index + t.length()) % s.length(), true) + 1 : 0;
        }

    }

    static class RollingHash {
        private static final int MAX_LENGTH = 500000;
        private final static long MASK30 = (1L << 30) - 1;
        private final static long MASK31 = (1L << 31) - 1;
        private final static long MOD = (1L << 61) - 1;
        private final static long POSITIVER = MOD * 3;
        private static int Base;
        private static long[] pow = new long[MAX_LENGTH + 1];
        public long[] hash;

        static {
            Base = new Random().nextInt((int) 1e9) + 129;
            pow[0] = 1;
            for (int i = 1; i < pow.length; i++) {
                pow[i] = calc(mul(pow[i - 1], Base));
            }
        }

        public RollingHash(String s) {
            hash = new long[s.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                hash[i + 1] = calc(mul(hash[i], Base) + s.charAt(i));
            }
        }

        public long slice(int begin, int length) {
            return calc(hash[begin + length] + POSITIVER - mul(hash[begin], pow[length]));
        }

        private static long mul(long l, long r) {
            long lu = l >> 31;
            long ld = l & MASK31;
            long rd = r & MASK31;
            long ru = r >> 31;
            long mid = ld * ru + lu * rd;
            return ((lu * ru) << 1) + ld * rd + ((mid & MASK30) << 31) + (mid >> 30);
        }

        private static long calc(long v) {
            v = (v & MOD) + (v >> 61);
            if (v >= MOD) v -= MOD;
            return v;
        }

    }

    static class ArrayUtil {
        public static void fill(boolean[] array, boolean value) {
            Arrays.fill(array, value);
        }

        public static void fill(int[] array, int val) {
            Arrays.fill(array, val);
        }

    }
}

