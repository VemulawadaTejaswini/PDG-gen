import java.util.*;

public class Main {
    private static int m, n;
    private static int[][] memo = new int[1<<11][1<<11];
    private static int[] f = new int[128];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            m = sc.nextInt();
            n = sc.nextInt();
            if (m == 0 && n == 0) break;
            
            for (int i=0; i<n; i++) {
                f[i] = sc.nextInt(2);
            }

            for (int i=0; i<(1<<m); i++) {
                for (int j=0; j<(1<<m); j++) {
                    memo[i][j] = -1;
                }
            }
            
            System.out.println(dp(0, 0));
        }
    }

    private static int dp(int q, int a) {
        if (memo[q][a] != -1) return memo[q][a];

        int count = 0;
        for (int i=0; i<n; i++) {
            if ((q & f[i]) == a) count++;
        }

        if (count <= 1) {
            memo[q][a] = 0;
            return memo[q][a];
        }

        int res = 10000;
        for (int i=0; i<m; i++) {
            if ((q>>i) % 2 == 1) continue;
            res = Math.min(res, Math.max(dp(q|(1<<i), a), dp(q|(1<<i), a|(1<<i))));
        }
        memo[q][a] = res + 1;
        return memo[q][a];
    }
}