import java.util.Scanner;

public class Main {

    public static long find_max(int i, int N, int[] A, long[] dp) {
        return  i == N-1 ? 0 : Long.max(dp[i+1], A[i] + find_max(i+2, N, A, dp));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        long[] dp = new long[N+1];

        for(int i = 0;i < N;i++) {
            A[i] = scanner.nextInt();
        }

        dp[N-1] = A[N-1];
        int i = N-3;
        while(i >= 0) {
            dp[i] = dp[i+2] + A[i];
            i -= 2;
        }

        i = N-2;
        while(i >= 0) {
            dp[i] = Long.max(dp[i+1], A[i]+dp[i+2]);
            i-=2;
        }

        System.out.println(N % 2 == 0 ? dp[0] : find_max(0, N, A, dp));
    }
}
