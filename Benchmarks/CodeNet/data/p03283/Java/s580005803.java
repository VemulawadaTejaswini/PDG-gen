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
        int[][] LR = new int[M][2];
        int[][] pq = new int[Q][2];
        for (int i = 0; i < M; i++) {
            LR[i][0] = sc.nextInt();
            LR[i][1] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            pq[i][0] = sc.nextInt();
            pq[i][1] = sc.nextInt();
        }
        Arrays.sort(LR, (a, b) -> Integer.compare(a[0], b[0]));
        lavel:
        for (int i = 0; i < Q; i++) {
            int ans = 0;
            for (int j = 0; j < M; j++) {
                if (LR[j][0] >= pq[i][0]) {
                    if (LR[j][1] <= pq[i][1]) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}