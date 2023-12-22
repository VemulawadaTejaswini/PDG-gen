import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int H = sc.nextInt(), W = sc.nextInt();
                        int[][] map = new int[H][W];
                        for (int i = 0; i < H; i++) {
                                for (int j = 0; j < W; j++) {
                                        map[i][j] = sc.nextInt();
                                }
                        }

                        int[][] dp = new int[H][W];
                        for (int i = 0; i < H; i++) {
                                int j = 0;
                                while (j < W) {
                                        int k = j;
                                        while (k < W && map[i][k] == 0) {
                                                k++;
                                        }
                                        for (int x = 1; x <= k - j; x++) {
                                                dp[i][k-x] = x;
                                        }
                                        j = k;
                                        j++;
                                }
                        }
                        int ans = 0;
                        for (int i = 0; i < H; i++) {
                                for (int j = 0; j < W; j++) {
                                        if (dp[i][j] > ans) {
                                                boolean f = true;
                                                int k;
                                                for (k = i; k < i+ans+1 && k < H; k++) {
                                                        if(dp[k][j] <= ans) {
                                                                f = false;
                                                                break;
                                                        }
                                                }
                                                if (f&&k==i+ans+1) {
                                                        ans++;
                                                        j--;
                                                }
                                        }
                                }
                        }
                        ans = Math.max(ans * ans, 0);
                        System.out.println(ans);
                }
        }
}