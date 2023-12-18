import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int R = scan.nextInt();
        int S = scan.nextInt();
        int P = scan.nextInt();
        String T = scan.next();
        char[] data = T.toCharArray();
        int[][] dp = new int[N+1][3];
        boolean[][] check = new boolean[N+1][3];
        for (int i = 0; i < N+1; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;
        for (int i = 1; i <= K; i++) {
            int win = win(data[i-1]);
            int point = point(data[i-1], R, S, P);
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][2]));
                if (win == j) {
                    dp[i][j] += point;
                    check[i][j] = true;
                }
            }
        }
        for (int i = K+1; i <= N; i++) {
            int win = win(data[i-1]);
            int last_K = win(data[i-1-K]);
            int point = point(data[i-1], R, S, P);
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][2]));
                if (win == j) {
                    if (win != last_K) {
                        dp[i][j] += point;
                        check[i][j] = true;
                        continue;
                    }
                    if (!check[i-K][j]) {
                        dp[i][j] += point;
                        check[i][j] = true;
                    }
                }
            }
        }
        System.out.println(Math.max(dp[N][0],Math.max(dp[N][1],dp[N][2])));
    }
    private int point(char x, int R, int S, int P) {
        if (x == 'r') {
            return P;
        }
        if (x == 's') {
            return R;
        }
        return S;
    }
    private int win(char x) {
        if (x == 'r') {
            return PAPER;
        }
        if (x == 's') {
            return ROCK;
        }
        return SCISSORS;
    }
    private final static int PAPER = 0;
    private final static int ROCK = 1;
    private final static int SCISSORS = 2;
}
