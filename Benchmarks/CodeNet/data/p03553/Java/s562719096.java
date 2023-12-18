import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++) {
                a[i + 1] = in.nextLong();
            }

            for (int i = n; i >= n / 2 + 1; i--) {
                if (a[i] < 0) a[i] = 0;
            }

            int[] prime = new int[n / 2];
            for (int i = 0; i < n / 2; i++) {
                prime[i] = i + 1;
            }
            long ans = Arrays.stream(a).sum();
            for (int i = 0; i < 1 << n / 2; i++) {
                long[] b = a.clone();
                for (int j = 0; j < n / 2; j++) {
                    if (((i >> j) & 1) == 1) {
                        for (int k = 1; k <= n; k++) {
                            if (k % prime[j] == 0) b[k] = 0;
                        }
                    }
                }
                ans = Math.max(ans, Arrays.stream(b).sum());
            }

            out.println(Math.max(ans, 0));
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

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

