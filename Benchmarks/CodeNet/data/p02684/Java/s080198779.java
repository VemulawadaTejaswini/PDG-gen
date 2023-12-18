import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

/*
4 5
3 2 4 1

4

4 4
3 2 4 1

4
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int n = nextInt();
        long k = nextLong() - 1;

        int[] a = readArray(n);
        List<Integer> sorted = new ArrayList<>();
        sorted.add(a[0]);

        for (int i = 1; i < 2 * n + 1000; i++) {
            int next = a[sorted.get(sorted.size() - 1) - 1];
            sorted.add(next);
        }

        if (k < n) {
            System.out.println(sorted.get((int) k));
            return;
        }

        int loop_end = n - 1;
        int loop_start = n - 2;

        // 周期を求める
        while (sorted.toArray()[loop_start] != sorted.toArray()[loop_end]) {
            loop_start -= 1;
        }

        int period = loop_end - loop_start;
        k %= period;

//        System.out.println(loop_start + " " + loop_end + " " + period + " " + k);
        while (k < n) {
            k += period;
        }

        System.out.println(sorted.get((int) k));

    }

    // constant
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static final int inf = Integer.MAX_VALUE / 2;
    static final long linf = Long.MAX_VALUE / 3;
    static final double dinf = Double.MAX_VALUE / 3;
    static final double eps = 1e-10;
    static final double pi = Math.PI;

    // pow
    static double pow(int x, int y) {
        return Math.pow(x, y);
    }

    // max min
    static int max(int x, int y) {
        return Math.max(x, y);
    }

    static int min(int x, int y) {
        return Math.min(x, y);
    }

    static int max(int x, int y, int z) {
        x = Math.max(x, y);
        x = Math.max(x, z);
        return x;
    }

    static int min(int x, int y, int z) {
        x = Math.min(x, y);
        x = Math.min(x, z);
        return x;
    }

    static long max(long x, long y) {
        return Math.max(x, y);
    }

    static long min(long x, long y) {
        return Math.min(x, y);
    }

    static long max(long x, long y, long z) {
        x = Math.max(x, y);
        x = Math.max(x, z);
        return x;
    }

    static long min(long x, long y, long z) {
        x = Math.min(x, y);
        x = Math.min(x, z);
        return x;
    }

    static double max(double x, double y) {
        return Math.max(x, y);
    }

    static double min(double x, double y) {
        return Math.min(x, y);
    }

    static double max(double x, double y, double z) {
        x = Math.max(x, y);
        x = Math.max(x, z);
        return x;
    }

    static double min(double x, double y, double z) {
        x = Math.min(x, y);
        x = Math.min(x, z);
        return x;
    }

    // sort
    static void sort(int[] ar) {
        Arrays.sort(ar);
    }

    static void sort(long[] ar) {
        Arrays.sort(ar);
    }

    static void sort(double[] ar) {
        Arrays.sort(ar);
    }

    static void sort(char[] ar) {
        Arrays.sort(ar);
    }

    static void rsort(int[] ar) {
        Arrays.sort(ar);
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            int tmp = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = tmp;
        }
    }

    static void rsort(long[] ar) {
        Arrays.sort(ar);
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            long tmp = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = tmp;
        }
    }

    static void rsort(double[] ar) {
        Arrays.sort(ar);
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            double tmp = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = tmp;
        }
    }

    static void rsort(char[] ar) {
        Arrays.sort(ar);
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            char tmp = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = tmp;
        }
    }

    // initialize
    static void fill(int arr[], int x) {
        Arrays.fill(arr, x);
    }

    static void fill(long arr[], long x) {
        Arrays.fill(arr, x);
    }

    static void fill(boolean arr[], boolean x) {
        Arrays.fill(arr, x);
    }

    static void fill(double arr[], double x) {
        Arrays.fill(arr, x);
    }

    static void fill(int arr[][], int x) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], x);
        }
    }

    static void fill(long arr[][], long x) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], x);
        }
    }

    static void fill(double arr[][], double x) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], x);
        }
    }

    static void fill(boolean arr[][], boolean x) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], x);
        }
    }

    // scanner
    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int char2int(Character c) {
        return Character.getNumericValue(c);
    }

    static double char2double(Character c) {
        return (double) char2int(c);
    }

    // nCr
    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // gcd
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            a = a % b; // 残り部分
            return gcd(b, a); // 残り部分から最小の正方形を見つける
        }
    }
}
