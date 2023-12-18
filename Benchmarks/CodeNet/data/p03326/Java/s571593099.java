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
        Sum[][] dp = new Sum[m+1][n+1];
        Arrays.fill(dp[0], new Sum(0, 0, 0));
        for(int i = 1; i <= m; i++) {
            dp[i][0] = new Sum(0, 0, 0);
        }
        for(int k = 1; k <= m; k++) {
            for(int i = 1; i <= n; i++) {
                for(int t = 1; t <= i; t++) {
                    Sum tmp = dp[k-1][i-t];
                    Sum sum = new Sum(tmp.x + x[i], tmp.y + y[i], tmp.z + z[i]);
                    Sum bigger = sum.sum() > dp[k][i-t].sum() ? sum : dp[k][i-t];
                    if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                        dp[k][i] = bigger;
                    }
                }
            }
        }
        System.out.println(dp[m][n].sum());
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