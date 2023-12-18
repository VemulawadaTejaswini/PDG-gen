import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] weight = new int[n];
        long[] value = new long[n];
        for(int i = 0;i < n;i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextLong();
        }
        long[][] memo = new long[n][w + 1];
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < w + 1;j++) memo[i][j] = -1;
        }
        System.out.println(dp(n, w, weight, value, 0, 0, memo));
    }

    private static long dp(int n, int w, int[] weight, long[] value, int i, int u, long[][] memo) {
        if(u > w) return Long.MIN_VALUE;
        else if(memo[i][u] != -1) return memo[i][u];
        else if(i == n - 1) {
            if(u + weight[i] <= w) {
                memo[i][u] = value[i];
                return value[i];
            }
            else {
                memo[i][u] = 0;
                return 0;
            }
        }
        else {
            int nextIdx = i + 1;
            long maxValue = Long.MIN_VALUE;
            long tmpValue1 = Long.MIN_VALUE;
            long tmpValue2 = Long.MIN_VALUE;
            
            tmpValue1 = dp(n, w, weight, value, nextIdx, u, memo);
            tmpValue2 = dp(n, w, weight, value, nextIdx, u + weight[i], memo) + value[i];
            maxValue = Long.max(tmpValue1, tmpValue2);
            memo[i][u] = maxValue;
            
            return maxValue;
        }
    }
}
