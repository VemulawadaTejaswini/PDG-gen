import java.util.Scanner;

class Problem {
    private int N;
    private int[] C;
    private final int MOD = (int) 1e9 + 7;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
    }

    int solve() {
        int[] nexts = new int[N];
        for (int i = 0; i < N; i++) {
            nexts[i] = -1;
            for (int j = i + 1; j < N; j++) {
                if (C[i] == C[j]) {
                    nexts[i] = j;
                    break;
                }
            }
        }
        int[] dp = new int[N];
        dp[N - 1] = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (nexts[i] > i + 1) {
                dp[i] = (dp[i+1] + dp[nexts[i]]) % MOD;
            } else {
                dp[i] = dp[i+1];
            }
        }
        return dp[0];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
