import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        int MAX_INF = 10000000;
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] cost = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(cost[i], MAX_INF);
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
                dp[i][j] = MAX_INF;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = cost[i][j];
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
                if (dp[j][a[i]]+c[i] == dp[j][b[i]]) {
                    answer -= 1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
