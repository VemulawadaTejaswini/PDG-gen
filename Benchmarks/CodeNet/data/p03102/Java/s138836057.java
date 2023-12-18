import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int work = 0;
            for (int j = 0; j < M; j++) {
                work += A[i][j] * B[j];
            }
            work += C;
            if (work > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
