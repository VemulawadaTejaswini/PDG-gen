import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqualCut solver = new DEqualCut();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqualCut {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.readLongArray(n);

            long[] prefixSum = new long[n + 1];
            prefixSum[0] = 0;
            for (int i = 0; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + a[i];
            }

            long answer = Long.MAX_VALUE;
            for (int i = 2; i <= n - 2; i++) {
                Pair<Long, Long> left = getMinMax(prefixSum, 0, i);
                Pair<Long, Long> right = getMinMax(prefixSum, i, n);

                long[] values = {left.first, left.second, right.first, right.second};
                Arrays.sort(values);
                answer = Math.min(answer, Math.abs(values[3] - values[0]));
            }

            out.println(answer);
        }

        private static Pair<Long, Long> getMinMax(long[] prefixSum, int left, int right) {
            int breakpoint = BinarySearch.binarySearch(index -> {
                if (index >= right)
                    return true;
                if (index < left)
                    return false;

                long lSum = prefixSum[index] - prefixSum[left];
                long rSum = prefixSum[right] - prefixSum[index];

                return lSum > rSum;
            });

            long lSum = prefixSum[breakpoint] - prefixSum[left];
            long rSum = prefixSum[right] - prefixSum[breakpoint];
            long lSum2 = prefixSum[breakpoint - 1] - prefixSum[left];
            long rSum2 = prefixSum[right] - prefixSum[breakpoint - 1];

            if (Math.abs(lSum - rSum) < Math.abs(lSum2 - rSum2))
                return Pair.of(Math.min(lSum, rSum), Math.max(lSum, rSum));
            else
                return Pair.of(Math.min(lSum2, rSum2), Math.max(lSum2, rSum2));
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextLong();
            }
            return x;
        }

    }

    static class Pair<F, S> {
        public final F first;
        public final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public static <F, S> Pair<F, S> of(F first, S second) {
            return new Pair<>(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
        }

    }

    static class BinarySearch {
        public static int binarySearch(Function<Integer, Boolean> bigEnough) {
            int tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = tooSmall + (tooBig - tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

