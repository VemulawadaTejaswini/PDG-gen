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
 * @author cplayer
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        private int mod = 1000000000 + 7;

        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[] a = in.nextIntArr(n);
            int[] dp = new int[k + 1], pre = new int[k + 1];
        /*
            基本方程来自于：https://codeforces.com/blog/entry/64250?#comment-484569
            dp[i][j] = 散发j个糖果在1-i个人之间的方法数
            若给了k个糖果给第i个人，那么此方案数为dp[i - 1][j - k]
            故dp[i][j] = sum{k = 0}{a[i]}(dp[i - 1][j - k])
            而且可以用前缀和进行优化：
            计：prefix[i][j] = sum{k=0}{j}(dp[i][k])
            那么：dp[i][j] = prefix[i - 1][j] - prefix[i - 1][j - a[i] - 1]
            与此同时，也有:
            prefix[i][j] = prefix[i][j - 1] + dp[i][j]（前缀的定义）
            最后输出dp[i][k]即可。
         */
            // 将0个糖果分给0个人的方案数为1，n个糖果分给0个人的方案数为0
            // dp和pre用单一数组实现，节省空间
            dp[0] = 1;
            Arrays.fill(pre, 1);
            for (int i = 0; i < n; ++i) {
                for (int j = 1; j <= k; ++j) {
                    if (j >= a[i] + 1) {
                        dp[j] = pre[j] - pre[j - a[i] - 1];
                    } else {
                        dp[j] = pre[j];
                    }
                    while (dp[j] > mod) {
                        dp[j] -= mod;
                    }
                }
                pre[0] = 1;
                for (int j = 1; j <= k; ++j) {
                    pre[j] = dp[j] + pre[j - 1];
                    while (pre[j] > mod) {
                        pre[j] -= mod;
                    }
                }
            }
            out.println(dp[k]);
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader (InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next () {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public int[] nextIntArr (int length) {
            int[] res = new int[length];
            for (int i = 0; i < length; ++i) {
                res[i] = nextInt();
            }
            return res;
        }

        public int nextInt () {
            return Integer.parseInt(next());
        }

    }
}

