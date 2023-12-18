import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
import java.io.InputStreamReader;
import java.util.function.LongUnaryOperator;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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

            LongUnaryOperator cost = tripsLong -> {
                int trips = (int) tripsLong;
                int[] sizes = new int[trips];
                for (int t = 0; t < n; t++) {
                    sizes[t % trips]++;
                }

                long[] costs = new long[n];
                int index = 0;
                for (int i = 0; i < trips; i++) {
                    long prev = 0;
                    for (int j = 1; j <= sizes[i]; j++) {
                        long cur = (1 + (j + 1) * (j + 1));
                        costs[index++] = cur - prev;
                        prev = cur;
                    }
                }

                long r = 0;
                Util.safeSort(costs);
                Util.reverse(costs);
                for (int i = 0; i < n; i++) {
                    r += costs[i] * x[i];
                }
                r += n * X;
                r += trips * X;

                return r;
            };
            long answer = Long.MAX_VALUE;

            for (int t = 1; t <= n; t++) {
                long c = cost.applyAsLong(t);
                answer = Math.min(answer, c);
            }

            out.println(answer);
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

    static class Util {
        public static void safeSort(long[] x) {
            shuffle(x);
            Arrays.sort(x);
        }

        public static void shuffle(long[] x) {
            Random r = new Random();

            for (int i = 0; i <= x.length - 2; i++) {
                int j = i + r.nextInt(x.length - i);
                swap(x, i, j);
            }
        }

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
}

