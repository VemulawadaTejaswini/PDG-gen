

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public final class Main {

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int n = fs.nextInt();
        final long[] x = new long[n];
        final long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = fs.nextLong();
            y[i] = fs.nextLong();
        }
        System.out.println(maxAbsValExpr(x, y));
    }

    public static long maxAbsValExpr(long[] arr1, long[] arr2) {
        final int n = arr1.length;
        long ans = 0;
        long maxmm = (long) -5e18;
        long maxmp = (long) -5e18;
        long maxpm = (long) -5e18;
        long maxpp = (long) -5e18;
        for (int i = 0; i < n; i++) {
            maxmm = Math.max(maxmm, -arr1[i] - arr2[i]);
            maxmp = Math.max(maxmp, -arr1[i] + arr2[i]);
            maxpm = Math.max(maxpm, arr1[i] - arr2[i]);
            maxpp = Math.max(maxpp, arr1[i] + arr2[i]);
            ans = Math.max(ans, maxmm + arr1[i] + arr2[i]);
            ans = Math.max(ans, maxmp + arr1[i] - arr2[i]);
            ans = Math.max(ans, maxpm - arr1[i] + arr2[i]);
            ans = Math.max(ans, maxpp - arr1[i] - arr2[i]);
        }
        return ans;
    }

    static final class Util {
        public static void shuffleSort(int[] x) {
            shuffle(x);
            Arrays.sort(x);
        }

        public static void shuffleSort(long[] x) {
            shuffle(x);
            Arrays.sort(x);
        }

        public static void shuffle(int[] x) {
            final Random r = new Random();

            for (int i = 0; i <= x.length - 2; i++) {
                final int j = i + r.nextInt(x.length - i);
                swap(x, i, j);
            }
        }

        public static void shuffle(long[] x) {
            final Random r = new Random();

            for (int i = 0; i <= x.length - 2; i++) {
                final int j = i + r.nextInt(x.length - i);
                swap(x, i, j);
            }
        }

        public static void swap(int[] x, int i, int j) {
            final int t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

        public static void swap(long[] x, int i, int j) {
            final long t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

        private Util() {}
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        private String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    //noinspection CallToPrintStackTrace
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int[] nextIntArray(int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) { a[i] = nextInt(); }
            return a;
        }

        long[] nextLongArray(int n) {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++) { a[i] = nextLong(); }
            return a;
        }
    }
}
