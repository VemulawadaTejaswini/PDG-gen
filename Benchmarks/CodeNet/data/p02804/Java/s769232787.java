/*
    Author: Anthony Ngene
    Created: 22/07/2020 - 23:13
*/

import java.io.*;
import java.util.*;

public class Main {
    // Peace begins with a smile. – Mother Teresa
    private static final FastWriter out = new FastWriter();
    static ArrayList<Integer>[] adj;
    static HashMap<Integer, HashMap<Integer, Long>> cache;
    static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        CF_Reader in = new CF_Reader();

        cache = new HashMap<>();
        int n = in.intNext(), k = in.intNext() - 1;
        long[] arr = new long[n];
        long[] coefficients = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.longNext();
            if (i >= k) coefficients[i] = nCr_withMod(i, k, MOD);
        }
        Arrays.sort(arr);
        long sums = 0;
        long subs = 0;
        for (int i = 0; i < n; i++) {
            sums = (sums + (arr[i] * coefficients[i]) % MOD) % MOD;
            subs = (subs + (arr[i] * coefficients[n - i - 1]) % MOD) % MOD;
        }
        out.println((sums - subs + MOD) % MOD);

        out.close();
    }

    static long binpow_withMod(long a, long b, long MOD) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }

    static long nPr_withMod(int n, int r, long MOD) {
        long res = 1;
        for (int i = (n - r + 1); i <= n; i++) {
            res = (res * i) % MOD;
        }
        return res;
    }

    static long nCr_withMod(int n, int r, long MOD) {
        long r_factorial = nPr_withMod(r, r, MOD);
        long first = nPr_withMod(n, r, MOD);
        long second = binpow_withMod(r_factorial, MOD-2, MOD);
        return  (first * second) % MOD;
    }

    static class FastWriter {
        private static final int IO_BUFFERS = 128 * 1024;
        private final StringBuilder out;

        public FastWriter() {
            out = new StringBuilder(IO_BUFFERS);
        }

        public FastWriter p(Object object) {
            out.append(object);
            return this;
        }

        public FastWriter p(String format, Object... args) {
            out.append(String.format(format, args));
            return this;
        }

        public FastWriter println(Object object) {
            out.append(object).append("\n");
            return this;
        }

        public void close() throws IOException {
            System.out.print(out);
        }
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }

    static class util {
        public static int upperBound(long[] array, long obj) {
            int l = 0, r = array.length - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj < array[c]) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static int upperBound(ArrayList<Long> array, long obj) {
            int l = 0, r = array.size() - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj < array.get(c)) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static int lowerBound(long[] array, long obj) {
            int l = 0, r = array.length - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj <= array[c]) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static int lowerBound(ArrayList<Long> array, long obj) {
            int l = 0, r = array.size() - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj <= array.get(c)) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static void print(long[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        public static void print(int[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        public static void print(char[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        static <T> T[][] deepCopy(T[][] matrix) {
            return Arrays.stream(matrix).map(el -> el.clone()).toArray($ -> matrix.clone());
        }

        static int[][] deepCopy(int[][] matrix) {
            return Arrays.stream(matrix).map(int[]::clone).toArray($ -> matrix.clone());
        }
    }

    static class Tuple implements Comparable<Tuple> {
        int a;
        int b;

        public Tuple(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int compareTo(Tuple other) {
            if (this.a == other.a) return Integer.compare(this.b, other.b);
            return Integer.compare(this.a, other.a);
        }

        @Override
        public int hashCode() {
            return Arrays.deepHashCode(new Integer[]{a, b});
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Tuple)) return false;
            Tuple pairo = (Tuple) o;
            return (this.a == pairo.a && this.b == pairo.b);
        }

        @Override
        public String toString() {
            return String.format("%d,%d  ", this.a, this.b);
        }
    }
}
