import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int[][][] dp = new int[N+1][N*100+1][3];
        dp[0][0][0] = 1;//done
        dp[0][0][1] = 0;//a
        dp[0][0][2] = 0;//b
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N*100; j++) {
                if (dp[i-1][j][0] == 0) {
                    continue;
                }
                dp[i][j][0] = 1;
                dp[i][j][1] = dp[i-1][j][1];
                dp[i][j][2] = dp[i-1][j][2];
                dp[i][j+c[i]][0] = 1;
                dp[i][j+c[i]][1] = dp[i-1][j][1] + a[i];
                dp[i][j+c[i]][2] = dp[i-1][j][2] + b[i];
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int j = 1; j <= N*100; j++) {
            if (dp[N][j][0] == 0) {
                continue;
            }
            if (dp[N][j][1] * Mb == dp[N][j][2] * Ma) {
                answer = Math.min(answer, j);
            }
        }
        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }
        System.out.println(answer);
    }
}
