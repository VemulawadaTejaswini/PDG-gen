
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public long solve(int n, int[] h, int[] value) {
        long []dp = new long[n + 1];

        int []x = new int[n + 1];
        x[0] = (int) -1e9;
        for(int i = 1; i <= n; i++) x[i] = h[i - 1];

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                if(x[i] > x[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + value[i - 1]);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []h = new int[n];
        int []v = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }

        System.out.println(new Main().solve(n, h, v));
    }


}
