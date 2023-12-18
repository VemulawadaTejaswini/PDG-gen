import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Solver s = new Solver();
        int test = 1;
        for (int i = 1; i <= test; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }

    static class Solver {
        int[] dp = new int[10];
        int[][] c;
        void solve(int test_case, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Arrays.fill(dp, Integer.MAX_VALUE);
            c = new int[10][10];
            for (int i = 0; i <= 9; i++)
                for (int j = 0; j <= 9; j++)
                    c[i][j] = in.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) a[i][j] = in.nextInt();
            }
            Queue<Integer> q = new LinkedList<>();
            int[] get = new int[10];
            for (int i = 0; i <= 9; i++) {
                q.clear();
                Arrays.fill(dp, Integer.MAX_VALUE);
                q.add(i);
                dp[i] = 0;
                while (!q.isEmpty()) {
                    int x = q.remove();
                    for (int j = 0; j <= 9; j++) {
                        if (j == i) continue;
                        if (dp[j] > dp[x] + c[x][j]) {
                            dp[j] = dp[x] + c[x][j];
                            q.add(j);
                        }
                    }
                }
                get[i] = dp[1];
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 1 || a[i][j] == -1) continue;
                    ans += get[a[i][j]];
                }
            }
            out.println(ans);
        }
    }

    static class InputReader {

        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}