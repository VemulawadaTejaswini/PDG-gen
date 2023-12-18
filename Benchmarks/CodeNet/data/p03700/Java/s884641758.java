import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();
            long sum = 0;
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
                sum += arr[i];
            }
            Arrays.sort(arr);
            long diff = 0;
            for (int i = 1; i < n; i++) {
                diff = Math.max(arr[i] - arr[i - 1], diff);
            }
            long ans = 0;
            long delta = a - b;
            long lo = 0, hi = (long) 1e9;
            while (lo <= hi) {
                long mid = (lo + hi) >> 1;
                if (check(sum, a, b, mid, n)) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            if (a - b > diff) ++ans;
            out.println(ans);
        }

        private boolean check(long sum, long a, long b, long mid, int n) {
            long num = mid * a + (mid * b * (long) (n - 1));
            //System.err.println("num " + num + " mid " + mid);
            return sum <= num;
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

    }
}

