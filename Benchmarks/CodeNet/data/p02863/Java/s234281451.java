import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            AB[i][0] = sc.nextInt();
            AB[i][1] = sc.nextInt();
        }

        Arrays.sort(AB, (a, b) -> a[0] - b[0]);

        int max = 0;
        int[] dp = new int[T];

        for (int i = 0; i < N; i++) {
            int a = AB[i][0];
            int b = AB[i][1];
            
            for (int j = T - 1; j >= 0; j--) {
       
                if (j >= a) {
                    dp[j] = Math.max(dp[j], dp[j-a] + b);
                }
            }
          max = Math.max(max, dp[T-1] + b);
        }
        System.out.println(max);
    }
}
