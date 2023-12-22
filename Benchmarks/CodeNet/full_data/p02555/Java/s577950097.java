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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRedistribution solver = new DRedistribution();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRedistribution {
        static int[] memo;
        static int mod = (int) 1e9 + 7;

        static int dp(int sum) {
            if (sum == 0) return 1;
            if (sum < 0) return 0;
            if (memo[sum] != -1) return memo[sum];
            int ans = 0;
            for (int j = 3; j <= sum; j++) {
                ans = (ans + dp(sum - j)) % mod;
            }
            return memo[sum] = ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.nextInt();
            memo = new int[x + 1];
            Arrays.fill(memo, -1);
            out.println(dp(x));
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

