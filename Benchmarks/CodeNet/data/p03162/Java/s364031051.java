import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static int n;
    static int[][] memo;
    static int[][] points;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        memo = new int[3][n];
        for (int[] a : memo)
            Arrays.fill(a, UNCALC);
        points = new int[3][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                points[j][i] = sc.nextInt();
        out.println(dp(0, 0));
        out.flush();
        out.close();

    }

    static int dp(int prev, int i) {
        if (i == n) return 0;
        if (memo[prev][i] != UNCALC) return memo[prev][i];
        int max = 0;
        for (int j = 0; j < 3; j++) {
            if (i != 0 && j == prev) continue;
            max = Math.max(max, points[j][i] + dp(j, i + 1));
        }
        return memo[prev][i] = max;
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