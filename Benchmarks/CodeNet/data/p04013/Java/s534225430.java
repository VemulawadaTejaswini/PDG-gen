import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] xs = new int[N];
        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
        }
        System.out.println( solve(N, A, xs) );
    }

    private static long solve(int N, int A, int[] xs) {
        long[][] dp = new long[N + 1][A*N + 1];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            int x = xs[i];
            calc(dp, N, A, x);
        }

        long sum = 0;
        for (int n = 1; n <= N; n++) {
            sum += dp[n][n * A];
        }
        return sum;
    }

    private static void calc(long[][] dp, int N, int A, int x) {
        for (int i = N; i > 0; i--) {
            for (int j = 0; j < N*A; j++) {
                if( j - x >= 0 ) {
                    dp[i][j] += dp[i-1][j-x];
                }
            }
        }
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add(String.valueOf(i));
        }
        System.err.println(j.toString());
    }
}