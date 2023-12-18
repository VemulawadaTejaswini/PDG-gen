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
        CTakAndCards solver = new CTakAndCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTakAndCards {
        static int n;
        static int k;
        static int[] arr;
        static Long[][][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            memo = new Long[n][n + 1][n * 50];
            pw.print(dp(0, 0, 0));
        }

        private long dp(int idx, int sum, int taken) {
            if (idx == n) {
                if (taken == 0)
                    return 0;
                if ((1d * sum) / (1d * taken) == k)
                    return 1;
                return 0;
            }
            if (memo[idx][taken][sum] != null)
                return memo[idx][taken][sum];
            long take = dp(idx + 1, sum + arr[idx], taken + 1);
            long leave = dp(idx + 1, sum, taken);
            return memo[idx][taken][sum] = take + leave;
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

