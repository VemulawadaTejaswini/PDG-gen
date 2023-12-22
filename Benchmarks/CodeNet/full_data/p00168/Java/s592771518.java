import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[30];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for (int i = 3; i < 30; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
           System.out.println((dp[n-1]-1)/3650+1);
        }
    }

}
