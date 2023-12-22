import java.util.Scanner;

public class Main {
    public static Scanner sc;
    /* ?????§??¨?????? */
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (solve()) {
        }
        sc.close();
    }

    public static boolean solve() {
        int n = sc.nextInt();
        if (n == 0) {
            return false;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = dp(a, 0, 0);
        System.out.println(m);
        return true;
    }

    public static int dp(int[] m, int sum, int k) {
        if (k == m.length) {
            return sum;
        }
        if (sum != 0) {
            return Math.max(sum, dp(m, sum + m[k], k + 1));
        }
        return Math.max(dp(m, 0, k + 1), dp(m, m[k], k + 1));
    }
}