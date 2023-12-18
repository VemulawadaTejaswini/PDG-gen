import java.util.Scanner;

class Main {
    static final int INF = 1_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[][] = new int[500][500];
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                dp[i][j] = INF;
            }

        }
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            dp[a[i]][b[i]] = c[i];
        }
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                for (int k = 0; k < n; k++) {
                    if (i - a[k] >= 0 && j - b[k] >= 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - a[k]][j - b[k]] + c[k]);
                    }
                }
            }
        }

        int i = 1;
        long ans = INF;
        while (true) {
            if (ma * i >= 500 || mb * i >= 500) {
                break;
            }
            ans = Math.min(dp[ma * i][mb * i], ans);
            i++;
        }
        if (ans == INF) {
            ans = -1;
        }
        System.out.println(ans);

        sc.close();
    }
}
