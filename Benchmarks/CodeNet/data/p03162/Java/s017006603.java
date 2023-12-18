import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[][] dp = new int[count][3];
        int[][] arr = new int[count][3];
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < 3; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < 3; ++j) {
            dp[0][j] = arr[0][j];
        }

        for (int i = 1; i < count; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 3; ++k) {
                    if (j != k) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + arr[i][j]);
                    }
                }
            }
        }

        int res = 0;
        for (int j = 0; j < 3; ++j) {
            res = Math.max(dp[count - 1][j], res);
        }
        System.out.println(res);
    }
}
