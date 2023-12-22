
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    private static final int MOD = 998244353;

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int s = in.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(dfs(arr, s, 0, 0, new Integer[s + 1][n][n]));
    }

    private static long dfs(int[] arr, int s, int length, int idx, Integer[][][] dp) {
        if (idx == arr.length) {
            if (s == 0) {
                return (long) Math.pow(2, arr.length - length);
            }
            return 0;
        }
        if (dp[s][length][idx] != null) {
            return dp[s][length][idx];
        }

        final long skip = dfs(arr, s, length, idx + 1, dp);
        long add = 0;
        if (s >= arr[idx]) {
            add = dfs(arr, s - arr[idx], length + 1, idx + 1, dp);
        }
        return dp[s][length][idx] = Math.floorMod(skip + add, MOD);
    }
}
