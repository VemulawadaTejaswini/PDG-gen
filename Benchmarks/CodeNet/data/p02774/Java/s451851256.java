import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.LongToIntFunction;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = in.nextIntArray(n);

        int[] positive = Arrays.stream(a).filter(i -> i > 0).sorted().toArray();
        int zeros = (int) Arrays.stream(a).filter(i -> i == 0).count();
        int[] negative = reversed(Arrays.stream(a).filter(i -> i < 0).sorted().toArray());

        // int positiveCount = combination(positive.length, 2) + combination(negative.length, 2);
        int zeroCount = zeros * (positive.length + negative.length) + combination(zeros, 2);
        int negativeCount = positive.length * negative.length;

        if (k <= negativeCount) {
            out.println(solveForNegative(positive, negative, k));
        } else if (k <= negativeCount + zeroCount) {
            out.println(0);
        } else {
            out.println(solveForPositive(positive, negative, k - negativeCount - zeroCount));
        }
    }

    private static long solveForPositive(int[] positive, int[] negative, int k) {
        // out.println("Solving for " + k);
        // invert negative array to make all elements positive
        for (int i = 0; i < negative.length; i++) {
            negative[i] *= -1;
        }

        long left = 0, right = (long) 2e18;
        LongToIntFunction positiveCount = x -> numbersLessThan(x, positive);
        LongToIntFunction negativeCount = x -> numbersLessThan(x, negative);

        return partitionPoint(x -> {
            // out.println("Checking " + x);
            // out.println(positiveCount.applyAsInt(x));
            // out.println(negativeCount.applyAsInt(x));
            return positiveCount.applyAsInt(x) + negativeCount.applyAsInt(x) < k;
        }, left, right) - 1;
    }

    private static int numbersLessThan(long x, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int partition = (int) Math.ceil((double) x / (double) arr[i]);
            int numLessThan = partitionPoint((IntPredicate) j -> arr[j] < partition, 0, arr.length);
            count += Math.min(i, numLessThan);
        }
        return count;
    }

    private static long solveForNegative(int[] positive, int[] negative, int k) {
        return -1L;
    }

    private static int partitionPoint(IntPredicate predicate, int first, int last) {
        int left = first, right = last;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (predicate.test(mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return predicate.test(left) ? right : left;
    }

    private static long partitionPoint(LongPredicate predicate, long first, long last) {
        long left = first, right = last;
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (predicate.test(mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return predicate.test(left) ? right : left;
    }

    private static int combination(int n, int r) {
        if (n == 0 && r == 0) return 1;
        if (n < r || n < 0) return 0;

        int ret = 1;
        for (int i = n; i > n - r; i--) {
            ret *= i;
        }
        for (int i = 1; i <= r; i++) {
            ret /= i;
        }
        return ret;
    }

    private static int[] reversed(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int tmp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = tmp;
        }
        return a;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
