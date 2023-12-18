import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final int INF = (int) 1e9;
    static final int mod = (int) (1e9 + 7);
    static char[] num;
    static int d, n;
    static int memo[][][];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        num = sc.next().toCharArray();
        d = sc.nextInt();
        n = num.length;
        memo = new int[2][d][n];
        for (int[][] a : memo)
            for (int[] b : a)
                Arrays.fill(b, UNCALC);
        out.println((dp(1, 0, 0) - 1) % mod);
        out.flush();
        out.close();
    }

    static int dp(int isequal, int i, int sum) {
        if (i == n)
            return sum == 0 ? 1 : 0;
        if (memo[isequal][sum][i] != UNCALC)
            return memo[isequal][sum][i];
        int cnt = 0;
        int end = (isequal == 1 ? num[i] : '9') - '0';
        for (int j = 0; j <= end; j++) {
            int nf = (num[i] - '0' == j ? isequal : 0);
            int nsum = (sum + j) % d;
            cnt = (cnt + dp(nf, i + 1, nsum)) % mod;
        }
        return memo[isequal][sum][i] = cnt % mod;
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