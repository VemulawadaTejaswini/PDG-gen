import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final int INF = (int) 1e9;
    static double[] p;
    static double memo[][];
    static int n;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        p = sc.nextDoubleArray(n);
        memo = new double[n][n + 1];
        for (double[] a : memo)
            Arrays.fill(a, UNCALC);
        out.println(dp(0, 0));
        out.flush();
        out.close();

    }

    static double dp(int i, int heads) {
        if (i == n)
            return heads > n / 2 ? 1 : 0;
        if (memo[i][heads] != UNCALC)
            return memo[i][heads];
        return memo[i][heads] = p[i] * dp(i + 1, heads + 1) + (1 - p[i]) * dp(i + 1, heads);
    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
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

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
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

    }
}