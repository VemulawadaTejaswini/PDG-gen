import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, m, r;
    int[] rs;
    int[][] graph;
    static final int INF = Integer.MAX_VALUE;
    ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        rs = new int[r];
        graph = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(graph[i], INF);
        for (int i = 0; i < r; i++)
            rs[i] = sc.nextInt() - 1;
        for (int i = 0; i < m; i++) {
            int j = sc.nextInt() - 1;
            int k = sc.nextInt() - 1;
            int c = sc.nextInt();
            graph[j][k] = graph[k][j] = c;
        }
    }

    private void solve() {
        int[][] dp = dp();
        permutation(dp, 0);
        System.out.println(ans.stream().min(Integer::compareTo).get());
    }

    private void permutation(int[][] dp, int index) {
        if (index >= r - 1) {
            int ret = 0;
            for (int i = 0; i < r - 1; i++) {
                ret += dp[rs[i]][rs[i+1]];
            }
            ans.add(ret);
            return;
        }
        for (int i = index; i < r; i++) {
            int t = rs[index];
            rs[index] = rs[i];
            rs[i] = t;

            permutation(dp, index+1);

            t = rs[index];
            rs[index] = rs[i];
            rs[i] = t;
        }
    }

    private int[][] dp() {
        int[][] ret = new int[n][];
        for (int i = 0; i < n; i++) {
            ret[i] = Arrays.copyOf(graph[i], n);
            ret[i][i] = 0;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ret[i][j] = Math.min(ret[i][j], ret[i][k] + ret[k][j]);
                }
            }
        }
        return ret;
    }
}
