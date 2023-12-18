import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ShekharN
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MedianSum solver = new MedianSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class MedianSum {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = IntStream.range(0, n).map(id -> in.nextInt()).toArray();
            int sum = Arrays.stream(arr).sum();
            Boolean[][] dp = new Boolean[2][sum + 1];
            for (int i = 1; i <= sum; i++) {
                dp[0][i] = false;
            }
            dp[0][0] = true;
            dp[0][arr[0]] = true;
            for (int j = 1; j < n; j++) {
                int id = j & 1;
                int val = arr[j];
                dp[id] = IntStream.range(0, sum + 1)
                        .parallel()
                        .mapToObj(i -> {
                            int tmp = i - val;
                            if (tmp >= 0)
                                return dp[id ^ 1][i] | dp[id ^ 1][tmp];
                            else
                                return dp[id ^ 1][i];
                        }).toArray(Boolean[]::new);
            /*for (int k = 0; k <= sum; k++) {
                int tmp = k - arr[j];
                dp[id][k] = dp[id^1][k];
                if(tmp >= 0)
                    dp[id][k] = dp[id][k] | dp[id^1][tmp];
            }*/
            }
            int start = sum / 2 + (sum & 1);
            for (int i = start; i <= sum; i++) {
                if (dp[(n - 1) & 1][i]) {
                    out.println(i);
                    break;
                }
            }
        }

    }

    static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        public String nextString() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

