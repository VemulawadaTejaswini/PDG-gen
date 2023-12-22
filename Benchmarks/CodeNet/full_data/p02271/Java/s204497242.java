import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        boolean[][] dp = new boolean[n + 1][2001];
        for (int i = a.length - 1; i >= 0; i--) {
            dp[i][a[i]] = true;
            for (int j = dp[i + 1].length - 1; j >= 0 ; j--) {
                if (j > a[i] && dp[i + 1][j - a[i]] || dp[i + 1][j]) dp[i][j] = true;
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(dp[0][scanner.nextInt()] ? "yes": "no");
        }
        /**
        for (boolean[] b : dp) {
            for (boolean bb : b) {
                System.out.print(String.valueOf(bb) + " ");
            }
            System.out.println("");
        }
        **/
    }
}