import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 999999999;
        for (int i = 0; i < N; i++) {
            if (N <= K + (K - 1) * (i - 1)) {
                ans = Math.min(ans, i);
            }
        }
        System.out.println(ans);
    }
}
