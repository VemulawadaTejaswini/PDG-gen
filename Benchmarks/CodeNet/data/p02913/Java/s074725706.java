import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int[][] dp = new int[N+1][N+1];

        for(int i = N-1; i >= 0; i--) {
            for(int j = N-1; j >= 0; j--){
                if(S.charAt(i) != S.charAt(j)) {
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i+1][j+1] + 1;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i >= j) continue;
                int now = Math.min(dp[i][j], j - i );
                ans = Math.max(ans, now);
            }
        }
        System.out.println(ans);
    }
}
