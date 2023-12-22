import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static double[][] dis;
    static double dp[][];
    static int n;
    static int g;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String tmp[] = sc.nextLine().split(" ");
            int l = Integer.parseInt(tmp[0]);
            int rs[] = new int[tmp.length - 1];
            for (int i = 1; i < tmp.length; i++) {
                rs[i - 1] = Integer.parseInt(tmp[i]);
            }
            n = rs.length;
            dis = new double[n][n];
            dp = new double[1 << n][n];

            for (int i = 0; i < n; i++) {
                dis[i][i] = 0;
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    dis[i][j] = dis[j][i] = 1.0
                            * (rs[i] + rs[j])
                            * Math.cos(Math.asin(1.0 * Math.abs(rs[i] - rs[j])
                                    / (rs[i] + rs[j])));
                }
            }
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    g = j;
                    for (int k = 0; k < 1 << n; k++) {
                        Arrays.fill(dp[k], -1);
                    }
                    double dis = tsp(0, i);
                    if (dis + rs[i] + rs[j] <= l) {
                        flag = true;
                        i = n;
                        break;
                    }
                }
            }
            System.out.println(flag ? "OK" : "NA");

        }
    }

    public static double tsp(int S, int v) { // S:既に訪れた頂点、v:現在いる頂点
        if (dp[S][v] >= 0) {
            return dp[S][v];
        }
        if (S == (1 << n) - 1 && v == g) {
            return dp[S][v] = 0;
        }
        double res = Double.POSITIVE_INFINITY;
        for (int u = 0; u < n; u++) {
            if ((S >> u & 1) == 0) {
                res = Math.min(res, tsp(S | 1 << u, u) + dis[v][u]);
            }
        }
        return dp[S][v] = res;
    }
}