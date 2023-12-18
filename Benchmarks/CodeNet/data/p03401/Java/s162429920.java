import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int pos = 0;
            int ans = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                ans += Math.abs(pos - A[j]);
                pos = A[j];
            }
            ans += Math.abs(pos);
            System.out.println(ans);
        }
    }
}