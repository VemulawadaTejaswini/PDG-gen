import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int offset = 3000, UNCALC = -1, INF = (int) 1e9;
    static int n, m;
    static int memo[][][];
    static int[][] a, b;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        b = new int[n][m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextIntArray(m);
        for (int i = 0; i < n; i++)
            b[i] = sc.nextIntArray(m);
        memo = new int[80][80][2 * offset + 1];
        for (int[][] a : memo)
            for (int[] b : a)
                Arrays.fill(b, UNCALC);
        out.println(Math.min(dp(0, 0, offset + a[0][0] - b[0][0]), dp(0, 0, offset - a[0][0] + b[0][0])));
        out.flush();
        out.close();
    }

    static int dp(int i, int j, int sum) {
        if (i == n - 1 && j == m - 1) return Math.abs(sum - offset);
        if (sum < 0 || sum >= 2 * offset + 1) return INF;
        if (memo[i][j][sum] != UNCALC) return memo[i][j][sum];
        int best = INF;
        if (i != n - 1)
            best = Math.min(dp(i + 1, j, sum + a[i + 1][j] - b[i + 1][j]), dp(i + 1, j, sum - a[i + 1][j] + b[i + 1][j]));
        if (j != m - 1)
            best = Math.min(best, Math.min(dp(i, j + 1, sum + a[i][j + 1] - b[i][j + 1]), dp(i, j + 1, sum - a[i][j + 1] + b[i][j + 1])));
        return memo[i][j][sum] = best;
    }

    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }


        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }


        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double[] ans = new double[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextDouble();
            return ans;
        }

        public short nextShort() throws IOException {
            return Short.parseShort(next());
        }

    }

}