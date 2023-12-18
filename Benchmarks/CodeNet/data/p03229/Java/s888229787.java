import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long ans = 0;
        Arrays.sort(A);
        if (N % 2 == 0) {
            for (int i = N / 2; i < N; i++) {
                ans += 2 * A[i];
            }
            for (int i = 0; i < (N / 2); i++) {
                ans -= 2 * A[i];
            }
            ans -= A[N / 2];
            ans += A[N / 2 - 1];
        } else {
            for (int i = N / 2; i < N; i++) {
                ans += 2 * A[i];
            }
            for (int i = 0; i < N / 2; i++) {
                ans -= 2 * A[i];
            }
            ans -= A[N / 2];
            ans -= A[N / 2 + 1];
            long ans2 = 0;
            for (int i = N / 2 + 1; i < N; i++) {
                ans2 += 2 * A[i];
            }
            for (int i = 0; i < (N / 2) + 1; i++) {
                ans2 -= 2 * A[i];
            }
            ans2 += A[N / 2];
            ans2 += A[N / 2 - 1];
            ans = Math.max(ans, ans2);
        }
        System.out.println(ans);
    }
}
