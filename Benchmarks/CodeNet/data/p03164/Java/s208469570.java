import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        Codes solver = new Codes();
        solver.solve(1, in, out);
        out.close();
    }

    static class Codes {
        static int n;
        static int[] weight;
        static int[] value;
        static Long[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            int start = sc.nextInt();
            weight = new int[n];
            value = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
                value[i] = sc.nextInt();
            }
            memo = new Long[n][(int) 1e5 + 1];
            int ans = 0;
            for (int i = 0; i <= (int) 1e5; i++) {
                long dp = dp(0, i);
                if (dp <= start)
                    ans = i;
            }
            pw.println(ans);
        }

        private long dp(int idx, int cur) {
            if (cur <= 0)
                return 0;
            if (idx == n)
                return (int) 1e9;
            if (memo[idx][cur] != null)
                return memo[idx][cur];
            long take = weight[idx] + dp(idx + 1, cur - value[idx]);
            long leave = dp(idx + 1, cur);
            return memo[idx][cur] = Math.min(take, leave);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

