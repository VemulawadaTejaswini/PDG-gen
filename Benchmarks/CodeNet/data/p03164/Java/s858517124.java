import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        int[] w = new int[n];
        int[] v = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            sum+=v[i];
        }
        System.out.println(solve(n, W, w, v, sum));
    }
    private static int solve(int n, int W, int[] w, int[] v, int sum) {
        int MAX_VAL = sum;
        int[] dp = new int[MAX_VAL+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int j = 1; j < dp.length; j++) {
            if(v[0] == j)
                dp[j] = w[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = MAX_VAL-v[i]; j >= 0; j--) {
                if(dp[j] != Integer.MAX_VALUE)
                    dp[j+v[i]] = Math.min(dp[j+v[i]], dp[j]+w[i]);
            }
        }
        for(int i = MAX_VAL; i > 0; i--) {
            if(dp[i] <= W) return i;
        }
        return 0;
    }
}
