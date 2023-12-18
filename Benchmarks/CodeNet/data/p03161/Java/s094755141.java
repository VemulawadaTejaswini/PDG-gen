import java.util.Scanner;

class Problem {
    private int N;
    private int K;
    private int[] hs;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        hs = new int[N];
        for (int i = 0; i < N; i++) {
            hs[i] = sc.nextInt();
        }
    }

    int solve() {
        int[] costs = new int[N];
        for(int i = 1; i < N; i++) {
            costs[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= K; j++) {
                if (i - j < 0) break;

                int cost = Math.abs(hs[i] - hs[i-j]) + costs[i-j];
                costs[i] = Math.min(costs[i], cost);
            }
        }
        return costs[N-1];
    }
}

public class Main {
    public static void main(String[] args) {
        int ans = new Problem().solve();
        System.out.println(ans);
    }
}
