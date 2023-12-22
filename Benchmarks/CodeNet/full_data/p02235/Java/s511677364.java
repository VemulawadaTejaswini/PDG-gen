import java.util.*;

public class Main {
    static char[] a;
    static char[] b;
    static int[][] dp;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            solve();
        }
    }

    static void solve() {
        a = sc.next().toCharArray();
        b = sc.next().toCharArray();
        dp = new int[a.length + 1][b.length + 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                dp[i+1][j+1] = a[i] == b[j] ? dp[i][j] + 1 : Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        System.out.println(dp[a.length][b.length]);
    }
}

