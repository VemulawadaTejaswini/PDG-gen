import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] cost = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(cost[i], 1000000);
        }
        int[] a = new int[M];
        int[] b = new int[M];
        int[] c = new int[M];
        for (int i = 0 ; i < M; i++) {
            a[i] = scan.nextInt()-1;
            b[i] = scan.nextInt()-1;
            c[i] = scan.nextInt();
            cost[a[i]][b[i]] = c[i];
            cost[b[i]][a[i]] = c[i];
        }
        int[][] dp = new int[N][N];
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = 1000000;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (cost[i][j] != 1000000) {
                    dp[i][j] = cost[i][j];
                }
            }
        }
        for (int k = 0; k < N; k++) {
            for(int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k][j]);
                }
            }
        }
        int answer = M;
        for(int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (dp[j][a[i]]+c[i] == dp[j][b[i]]) {
                    answer -= 1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
