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
        HashSet<String> remain = new HashSet<>();
        for (int i = 0 ; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            int c = scan.nextInt();
            remain.add(a + "_" + b);
            cost[a][b] = c;
            cost[b][a] = c;
        }
        int[][][] dp = new int[N][N][2];
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j][0] = 1000000;
                dp[i][j][1] = -1;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (cost[i][j] != 1000000) {
                    dp[i][j][0] = cost[i][j];
                    dp[i][j][1] = i;
                }
            }
        }
        for (int k = 0; k < N; k++) {
            for(int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (dp[i][k][0]+dp[k][j][0]<dp[i][j][0]) {
                        dp[i][j][0] = dp[i][k][0]+dp[k][j][0];
                        dp[i][j][1] = k;
                    } else {
                        dp[i][j][0] = dp[i][j][0];
                        dp[i][j][1] = dp[i][j][1];
                    }
                }
            }
        }
        for(int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (i == j) {
                    continue;
                }
                List<Integer> path = new ArrayList<Integer>();
                int target = i;
                int current = j;
                while(current != target) {
                    path.add(current);
                    current = dp[target][current][1];
                }
                path.add(target);
                int size = path.size();
                for(int k = 0; k < size - 1; k++) {
                    remain.remove(path.get(k) + "_" + path.get(k+1));
                    remain.remove(path.get(k+1) + "_" + path.get(k));
                }
            }
        }
        System.out.println(remain.size());
    }
}
