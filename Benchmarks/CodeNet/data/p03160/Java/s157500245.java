import java.util.Scanner;

public class Main {
    static int N;
    static int[] h;
    static int[] dp;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        h = new int[N];
        dp = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void main(String args[]) {
        init();

        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);

        for(int i = 2; i < N; i++) {
            int one = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            int two = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
            dp[i] = Math.min(one ,two);
        }
        
        System.out.println(dp[N - 1]);
    }
}