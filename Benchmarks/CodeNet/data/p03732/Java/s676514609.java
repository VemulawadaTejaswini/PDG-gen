import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    int N;
    int W;
    int[] w;
    int[] v;
    long[][] dp;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        W = scanner.nextInt();
        w = new int[N];
        v = new int[N];
        dp = new long[N+1][W+1];
        for(int i = 0; i < N; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }

        System.out.println(f(0, W));
    }

    private long f(int i, int weight) {
        if(dp[i][weight]> 0) {
            return dp[i][weight];
        }

        if(i == N) {
            dp[i][weight] = 0;
        }else if(weight  < w[i]) {
            dp[i][weight] = f(i + 1, weight);
        }else{
            dp[i][weight] = Math.max(f(i + 1, weight), f(i + 1, weight - w[i]) + v[i]);
        }
        return dp[i][weight];
    }
}