/*
    Author: Anthony Ngene
    Created: 26/07/2020 - 19:51
*/

import java.io.*;
import java.util.*;

public class Main {
    // The road to success and the road to failure are almost exactly the same. - Colin R. Davis
    static int[] arr;
    public static void main(String[] args) throws IOException {
        in = new FastScanner();

        int n = in.intNext();
        arr = in.nextIntArray(n);

        int minPrice = arr[0];
        long amount = 1000;
        for (int i = 1; i < n; i++) {
            int p = arr[i];
            minPrice = min(minPrice, p);
            if ((i < n - 1 && p > arr[i - 1] && p >= arr[i + 1]) || (i == n - 1 && p > arr[i - 1])) {
                long stocks = (amount / minPrice);
                long diff = amount - stocks * minPrice;
                amount = stocks * p + diff;
                minPrice = Integer.MAX_VALUE;
            }
        }
        out.println(amount);

        out.close();
    }

    private static final FastWriter out = new FastWriter();
    private static FastScanner in;
    static ArrayList<Integer>[] adj;
    private static long e97 = (long) 1e9 + 7;

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

        public FastWriter pp(Object... args) {
            for (Object ob : args) {
                out.append(ob).append(" ");
            }
            out.append("\n");
            return this;
        }

        public FastWriter println(Object object) {
            out.append(object).append("\n");
            return this;
        }

        public void toFile(String fileName) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(out.toString());
            writer.close();
        }

        public void close() throws IOException {
            System.out.print(out);
        }
    }

    static class FastScanner {
        private InputStream sin = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner() {
        }

        public FastScanner(String filename) throws FileNotFoundException {
            File file = new File(filename);
            sin = new FileInputStream(file);
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = sin.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long longNext() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b) || b == ':') {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int intNext() {
            long nl = longNext();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double doubleNext() {
            return Double.parseDouble(next());
        }

        public long[] nextLongArray(final int n) {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        public int[] nextIntArray(final int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public ArrayList<Integer>[] getAdj(int n) {
            ArrayList<Integer>[] adj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
            return adj;
        }

        public ArrayList<Integer>[] adjacencyList(int n, int m) throws IOException {
            adj = getAdj(n);
            for (int i = 0; i < m; i++) {
                int a = intNext(), b = intNext();
                adj[a].add(b);
                adj[b].add(a);
            }
            return adj;
        }
    }

    static class u {
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

        private static void sort(int[][] arr) {
            Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
        }

        private static void sort(long[][] arr) {
            Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
        }

        private static void rSort(Long[] arr) {
            Arrays.sort(arr, Collections.reverseOrder());
        }

        private static void rSort(Integer[] arr) {
            Arrays.sort(arr, Collections.reverseOrder());
        }

        private static void sortCustom(int[][] arr) {
            Arrays.sort(arr, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
                    return Integer.compare(a[0], b[0]);
                }
            });
        }

        public static int biSearch(int[] dt, int target) {
            int left = 0, right = dt.length - 1;
            int mid = -1;
            while (left <= right) {
                mid = (right + left) / 2;
                if (dt[mid] == target) return mid;
                if (dt[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            return -1;
        }

        public static int biSearchMax(long[] dt, long target) {
            int left = -1, right = dt.length;
            int mid = -1;

            while ((right - left) > 1) {
                mid = left + (right - left) / 2;
                if (dt[mid] <= target) left = mid;
                else right = mid;
            }
            return left;
        }

        public static int biSearchMaxAL(ArrayList<Integer> dt, long target) {
            int left = -1, right = dt.size();
            int mid = -1;

            while ((right - left) > 1) {
                mid = left + (right - left) / 2;
                if (dt.get(mid) <= target) left = mid;
                else right = mid;
            }
            return left;
        }

        private static void fill(boolean[] ob, boolean res) {
            for (int i = 0; i < ob.length; i++) {
                ob[i] = res;
            }
        }

        private static void fill(int[] ob, int res) {
            for (int i = 0; i < ob.length; i++) {
                ob[i] = res;
            }
        }

        private static void fill(long[] ob, long res) {
            for (int i = 0; i < ob.length; i++) {
                ob[i] = res;
            }
        }

        private static void fill(char[] ob, char res) {
            for (int i = 0; i < ob.length; i++) {
                ob[i] = res;
            }
        }

        private static void fill(double[] ob, double res) {
            for (int i = 0; i < ob.length; i++) {
                ob[i] = res;
            }
        }

        private static void fill(boolean[][] ob, boolean res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    ob[i][j] = res;
                }
            }
        }

        private static void fill(int[][] ob, int res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    ob[i][j] = res;
                }
            }
        }

        private static void fill(long[][] ob, long res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    ob[i][j] = res;
                }
            }
        }

        private static void fill(char[][] ob, char res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    ob[i][j] = res;
                }
            }
        }

        private static void fill(double[][] ob, double res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    ob[i][j] = res;
                }
            }
        }

        private static void fill(int[][][] ob, int res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    for (int k = 0; k < ob[0][0].length; k++) {
                        ob[i][j][k] = res;
                    }
                }
            }
        }
        private static void fill(long[][][] ob, long res) {
            for (int i = 0; i < ob.length; i++) {
                for (int j = 0; j < ob[0].length; j++) {
                    for (int k = 0; k < ob[0][0].length; k++) {
                        ob[i][j][k] = res;
                    }
                }
            }
        }

        private static void fill_parent(int[] ob) {
            for (int i = 0; i < ob.length; i++) ob[i] = i;
        }

        private static int arrMin(int... ins) {
            int min = ins[0];
            for (int i = 1; i < ins.length; i++) {
                if (ins[i] < min) min = ins[i];
            }
            return min;
        }

        private static int arrMax(int... ins) {
            int max = ins[0];
            for (int i = 1; i < ins.length; i++) {
                if (ins[i] > max) max = ins[i];
            }
            return max;
        }

        private static long arrMin(long... ins) {
            long min = ins[0];
            for (int i = 1; i < ins.length; i++) {
                if (ins[i] < min) min = ins[i];
            }
            return min;
        }

        private static long arrMax(long... ins) {
            long max = ins[0];
            for (int i = 1; i < ins.length; i++) {
                if (ins[i] > max) max = ins[i];
            }
            return max;
        }

        private static boolean same3(long a, long b, long c) {
            if (a != b) return false;
            if (b != c) return false;
            if (c != a) return false;
            return true;
        }

        private static boolean dif3(long a, long b, long c) {
            if (a == b) return false;
            if (b == c) return false;
            if (c == a) return false;
            return true;
        }

        private static double hypotenuse(double a, double b) {
            return Math.sqrt(a * a + b * b);
        }

        private static long factorial(int n) {
            long ans = 1;
            for (long i = n; i > 0; i--) {
                ans *= i;
            }
            return ans;
        }

        private static long facMod(int n, long mod) {
            long ans = 1;
            for (long i = n; i > 0; i--) ans = (ans * i) % mod;
            return ans;
        }

        private static long lcm(long m, long n) {
            long ans = m / gcd(m, n);
            ans *= n;
            return ans;
        }

        private static long gcd(long m, long n) {
            if (m < n) return gcd(n, m);
            if (n == 0) return m;
            return gcd(n, m % n);
        }

        private static boolean isPrime(long a) {
            if (a == 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        }

        static long modInverse(long a, long mod) {
    /* Fermat's little theorem: a^(MOD-1) => 1
    Therefore (divide both sides by a): a^(MOD-2) => a^(-1) */
            return binpowMod(a, mod - 2, mod);
        }

        static long binpowMod(long a, long b, long mod) {
            long res = 1;
            while (b > 0) {
                if (b % 2 == 1) res = (res * a) % mod;
                a = (a * a) % mod;
                b /= 2;
            }
            return res;
        }

        private static int getDigit2(long num) {
            long cf = 1;
            int d = 0;
            while (num >= cf) {
                d++;
                cf = 1 << d;
            }
            return d;
        }

        private static int getDigit10(long num) {
            long cf = 1;
            int d = 0;
            while (num >= cf) {
                d++;
                cf *= 10;
            }
            return d;
        }

        private static boolean isInArea(int y, int x, int h, int w) {
            if (y < 0) return false;
            if (x < 0) return false;
            if (y >= h) return false;
            if (x >= w) return false;
            return true;
        }

        private static ArrayList<Integer> generatePrimes(int n) {
            int[] lp = new int[n + 1];
            ArrayList<Integer> pr = new ArrayList<>();
            for (int i = 2; i <= n; ++i) {
                if (lp[i] == 0) {
                    lp[i] = i;
                    pr.add(i);
                }
                for (int j = 0; j < pr.size() && pr.get(j) <= lp[i] && i * pr.get(j) <= n; ++j) {
                    lp[i * pr.get(j)] = pr.get(j);
                }
            }
            return pr;
        }

        static long nPrMod(int n, int r, long MOD) {
            long res = 1;
            for (int i = (n - r + 1); i <= n; i++) {
                res = (res * i) % MOD;
            }
            return res;
        }

        static long nCrMod(int n, int r, long MOD) {
            long rFactorial = nPrMod(r, r, MOD);
            long first = nPrMod(n, r, MOD);
            long second = binpowMod(rFactorial, MOD - 2, MOD);
            return (first * second) % MOD;
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

    private static int abs(int a) {
        return (a >= 0) ? a : -a;
    }

    private static long abs(long a) {
        return (a >= 0) ? a : -a;
    }

    private static double abs(double a) {
        return (a >= 0) ? a : -a;
    }

    private static int min(int a, int b) {
        return (a > b) ? b : a;
    }

    private static long min(long a, long b) {
        return (a > b) ? b : a;
    }

    private static double min(double a, double b) {
        return (a > b) ? b : a;
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private static long max(long a, long b) {
        return (a > b) ? a : b;
    }

    private static double max(double a, double b) {
        return (a > b) ? a : b;
    }
}
