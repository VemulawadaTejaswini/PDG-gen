/*input
6
30 10 60 10 60 50
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {
       

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            int dp[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.fill(dp, (int) 1e9);
            dp[0] = 0;
            dp[1] = Math.abs(a[1] - a[0]);
            for (int i = 2; i < n; i++) {
                dp[i] = Math.min(Math.abs(a[i] - a[i - 1]) + dp[i - 1], Math.abs(a[i] - a[i - 2]) + dp[i - 2]);
            }
            out.println(dp[n - 1]);

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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

