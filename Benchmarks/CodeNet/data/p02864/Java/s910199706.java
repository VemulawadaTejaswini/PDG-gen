import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] H = new long[N];
        for(int i = 0; i < N; i++) {
            H[i] = sc.nextLong();
        }

        if(N == K) {
            System.out.println("0");
            return;
        }

        long[][] dp = new long[N][N-K+1];
        for(int i = 0; i < N; i++) {
            dp[i][0] = 0;
            dp[i][1] = H[i];
        }

        for(int l = 2; l <= N-K; l++) {
            for(int k = 0; k < N; k++) {
                if(k + 1 >= l) {
                    long min = -1;
                    for(int i = 0; i < k; i++) {
                        if(dp[i][l-1] != -1) {
                            long tmp = dp[i][l-1] + Math.max(0, H[k] - H[i]);
                            if(min == -1 || tmp < min) {
                                min = tmp;
                            }
                        }
                    }
                    dp[k][l] = min;
                } else {
                    dp[k][l] = -1;
                }
            }
        }

        long result = -1;
        for(int i = (N - K) - 1; i < N; i++) {
            if(result == -1 || dp[i][N-K] < result) {
                result = dp[i][N-K];
            }
        }
        System.out.println(result);
    }
}
