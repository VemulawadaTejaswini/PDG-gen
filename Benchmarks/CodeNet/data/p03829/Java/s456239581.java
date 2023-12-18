import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        long[] dp = new long[n];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i-1] + a * (ar[i] - ar[i-1]),
                    dp[i-1] + b);
        }
        System.out.println(dp[n-1]);
    }
}