import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int[] h = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(h[1]-h[0]);
        for (int i=2; i<N; i++) {
            dp[i] = Math.min(dp[i-2] + Math.abs(h[i]-h[i-2]), dp[i-1] + Math.abs(h[i]-h[i-1]));
        }
        System.out.println(dp[N-1]);
    } 
}