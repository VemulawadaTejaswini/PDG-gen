import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int[] tmps = new int[d];
        for (int i = 0; i < d; i++) {
            tmps[i] = sc.nextInt();
        }
        Cloth[] cloths = new Cloth[n];
        for (int i = 0; i < n; i++) {
            cloths[i] = new Cloth(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int[][] dp = new int[d + 1][101];
        Arrays.fill(dp[0], Integer.MIN_VALUE);
        dp[0][0] = 0;
        for (int i = 1; i <= d; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
            for (int j = 0; j < n; j++) {
                if (cloths[j].left > tmps[i - 1] || cloths[j].right < tmps[i - 1]) {
                    continue;
                }
                if (i == 1) {
                    dp[i][cloths[j].value] = 0;
                    continue;
                }
                for (int k = 0; k <= 100; k++) {
                    dp[i][cloths[j].value] = Math.max(dp[i][cloths[j].value], dp[i - 1][k] + Math.abs(k - cloths[j].value));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 100; i++) {
            max = Math.max(max, dp[d][i]);
        }
       System.out.println(max);
    }
    
    static class Cloth {
        int left;
        int right;
        int value;
        
        public Cloth(int left, int right, int value) {
            this.left = left;
            this.right = right ;
            this.value = value;
        }
    }
}

