import java.util.*;

public class Main {
    static long[] base = new long[61];
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        base[0] = 1;
        for (int i = 1; i < base.length; i++) {
            base[i] = base[i - 1] * 2 % MOD;
        }
        boolean[][] arr = new boolean[n + 1][61];
        for (int i = 1; i <= n; i++) {
            arr[i] = getArray(sc.nextLong());
        }
        long ans = 0;
        int[][] sums = new int[n + 1][61];
        for (int i = 0; i < 61; i++) {
            for (int j = 1; j <= n; j++) {
                sums[j][i] = sums[j - 1][i];
                if (arr[j][i]) {
                    sums[j][i]++;
                } 
                if (arr[j][i]) {
                    ans += (j - sums[j][i]) * base[i];
                    ans %= MOD;
                } else {
                    ans += sums[j][i] * base[i];
                    ans %= MOD;
                }
                
            }
        }
        System.out.println(ans);
    }
    
    static boolean[] getArray(long x) {
        boolean[] ans = new boolean[61];
        for (int i = 0; i <= 60; i++) {
            ans[i] = x % 2 == 1;
            x /= 2;
        }
        return ans;
    }
}
