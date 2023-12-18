import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            B[i] = sc.nextInt();
        }
        int[] A = new int[N];
        A[0] = B[0];
        A[N - 1] = B[N - 2];

        for (int i = 1; i <= N -2; i++) {
            A[i] = Math.min(B[i - 1], B[i]);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i];
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}