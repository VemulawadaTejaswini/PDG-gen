import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] lis = new int[20][20];
        int[] p = new int[m];


        for (int i = 0; i < m; ++i) {
            lis[i][0] = sc.nextInt();
            for (int j = 1; j <= lis[i][0]; ++j) {
                lis[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; ++i) {
            p[i] = sc.nextInt();
        }


        int ans = 0;
        int lim = 1 << n;
        for (int i = 0; i < lim; ++i) {
            boolean ok = true;
            for (int j = 0; j < m; ++j) {
                int cnt = 0;
                for (int k = 1; k <= lis[j][0]; ++k) {
                    if ((i & (1 << (lis[j][k] - 1))) > 0) cnt++;
                }
                if (cnt % 2 != p[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
