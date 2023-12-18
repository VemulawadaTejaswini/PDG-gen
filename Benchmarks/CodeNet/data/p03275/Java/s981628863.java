
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public final class Main {

    static class Bit {
        private final int n;
        private final long[] table;

        Bit(int n) {
            this.n = n;
            table = new long[n];
        }

        Bit(long[] a) {
            this(a.length);
            for (int i = 0; i < n; i++) {
                table[i] = a[i];
                final int j = i + (i & -i);
                if (j < n) {
                    table[j] += table[i];
                }
            }
        }

        private long getSum(int i) {
            long sum = 0;
            for (; i > 0; i -= i & -i) {
                sum += table[i - 1];
            }
            return sum;
        }

        void add(int i, long x) {
            for (i++; i <= n; i += i & -i) {
                table[i - 1] += x;
            }
        }

        void set(int i, long x) {
            add(i, x - get(i));
        }

        long get(int i) {
            return getSum(i + 1) - getSum(i);
        }

        long getSum(int l, int r) {
            return l >= r ? 0 : getSum(r) - getSum(l);
        }

        int lowerBound(long x) {
            if (x <= 0) {
                return 0;
            }
            int i = 0;
            for (int j = Integer.highestOneBit(n); j > 0; j /= 2) {
                if (i + j <= n && table[i + j - 1] < x) {
                    x -= table[i + j - 1];
                    i += j;
                }
            }
            return i;
        }

        int upperBound(long x) {
            if (x <= 0) {
                return 0;
            }
            int i = 0;
            for (int j = Integer.highestOneBit(n); j > 0; j /= 2) {
                if (i + j <= n && table[i + j] <= x) {
                    i += j;
                    x -= table[i];
                }
            }
            return i;
        }

        long[] getAll() {
            final long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = get(i);
            }
            return res;
        }

        @Override
        public String toString() {
            return Arrays.toString(getAll());
        }
    }

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int n = fs.nextInt();
        final int[] arr = fs.nextIntArray(n);
        int lo = 0, hi = (int) 1e9 + 5;
        while (hi - lo > 1) {
            final int mid = lo + hi >>> 1;
            final int[] s = new int[n + 1];
            for (int i = 0; i < n; i++) {
                s[i + 1] = s[i] + (arr[i] < mid ? -1 : 1);
            }
            final Bit bit = new Bit(4 * n + 1);
            long score = 0;
            for (int i = 0; i <= n; i++) {
                score += bit.getSum(0, s[i] + 2 * n + 1);
                bit.add(s[i] + 2 * n, 1);
            }
            if (score >= ((long) n * (n + 1) / 2 + 1) / 2) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        System.out.println(lo);
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
