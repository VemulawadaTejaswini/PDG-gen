import java.util.Scanner;

public class Main {
    static final int mod = (int)1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[] dp = new int[1 << N];
        dp[0] = 1;

        for (int mask = 1; mask < (1 << N); mask++) {
            int person = Integer.bitCount(mask) - 1;
            for (int b = 0; b < N; b++) {
                if (((mask >> b) & 1) == 1 && A[person][b] == 1) {
                    dp[mask] += dp[mask ^ (1 << b)];
                    dp[mask] %= mod;
                }
            }

        }
        System.out.println(dp[(1 << N) - 1]);
    }
}
