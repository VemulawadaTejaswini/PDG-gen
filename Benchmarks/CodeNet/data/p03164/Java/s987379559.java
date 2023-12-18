import java.util.Scanner;

class Problem {
    private int N;
    private int W;
    private int[] weights;
    private int[] values;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        W = sc.nextInt();

        weights = new int[N];
        values = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
    }

    long solve() {
        int V = 0;
        for (int i = 0; i < N; i++) {
            V += values[i];
        }

        long[][] dp = new long[N][V+1];

        for (int i = 0; i < N; i++) {
            dp[i][0] = 0;
            for (int v = 1; v <= V; v++) {
                dp[i][v] = W+1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int v = 1; v <= V; v++) {
                if (i == 0) {
                    if (v == values[i]) {
                        dp[i][v] = weights[i];
                    }
                } else {
                    if (v < values[i]) {
                        dp[i][v] = dp[i - 1][v];
                    } else {
                        dp[i][v] = Math.min(dp[i - 1][v], dp[i-1][v - values[i]] + (long) weights[i]);
                    }
                }
            }
        }

        long found = 0;
        for (int v = V; v > 0; v--) {
            if (dp[N-1][v] <= W) {
                found = v;
                break;
            }
        }

        return found;
    }
}

public class Main {
    public static void main(String[] args) {
        long ans = new Problem().solve();
        System.out.println(ans);
    }
}
