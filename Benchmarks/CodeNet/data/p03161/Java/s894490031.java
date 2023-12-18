import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static Scanner sc;

    private static void nextArr(int[] h) {
        for(int i = 0; i < h.length; i++) h[i] = sc.nextInt();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static void print(Object... vals) {
        for(int i = 0; i < vals.length; i++) {
            if (i != vals.length - 1) {
                System.out.print(vals[i] + ",");
            } else {
                System.out.print(vals[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        nextArr(h);

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= k; j++) {
                if (i - j >= 0 && dp[i - j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
                }
            }
        }
        print(dp[n - 1]);
    }
}
