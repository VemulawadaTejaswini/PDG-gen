import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[][] cnt = new int[m][100001];
            for (int i = 0; i < n; i++) {
                int s = in.nextInt();
                int t = in.nextInt();
                int c = in.nextInt() - 1;
                cnt[c][s]++;
                cnt[c][t]--;
            }

            int[] sum = new int[100001];
            for (int i = 0; i < m; i++) {
                for (int j = 1; j < 100000; j++) {
                    if (cnt[i][j] == 1) {
                        sum[j - 1]++;
                    } else if (cnt[i][j] == -1) {
                        sum[j]--;
                    }
                }
            }
            for (int i = 0; i < 100000; i++) {
                sum[i + 1] += sum[i];
            }

            int ans = 0;
            for (int i = 0; i < 100000; i++) {
                ans = Math.max(ans, sum[i]);
            }

            out.println(ans);
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

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

