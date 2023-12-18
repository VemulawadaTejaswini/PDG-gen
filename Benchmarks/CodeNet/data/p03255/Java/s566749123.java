import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.function.LongUnaryOperator;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.function.LongPredicate;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGarbageCollector solver = new BGarbageCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGarbageCollector {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long X = in.nextInt();
            long[] x = in.readLongArray(n);
            Util.reverse(x);

            long b = 0;
            for (long i : x)
                b += 5 * i;
            b += 2 * n * X + 1;
            long BOUND = b;

            LongUnaryOperator cost = tripsLong -> {
                int trips = (int) tripsLong;

                long[] costs = new long[n];
                int index = 0;
                long prev = 0;
                for (int i = 1; index < n; i++) {
                    long cur = (1 + (i + 1) * (i + 1));
                    for (int j = 0; j < trips && index < n; j++) {
                        costs[index++] = cur - prev;
                    }
                    prev = cur;
                }

                long r = 0;
                for (int i = 0; i < n; i++) {
                    r += costs[i] * x[i];
                    if (r >= BOUND)
                        return BOUND;
                }
                r += n * X;
                r += trips * X;

                return r;
            };

            long left = BinarySearch.binarySearchLong(t -> {
                if (t <= 0)
                    return false;
                if (t > n)
                    return true;
                return cost.applyAsLong(t) < BOUND;
            });

            long t = BinarySearch.ternarySearchLongFast(cost, left, n);
            long answer = cost.applyAsLong(t);

            out.println(answer);
        }

    }

    static class Util {
        public static void swap(long[] x, int i, int j) {
            long t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

        public static void reverse(long[] x) {
            for (int i = 0, j = x.length - 1; i < j; i++, j--) {
                swap(x, i, j);
            }
        }

        private Util() {
        }

    }

    static class InputReader {
        public final BufferedReader reader;
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

    static class BinarySearch {
        public static long binarySearchLong(LongPredicate bigEnough) {
            long tooSmall = 0, tooBig;
            if (bigEnough.test(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.test(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.test(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = tooSmall + (tooBig - tooSmall) / 2;
                if (!bigEnough.test(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

        public static long ternarySearchLongFast(LongUnaryOperator f, long left, long right) {
            while (true) {
                if (right - left < 3) {
                    long answer = left;
                    long opt = f.applyAsLong(left);
                    for (long x = left + 1; x <= right; x++) {
                        long candidate = f.applyAsLong(x);
                        if (candidate < opt) {
                            answer = x;
                            opt = candidate;
                        }
                    }
                    return answer;
                }
                long t = (right - left) / 2;
                long a = left + t;
                long b = left + t + 1;
                if (f.applyAsLong(a) > f.applyAsLong(b)) {
                    left = a;
                } else {
                    right = b;
                }
            }
        }

    }
}

