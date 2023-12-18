

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public final class Main {
    
    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        int l = fs.nextInt();
        int k = 0;
        int idx = 0;
        final int[][] edges = new int[60][3];
        while (1 << k + 1 <= l) {
            k++;
        }
        for (int i = 0; i < k; i++) {
            final int j = i + 1;
            edges[idx++] = new int[] { i, j, 0 };
            edges[idx++] = new int[] { i, j, 1 << i };
        }
        for (int i = 0; i < k; i++) {
            if ((l & 1 << i) != 0) {
                edges[idx++] = new int[] { i, k, l ^= 1 << i };
            }
        }
        System.out.println(k + 1 + " " + idx);
        for (int i = 0; i < idx; i++) {
            final int u = edges[i][0] + 1;
            final int v = edges[i][1] + 1;
            final int w = edges[i][2];
            System.out.println(u + " " + v + " " + w);
        }
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
