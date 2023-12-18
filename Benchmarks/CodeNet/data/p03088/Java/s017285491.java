import java.util.Scanner;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());

        //1: A, 2: G, 3: C, 4: T
        long[][][][] dp = new long[N + 1][5][5][5];

        dp[0][0][0][0] = 1;
        for (int n = 1; n <= N; n++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        for (int l = 1; l < 5; l++) {
                            if ((j == 1 && k == 2 && l == 3)
                                    || (j == 1 && k == 3 && l == 2)
                                    || (j == 2 && k == 1 && l == 3)
                                    || (i == 1 && k == 2 && l == 3)
                                    || (i == 1 && j == 2 && l == 3)
                            ) {
                                continue;
                            }
                            dp[n][j][k][l] += dp[n - 1][i][j][k];
                            dp[n][j][k][l] %= MOD;
                        }
                    }
                }
            }
        }

        long ans = 0;
        for (int j = 1; j < 5; j++) {
            for (int k = 1; k < 5; k++) {
                for (int l = 1; l < 5; l++) {
                    ans += dp[N][j][k][l];
                    ans %= MOD;
                }
            }
        }

        System.out.println(ans);
    }

}