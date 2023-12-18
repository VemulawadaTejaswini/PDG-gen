import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
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
        AZeroSumRanges solver = new AZeroSumRanges();
        solver.solve(1, in, out);
        out.close();
    }

    static class AZeroSumRanges {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            long sum = 0;
            HashMap<Long, Integer> count = new HashMap<>();
            count.put(0L, 1);
            for (int i = 0; i < n; i++) {
                sum += a[i];
                count.put(sum, count.getOrDefault(sum, 0) + 1);
            }

            long ans = 0;
            for (Map.Entry<Long, Integer> entry : count.entrySet()) {
                long x = entry.getValue();
                ans += x * (x - 1) / 2;
            }

            out.println(ans);
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

    }
}

