import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextLongArray(n);
            long[] b = in.nextLongArray(n);
            PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.comparing(e -> -e));

            long sum = 0;
            for (int i = 0; i < n; i++) {
                pq.add(b[i] - a[i]);
                sum += b[i] - a[i];
            }

            while (!pq.isEmpty()) {
                long cur = pq.poll();
                sum -= cur;
                if (cur < 0 || cur % 2 != 0) {
                    out.println("No");
                    return;
                }
                pq.add(cur / 2);
                sum += cur / 2;
                if (sum == 0) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            int i = 0;
            while (i < n) {
                arr[i++] = nextLong();
            }
            return arr;
        }

    }
}

