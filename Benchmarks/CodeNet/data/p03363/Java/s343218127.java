import javax.sql.XAConnection;
import java.util.*;

public class Main {
    static int N;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new int[N][N];

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (solve(A, i, j) == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static int solve(int[] A, int begin, int end) {
        int ans;
        if (dp[begin][end] != Integer.MAX_VALUE) {
            ans = dp[begin][end];
        } else if (begin == end) {
            ans = A[begin];
            dp[begin][end] = ans;
        } else {
            ans = A[end] + solve(A, begin, end - 1);
            dp[begin][end] = ans;
        }
        return ans;
    }
}