import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = scan.nextInt();
        }
        boolean[][] dp = new boolean[N+1][101];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], false);
        }
        dp[0][0] = true;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <=100; j++) {
                if (!dp[i - 1][j]) {
                    continue;
                }
                dp[i][j] = true;
                if (j + s[i-1] <= 100) {
                    dp[i][j+s[i-1]] = true;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (dp[N][i]) {
                answer = Math.max(answer, i);
            }
        }
        System.out.println(answer);
    }
}
