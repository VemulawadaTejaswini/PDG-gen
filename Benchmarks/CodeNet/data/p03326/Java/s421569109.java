import java.util.*;
import java.util.stream.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        long[] x = new long[n + 1], y = new long[n + 1], z = new long[n + 1];
        for(int i = 1; i <= n; i++) {
            x[i] = in.nextLong();
            y[i] = in.nextLong();
            z[i] = in.nextLong();
        }
        long ans1 = 0, ans2 = 0, ans3 = 0, ans4= 0;
        {
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                    Sum tmp = dp[k-1][i-1];
                    Sum sum = new Sum(tmp.x + x[i], tmp.y + y[i], tmp.z + z[i]);
                    dp[k][i] = dp[k-1][i-1].x + x[i] > dp[k][i-1].x ? sum : dp[k][i-1];
                }
            }
            ans1 = dp[m][n].sum();
        }
        {
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                    Sum tmp = dp[k-1][i-1];
                    Sum sum = new Sum(tmp.x + x[i], tmp.y + y[i], tmp.z + z[i]);
                    dp[k][i] = dp[k-1][i-1].y + y[i] > dp[k][i-1].y ? sum : dp[k][i-1];
                }
            }
            ans2 = dp[m][n].sum();
        }
        {
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                    Sum tmp = dp[k-1][i-1];
                    Sum sum = new Sum(tmp.x + x[i], tmp.y + y[i], tmp.z + z[i]);
                    dp[k][i] = dp[k-1][i-1].z + z[i] > dp[k][i-1].z ? sum : dp[k][i-1];
                }
            }
            ans3 = dp[m][n].sum();
        }
        {
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                    Sum tmp = dp[k-1][i-1];
                    Sum sum = new Sum(tmp.x + x[i], tmp.y + y[i], tmp.z + z[i]);
                    dp[k][i] = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                }
            }
            ans4 = dp[m][n].sum();
        }
        System.out.println(Math.max(Math.max(ans1, ans2), Math.max(ans3, ans4)));
    }
}

class Sum {
    long x, y, z;
    public Sum(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long sum() {
        return Math.abs(x) + Math.abs(y) + Math.abs(z);
    }

    public String toString() {
        return String.format("(%d, %d, %d)", x, y, z);
    }
}