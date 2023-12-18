import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] dp;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int n = s.length();
            dp = new int[n + 1];
            dp[0] = 0;
            for (int i = 0; i < s.length(); ++i) {
                dp[i + 1] = dp[i] ^ (1 << (s.charAt(i) - 'a'));
            }
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 0);
            int[] resdp = new int[n + 1];
            Arrays.fill(resdp, Integer.MAX_VALUE);
            resdp[0] = 0;
            for (int i = 0; i < n; ++i) {
                if (map.containsKey(dp[i + 1])) {
                    resdp[i + 1] = resdp[map.get(dp[i + 1])] + 1;
                }
                int mask;
                for (int j = 0; j < 26; ++j) {
                    mask = dp[i + 1] ^ (1 << j);
                    if (map.containsKey(mask)) {
                        resdp[i + 1] = Math.min(resdp[i + 1], resdp[map.get(mask)] + 1);
                    }
                }
                if (map.containsKey(dp[i + 1])) {
                    map.put(dp[i + 1], Math.min(map.get(dp[i + 1]), resdp[i + 1]));
                } else {
                    map.put(dp[i + 1], resdp[i + 1]);
                }
            }

            out.println(resdp[n]);
        }

    }
}

