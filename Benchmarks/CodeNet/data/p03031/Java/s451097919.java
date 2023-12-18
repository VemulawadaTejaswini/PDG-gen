import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int[] On;
    public static int n;
    public static int m;
    public static int k[];
    public static int s[][];
    public static int p[];

    public static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = new int[m];
        On = new int[n];
        Arrays.fill(On, 0);
        s = new int[m][n];
        for (int i = 0; i < m; i++) {
            k[i] = sc.nextInt();
            for (int j = 0; j < k[i]; j++) {
                int tmp = sc.nextInt();
                s[i][tmp - 1] = 1;
            }
        }
        p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        // 全探索する
        ans = 0;
        Solve(-1);
        System.out.println(ans);
        sc.close();
    }

    public static void Solve(int pos) {
        if (pos == n - 1) {
            if (Check()) {
                ans++;
            }
            return;
        }
        On[pos + 1] = 1;
        Solve(pos + 1);
        On[pos + 1] = 0;
        Solve(pos + 1);
    }

    public static boolean Check() {
        for (int i = 0; i < m; i++) {
            int wa = 0;
            for (int j = 0; j < n; j++) {
                if (s[i][j] == 1 && On[j] == 1) {
                    wa++;
                }
            }
            if (wa % 2 != p[i]) {
                return false;
            }
        }
        return true;
    }
}