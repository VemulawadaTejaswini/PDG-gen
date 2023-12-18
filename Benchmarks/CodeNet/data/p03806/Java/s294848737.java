import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Ma = scan.nextInt();
        int Mb = scan.nextInt();
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        int[] c = new int[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }
        int[][][][] dp = new int[N+1][401][401][2];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= 400; j++) {
                for (int k = 0; k <= 400; k++) {
                    dp[i][j][k][0] = 0;
                    dp[i][j][k][1] = Integer.MAX_VALUE;
                }
            }
        }
        dp[0][0][0][0] = 1;
        dp[0][0][0][1] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= 400; j++) {
                for (int k = 0; k <= 400; k++) {
                    if (dp[i - 1][j][k][0] == 0) {
                        continue;
                    }
                    dp[i][j][k][0] = 1;
                    dp[i][j][k][1] = Math.min(dp[i][j][k][1], dp[i - 1][j][k][1]);
                    dp[i][j + a[i]][k + b[i]][0] = 1;
                    dp[i][j + a[i]][k + b[i]][1] = Math.min(dp[i][j + a[i]][k + b[i]][1], dp[i - 1][j][k][1] + c[i]);
                }
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= 400; i++) {
            for (int j = 1; j <= 400; j++) {
                if (dp[N][i][j][0] == 0) {
                    continue;
                }
                if (i * Mb == j * Ma) {
                    answer = Math.min(answer, dp[N][i][j][1]);
                }
            }
        }
        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }
        System.out.println(answer);
    }
}
