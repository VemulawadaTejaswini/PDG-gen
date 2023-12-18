import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[][] A = new int[N][2];
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < N; j++)
                A[j][i] = sc.nextInt();
        final int[][] dp = new int[N + 1][2];
        for(int i = 0; i < N; i++) {
            dp[i + 1][0] = dp[i][0] + A[i][0];
            dp[i + 1][1] = Math.max(dp[i + 1][0], dp[i][1]) + A[i][1];
        }
        System.out.println(dp[N][1]);
    }
}
public class Main {
    public static void main(String... args) {
        C.main(args);
    }
}