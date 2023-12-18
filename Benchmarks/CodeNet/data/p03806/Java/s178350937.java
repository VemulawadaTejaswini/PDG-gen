import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ma = scanner.nextInt();
        int mb = scanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }

        int[][][] dp = new int[N+1][401][401];
        boolean[][][] visible = new boolean[N+1][401][401];

        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < 401; j++) {
                Arrays.fill(dp[i][j], 0);
                Arrays.fill(visible[i][j], false);
            }
        }
        visible[0][0][0] = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 401; j++) {
                for (int k = 0;k < 401; k++) {
                    if (visible[i][j][k]) {
                        dp[i + 1][j][k] = dp[i][j][k];
                        dp[i + 1][j + a[i]][k + b[i]] = dp[i][j][k] + c[i];
                        visible[i + 1][j][k] = true;
                        visible[i + 1][j + a[i]][k + b[i]] = true;
                    }
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 401; i++) {
            for (int j = 0; j < 401; j++) {
                if (i/(j*1.0) == ma/(mb*1.0) && visible[N][i][j]) {
                    ans = Math.min(ans, dp[N][i][j]);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
