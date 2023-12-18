import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DSquirrelMerchant solver = new DSquirrelMerchant();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSquirrelMerchant {
        private static final int three = 3;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextInt();
            int[] a = new int[three];
            for (int i = 0; i < three; i++)
                a[i] = in.nextInt();
            int[] b = new int[three];
            for (int i = 0; i < three; i++)
                b[i] = in.nextInt();

            n = solve(n, a, b);
            n = solve(n, b, a);

            out.println(n);
        }

        private long solve(long n, int[] first, int[] second) {
            int count = 1;
            for (int i = 0; i < three; i++)
                if (second[i] - first[i] > 0)
                    count++;
            int[] cost = new int[count];
            int[] val = new int[count];
            cost[0] = 1;
            val[0] = 1;
            for (int i = 0, index = 1; i < three; i++) {
                if (second[i] - first[i] > 0) {
                    val[index] = second[i];
                    cost[index] = first[i];
                    index++;
                }
            }

            long[] dp = new long[(int) (n + 1)];
            dp[0] = 0;
            for (int costUsed = 1; costUsed <= n; costUsed++) {
                for (int i = 0; i < count; i++) {
                    if (costUsed - cost[i] < 0)
                        continue;
                    dp[costUsed] = Math.max(dp[costUsed], dp[costUsed - cost[i]] + val[i]);
                }
            }

            return dp[(int) n];
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

