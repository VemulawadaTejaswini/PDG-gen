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
        long[] A1 = new long[N];
        long ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            ans += A[i] / 2;
            A[i] = A[i] % 2;
            A1[i] = A[i];
        }
        long c1 = 0;
        for (int i = 1; i < N; i++) {
            if (A1[i] == A1[i - 1] && A1[i] == 1) {
                A1[i] = 0;
                c1++;
            }
        }
        int c2 = 0;
        for (int i = N - 2; i >= 0; i--) {
            if (A[i] == A[i + 1] && A[i] == 1) {
                A[i] = 0;
                c2++;
            }
        }
        System.out.println(c1 > c2 ? c1 + ans : c2 + ans);
    }
}
