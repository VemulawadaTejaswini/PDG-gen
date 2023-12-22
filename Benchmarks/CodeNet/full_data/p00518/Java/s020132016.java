
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int MOD = 10007;
        int n = sc.nextInt();
        String l = ("J" + sc.next()).replace('J', '0').replace('O', '1').replace('I', '2');
        int[][] dp = new int[n + 1][8];
        
        dp[0][1] = 1;
        
        for (int i = 0; i <n; i++) {
            for (int j = 1; j < (1 << 3); j++) 
            for (int nj = 1; nj < (1 << 3); nj++) {
                if ((j & (1 << (l.charAt(i) - '0'))) == 0) continue;
                if ((j & nj) == 0) continue;
                if ((nj & (1 << (l.charAt(i + 1) - '0'))) == 0) continue;
                dp[i + 1][nj] = (dp[i + 1][nj] + dp[i][j]) % MOD;
            }
        }
        int ans = 0;
        for (int i = 0; i < (1 << 3); i++) {
            ans = (ans + dp[n][i]) % MOD;
        }
        
        System.out.println(ans);
    }
        
    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}