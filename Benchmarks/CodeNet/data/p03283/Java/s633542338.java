import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] LR = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            LR[L][R]++;
        }
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int ans = 0;
            for (int j = p; j <= q; j++) {
                for (int k = j; k <= q; k++) {
                    if (LR[j][k] > 0) {
                        ans += LR[j][k];
                    }
                }
            }
            System.out.println(ans);
        }
    }
}