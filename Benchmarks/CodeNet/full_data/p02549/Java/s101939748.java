import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int MOD = 998244353;
        
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        
        final Set<Integer> steps = new HashSet<>();
        
        for (int i = 0; i < K; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            for (int j = L; j <= R; j++) {
                steps.add(j);
            }
        }
        
        final long[] dp = new long[N];
        dp[0] = 1;
        
        for (int i = 0; i < N - 1; i++) {
            if (dp[i] == 0) {
                continue;
            }
            dp[i] %= MOD;
            
            final int ii = i;
            
            steps.forEach(s -> {
                if (ii + s < N) {
                    dp[ii + s] += dp[ii];
                }
            });
        }
        
        System.out.println(dp[N - 1] %= MOD);
    }
}
