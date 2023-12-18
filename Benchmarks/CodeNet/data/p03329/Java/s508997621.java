import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] dp = new int[100010];

        for (int i = 1; i < 100000; i++) {
            dp[i] = Integer.MAX_VALUE;
            int pow = 1;
            while (pow <= i) {
                dp[i] = Math.min(dp[i], dp[i - pow] + 1);
                pow *= 6;
            }
            pow = 1;
            while (pow <= i) {
                dp[i] = Math.min(dp[i], dp[i - pow] + 1);
                pow *= 9;
            }
        }
        System.out.println(dp[n]);
    }
}