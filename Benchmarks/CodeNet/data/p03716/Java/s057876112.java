import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        D3NNumbers solver = new D3NNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class D3NNumbers {
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long[] c = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextLong();
            }
            for (int i = 0; i < n; i++) {
                c[i] = in.nextLong();
            }

            long[] first = findMaxSums(a, b);
            for (int i = 0; i < n; i++) {
                b[i] *= -1;
                c[i] *= -1;
            }
            for (int i = 0; i < n / 2; i++) {
                long t = b[i];
                b[i] = b[n - 1 - i];
                b[n - 1 - i] = t;
            }
            long[] second = findMaxSums(c, b);

            long answer = Long.MIN_VALUE;
            for (int i = 0; i <= n; i++) {
                answer = Math.max(answer, first[i] + second[n - i]);
            }

            out.println(answer);
        }

        long[] findMaxSums(long[] a, long[] b) {
            long[] answer = new long[n + 1];

            PriorityQueue<Long> minHeapSizeN = new PriorityQueue<>();

            for (long x : a) {
                minHeapSizeN.add(x);
                answer[0] += x;
            }

            for (int i = 1; i <= n; i++) {
                answer[i] = answer[i - 1];
                long next = b[i - 1];
                if (next > minHeapSizeN.peek()) {
                    long evicted = minHeapSizeN.poll();
                    minHeapSizeN.add(next);
                    answer[i] -= evicted;
                    answer[i] += next;
                }
            }

            return answer;
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

    }
}

