import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dishes = new int[N];

        int b = 0, c = 0, d = 0;
        double[][][] dp = new double[N + 1][N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) b++;
            else if (tmp == 2) c++;
            else if (tmp == 3) d++;
        }

        System.out.println(backtrack(b, c, d, N, dp));
    }

    public static double backtrack(int b, int c, int d, int N, double[][][] dp) {
        if (b == 0 && c == 0 && d == 0) return 0;
        if (dp[b][c][d] != 0) return dp[b][c][d];

        double res = (double) N / (double) (b + c + d);

        if (b != 0)
            res += backtrack(b - 1, c, d, N, dp) * (double) b / (double) (b + c + d);
        if (c != 0)
            res += backtrack(b + 1, c - 1, d, N, dp) * (double) c / (double) (b + c + d);
        if (d != 0)
            res += backtrack(b, c + 1, d - 1, N, dp) * (double) d / (double) (b + c + d);

        dp[b][c][d] = res;
        return res;
    }
}
