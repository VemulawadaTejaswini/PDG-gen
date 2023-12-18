import java.util.Arrays;
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
        String S = scanner.next();
        String T = scanner.next();
        int[][] dp = new int[S.length() + 1][T.length() + 1];
        int[][] px = new int[S.length() + 1][T.length() + 1];
        int[][] py = new int[S.length() + 1][T.length() + 1];
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    px[i][j] = i - 1;
                    py[i][j] = j - 1;
                }
                else {
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        px[i][j] = i - 1;
                        py[i][j] = j;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                        px[i][j] = i;
                        py[i][j] = j - 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int cx = S.length(), cy = T.length();
        while (cx > 0 && cy > 0) {
            if (S.charAt(cx - 1) == T.charAt(cy - 1)) {
                sb.append(S.charAt(cx - 1));
            }
            int nx = px[cx][cy];
            cy = py[cx][cy];
            cx = nx;
        }
        sb.reverse();

        System.out.println(sb);

    }

}

