import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextLongArray(3 * n);

            long[] array1 = Arrays.copyOf(a, 2 * n);
            long[] pre = ArrayUtils.calcMaxSum(array1, n);

            long[] array2 = new long[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                array2[i] = a[3 * n - 1 - i];
            }
            long[] post = ArrayUtils.calcMinSum(array2, n);

            long ans = Long.MIN_VALUE;
            for (int i = 0; i < n + 1; i++) {
                ans = Math.max(ans, pre[n - 1 + i] - post[2 * n - 1 - i]);
            }

            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }

    static class ArrayUtils {
        public static long[] calcMaxSum(long[] array, int k) {
            int n = array.length;
            long[] ret = new long[n];

            long sum = 0;
            PriorityQueue<Long> queue = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                if (queue.size() < k) {
                    queue.add(array[i]);
                    sum += array[i];
                } else {
                    long min = queue.peek();
                    if (array[i] > min) {
                        queue.poll();
                        queue.add(array[i]);
                        sum += array[i] - min;
                    }
                }
                ret[i] = sum;
            }

            return ret;
        }

        public static long[] calcMinSum(long[] array, int k) {
            int n = array.length;
            long[] ret = new long[n];

            long sum = 0;
            PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
            for (int i = 0; i < n; i++) {
                if (queue.size() < k) {
                    queue.add(array[i]);
                    sum += array[i];
                } else {
                    long max = queue.peek();
                    if (array[i] < max) {
                        queue.poll();
                        queue.add(array[i]);
                        sum -= max - array[i];
                    }
                }
                ret[i] = sum;
            }

            return ret;
        }

    }
}

