import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                a++;
            } else if (x == 2) {
                b++;
            } else if (x == 3) {
                c++;
            }
        }
        double[][][] dp = new double[310][310][310];
        for (int i = 0; i < 310; i++) {
            for (int j = 0; j < 310; j++) {
                for (int k = 0; k < 310; k++) {
                    dp[i][j][k] = -1.0;
                }
            }
        }
        System.out.println(solve(dp, a, b, c, n));
    }

    private static double solve(double[][][] dp, double a, double b, double c, double n) {
        if ((a + b + c) == 0) {
            return 0.0;
        }
        if (dp[(int) a][(int) b][(int) c] >= 0) {
            return dp[(int) a][(int) b][(int) c];
        }
        double ret = (n / (a + b + c));
        if (a > 0) {
            ret += (solve(dp, a - 1, b, c, n)) * (a / (a + b + c));
        }
        if (b > 0) {
            ret += (solve(dp, a + 1, b - 1, c, n)) * (b / (a + b + c));
        }
        if (c > 0) {
            ret += (solve(dp, a, b + 1, c - 1, n)) * (c / (a + b + c));
        }
        return dp[(int) a][(int) b][(int) c] = ret;
    }
}
