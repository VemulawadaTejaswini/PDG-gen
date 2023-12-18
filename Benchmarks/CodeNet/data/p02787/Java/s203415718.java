import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int H;
    public static int N;

    public static int[] A; // 攻撃力
    public static int[] B; // 必要MP

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        H = sc.nextInt();
        N = sc.nextInt();
        A = new int[N];
        B = new int[N];
        int maxA = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();

            maxA = Math.max(A[i], maxA);
        }

        // (どこまでの魔法を使ったか ,合計ダメージ) -> 必要な魔力の最小値

        int[][] dp = new int[N + 1][H + 1 + maxA];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
            dp[i][0] = 0;
        }

        for (int n = 0; n < N; n++) {
            for (int h = 0; h <= H + maxA; h++) {
                for (int k = 0; k * A[n] <= h; k++) {
                    for(int i=1; i<=A[n]; i++)

                        dp[n + 1][h] = Math.min(dp[n + 1][h], dp[n][h - k * i] + k * B[n]);
                }
            }
        }
        System.out.println(dp[N][H]);
    }

}
