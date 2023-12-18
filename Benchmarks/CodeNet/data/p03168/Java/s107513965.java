import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float[] p = new float[n + 1];
        p[0] = 0;

        float[][] memo = new float[n + 1][n + 1];
        memo[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            p[i] = in.nextFloat();
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    memo[i][j] = memo[i - 1][j] * (1 - p[i]);
                } else {
                    memo[i][j] = memo[i - 1][j] * (1 - p[i]) + memo[i - 1][j - 1] * p[i];
                }
            }
        }
        in.close();


        float result = 0;
        for (int i = (n + 1) / 2; i <= n; i++) {
            result = result + memo[n][i];
        }

        System.out.println(result);
    }
}