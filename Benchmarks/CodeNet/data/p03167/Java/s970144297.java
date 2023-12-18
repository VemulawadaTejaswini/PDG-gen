import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final long INF = (long) 1e18;
    static final int mod = (int) (1e9 + 7);
    static int n, m;
    static char[][] grid;
    static int memo[][];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new char[n][m];
        for (int i = 0; i < n; i++)
            grid[i] = sc.next().toCharArray();
        memo = new int[n][m];
        for (int[] a : memo)
            Arrays.fill(a, UNCALC);
        out.println(Math.max(0,dp(0, 0)));
        out.flush();
        out.close();

    }

    static int dp(int x, int y) {
        if (x == n - 1 && y == m - 1) return 1;
        if (!valid(x, y)) return 0;
        if (memo[x][y] != UNCALC) return memo[x][y];
        int right = dp(x + 1, y);
        int down = dp(x, y + 1);
        return memo[x][y] = add(right,down);
    }

    static boolean valid(int x, int y) {
        return x < n && y < m && grid[x][y] != '#';
    }

    static int add(int a, int b) {
        return ((a+b) % mod);
    }

    static class Scanner {

        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }


    }

}