import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    int n;
    int m;
    int x;
    int[][] a;
    int[] c;
    boolean[] isBuy;

    private void run() {
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();

        a = new int[n][m];
        c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();

            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        isBuy = new boolean[n+1];
        int ans = dp(0);
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    // i番目の本を買うもしくは買わない場合の条件を満たす最小金額を返す
    private int dp(int i) {
        // 最後まで買うか買わないかを決めたら理解度が目標に達したかをチェック
        if (i == n) {
            int[] understand = new int[m];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (!isBuy[j]) continue; // 買わない本は無視
                sum += c[j];
                for (int k = 0; k < m; k++) {
                    understand[k] += a[j][k];
                }
            }

            for (int u : understand) {
                // 理解が足りていない言語があったらNG
                if (u < x) return Integer.MAX_VALUE;
            }
            // 全部達していたらその合計金額を返す
            return sum;
        }

        // i番目の教科書を買う場合
        isBuy[i] = true;
        int costa = dp(i+1);

        // i番目の教科書を買わない場合
        isBuy[i] = false;
        int costb = dp(i+1);

        return Math.min(costa, costb);
    }
}

