import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] field = new int[H][W];
        for(int i = 0; i < H; i++) {
            String line = sc.next();
            for(int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                field[i][j] = c - '0';
            }
        }
        int[][] dp = new int[H][W];
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                dp[i][j] = 100000000;
            }
        }
        dp[0][0] = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(i < H - 1) dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + field[i + 1][j]);
                if(j < W - 1) dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + field[i][j + 1]);
            }
        }
        System.out.println(dp[H - 1][W - 1]);
    }
}