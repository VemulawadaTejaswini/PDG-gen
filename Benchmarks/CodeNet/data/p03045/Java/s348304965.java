import java.util.Scanner;

public class Main {

    static int root(int x, int[] dp) {
        if (dp[x] == x) {
            return x;
        }

        return root(dp[x], dp);
    }

    static void unite(int x, int y, int[] dp) {
        int rx = root(x, dp);
        int ry = root(y, dp);

        if (rx == ry) {
            return;
        }

        dp[rx] = ry;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int[] dp = new int[n];
        int[] zs = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int x = std.nextInt() - 1;
            int y = std.nextInt() - 1;
            int z = std.nextInt();
            zs[i] = z;
            unite(x, y, dp);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            int ri = dp[i];
            if (ri == i) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
