import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static int n;
    static int[] memo;
    static int[] h;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        h = sc.nextIntArray(n);
        memo = new int[n];
        Arrays.fill(memo, UNCALC);
        out.println(dp(0));
        out.flush();
        out.close();

    }

    static int dp(int i) {
        if (i == n - 1) return 0;
        if (memo[i] != UNCALC) return memo[i];
        int min = dp(i + 1) + Math.abs(h[i + 1] - h[i]);
        if (i < n - 2) min = Math.min(min, dp(i + 2) + Math.abs(h[i + 2] - h[i]));
        return memo[i] = min;
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

    }
}