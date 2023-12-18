import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();

            int[][] dp = new int[k][10];
            for (int[] v : dp) Arrays.fill(v, Integer.MAX_VALUE);
            dp[1][1] = 1;

            TreeSet<int[]> set = new TreeSet<>((o1, o2) -> {
                int ret = dp[o1[0]][o1[1]] - dp[o2[0]][o2[1]];
                if (ret == 0) {
                    return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
                } else {
                    return ret;
                }
            });
            set.add(new int[]{1, 1});
            while (set.size() > 0) {
                int[] v = set.pollFirst();
                if (v[1] + 1 < 10) {
                    int[] u = {(v[0] + 1) % k, v[1] + 1};
                    if (dp[v[0]][v[1]] + 1 < dp[u[0]][u[1]]) {
                        set.remove(u);
                        dp[u[0]][u[1]] = dp[v[0]][v[1]] + 1;
                        set.add(u);
                    }
                }
                int[] u = {(v[0] * 10) % k, 0};
                if (dp[v[0]][v[1]] < dp[u[0]][u[1]]) {
                    set.remove(u);
                    dp[u[0]][u[1]] = dp[v[0]][v[1]];
                    set.add(u);
                }
            }
            int ret = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i ++) {
                ret = Math.min(ret, dp[0][i]);
            }
            System.out.println(ret);
        }
    }
}

