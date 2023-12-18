import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //dream dreamer erase eraser
        int H;
        int W;
        String[] sList;
        try (Scanner sc = new Scanner(System.in)) {
            H = sc.nextInt();
            W = sc.nextInt();
            sList = new String[H];
            for (int i = 0; i < H; i++) {
                sList[i] = sc.next();
            }
        }
        long dp[][] = new long[H + 2][W + 2];

        for (int i = 1; i <= H; i++) {
            char[] c = sList[i - 1].toCharArray();
            for (int j = 1; j <= W; j++) {
                if (c[j - 1] == '#') {
                    //爆弾
                    dp[i][j] = Long.MIN_VALUE;
                } else {
                    //空きマス
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if (dp[i][j] < 0) {
                    //周りに足しこむ
                    addSurroundMass(dp, i, j);
                }
            }
        }

        for (int i = 1; i <= H; i++) {
            char[] c = sList[i - 1].toCharArray();
            for (int j = 1; j <= W; j++) {
                if (c[j - 1] == '#') {
                    System.out.print("#");
                } else {
                    //空きマス
                    System.out.print(dp[i][j]);
                }
            }
            System.out.println("");
        }
        return;
    }

    private static void addSurroundMass(long[][] dp, int i, int j) {
        dp[i - 1][j] += 1;
        dp[i - 1][j - 1] += 1;
        dp[i][j - 1] += 1;
        dp[i + 1][j - 1] += 1;
        dp[i + 1][j] += 1;
        dp[i + 1][j + 1] += 1;
        dp[i][j + 1] += 1;
        dp[i - 1][j + 1] += 1;
    }
}
