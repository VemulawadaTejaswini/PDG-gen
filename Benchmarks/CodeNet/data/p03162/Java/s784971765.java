import java.util.*;

class Main {

    static long dp[][] = new long[100005][3];
    static boolean vis[][] = new boolean[100005][3];

    static long solve(int a[], int b[], int c[], int n, int pos, int cur) {
        long ans = Integer.MIN_VALUE;

        if (pos == n) {
            return 0;
        }

        if (cur != -1 && vis[pos][cur]) {
            return dp[pos][cur];
        }
        if (cur != -1) {
            vis[pos][cur] = true;
        }

        for (int i = pos; i < n; i++) {
            if (cur != 0)
                ans = Math.max(ans, a[pos] + solve(a, b, c, n, pos + 1, 0));

            if (cur != 1)
                ans = Math.max(ans, b[pos] + solve(a, b, c, n, pos + 1, 1));

            if (cur != 2)
                ans = Math.max(ans, c[pos] + solve(a, b, c, n, pos + 1, 2));
        }
        if (cur != -1) {
            dp[pos][cur] = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        System.out.println(solve(a, b, c, n, 0, -1));
    }
}