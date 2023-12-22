import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
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
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        char[] arr;
        int mod = 2019;
        long[][][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            arr = sc.next().toCharArray();
            long ans = 0;
            memo = new long[arr.length][mod][2];
            for (long[][] x : memo)
                for (long[] y : x)
                    Arrays.fill(y, -1);
            for (int i = 0; i < arr.length; i++) {
                ans += dp(i, 0, 0);
            }
            pw.println(ans);
        }

        private long dp(int idx, int curMod, int taken) {
            if (idx == arr.length)
                return curMod == 0 ? 1 : 0;
            if (memo[idx][curMod][taken] != -1)
                return memo[idx][curMod][taken];
            long cut = curMod == 0 && taken == 1 ? 1 : 0;
            long take = dp(idx + 1, (curMod * 10 + arr[idx] - '0') % mod, 1);
            return memo[idx][curMod][taken] = cut + take;
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

