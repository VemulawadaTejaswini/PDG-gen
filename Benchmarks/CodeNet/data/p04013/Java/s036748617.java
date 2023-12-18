import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int A,N;
    int[] xs;
    long[][] dp;
    int nx;
    int na;
    Main () {
    }
    public static void main(String[] args) {
        Main m = new Main();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] strs = br.readLine().split(" ");
            m.N = Integer.parseInt(strs[0]);
            m.A = Integer.parseInt(strs[1]);
            strs = br.readLine().split(" ");
            m.xs = new int[m.N];
            for (int i = 0; i < m.N; i++) {
                m.xs[i] = Integer.parseInt(strs[i]) - m.A;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        m.nx = m.N * 50;
        m.na = m.A * m.N;
        m.dp = new long[m.N+1][2*m.nx + 1];
        m.dp[0][m.na] = 1;
        m.update();
        System.out.println(m.result());
//        m.check();
    }

    void update () {
        for (int i = 1; i <= N; i++) {
            int trg = xs[i - 1];
            for (int j = 0; j < dp[0].length; j++) {
                if (j < trg || j > 2 * nx - trg) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j - trg >= 0 && j - trg < dp[0].length) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - trg];
                }
            }
        }
    }

    long result () {
        long res = dp[N][na] - 1;
        return res;
    }

    void check () {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                    if (dp[i][j] != 0)
                        System.out.printf("%d, %d: %d\n", i, j, dp[i][j]);
            }
        }
    }
}
