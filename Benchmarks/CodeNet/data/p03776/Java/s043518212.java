import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DMaximumAverageSets solver = new DMaximumAverageSets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMaximumAverageSets {
        long[][] ncr;

        private long ncr(int n, int r) {
            if (r > n || r < 0) return 0;
            return ncr[n][r];
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            ncr = new long[n + 1][n + 1];
            ncr[0][0] = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    ncr[i + 1][j] += ncr[i][j];
                    ncr[i + 1][j + 1] += ncr[i][j];
                }
            }

            int a = in.nextInt(), b = in.nextInt();

            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = in.nextLong();
            }

            Arrays.sort(v);

            double sum = 0;
            for (int i = n - 1; i >= n - a; i--) {
                sum += v[i];
            }

            long lastElement = v[n - a];
            int count1 = 0, count2 = 0;
            for (int i = 0; i < n; i++) {
                if (v[i] == lastElement) {
                    if (i >= n - a) {
                        count1++;
                    } else {
                        count2++;
                    }
                }
            }

            double average = sum / a;
            long count = ncr(count1 + count2, count1);
            if (v[n - 1] == lastElement) {
                for (int i = 1; a + i <= b; i++) {
                    count += ncr(count1 + count2, count1 + i);
                }
            }

            out.format("%f%n", average);
            out.println(count);
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

