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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int a[][] = new int[h + 1][w + 1];
            int b[][] = new int[h + 1][w + 1];
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    b[i][j] = in.nextInt();
                }
            }
            int max = -1;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    max = Math.max(max, Math.abs(a[i][j] - b[i][j]));
                }
            }
            boolean dp[][][] = new boolean[h + 1][w + 1][max + 1];
//        dp[0][0][0] = true;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    for (int k = 0; k <= max; k++) {
                        if (i == 1 && j == 1) {
                            dp[i][j][Math.abs(a[i][j] - b[i][j])] = true;
                            continue;
                        }
                        if (dp[i - 1][j][k]) {
                            if (k + Math.abs(a[i][j] - b[i][j]) <= max)
                                dp[i][j][k + Math.abs(a[i][j] - b[i][j])] = true;
                            if (Math.abs(k - Math.abs(a[i][j] - b[i][j])) <= max)
                                dp[i][j][Math.abs(k - Math.abs(a[i][j] - b[i][j]))] = true;
                        }
                        if (dp[i][j - 1][k]) {
                            if (k + Math.abs(a[i][j] - b[i][j]) <= max)
                                dp[i][j][k + Math.abs(a[i][j] - b[i][j])] = true;
                            if (Math.abs(k - Math.abs(a[i][j] - b[i][j])) <= max)
                                dp[i][j][Math.abs(k - Math.abs(a[i][j] - b[i][j]))] = true;
                        }
                    }
                }
            }
            int ans = 0;
            for (int k = 0; k <= max; k++) {
                if (dp[h][w][k]) {
                    ans = k;
                    break;
                }
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

