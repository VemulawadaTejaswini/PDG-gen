import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] C = new int[N];
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[] target = new int[M];

        for (int j = 0; j < M; ++j)
            target[j] = X;

        dfs(N, M, C, A, 0, 0, target);

        System.out.println(ans);
    }

    public static void dfs(int N, int M, int[] C, int[][] A, int count, int price, int[] target) {

        if (count == N) {
            ans = -1;
            return;
        }
        for (int i = 0; i < N; i++) {

            boolean flg = true;
            for (int j = 0; j < M; ++j) {
                if (target[j] - A[i][j] > 0) {
                    flg = false;
                }
            }

            // 足してOK
            if (!flg) {
                for (int j = 0; j < M; ++j) {
                    target[j] -= A[i][j];
                    A[i][j] = 0;
                }
                price += C[i];
                C[i] = 0;
                count++;
                dfs(N, M, C, A, count, price, target);
            } else {
                ans = Math.min(ans, price + C[i]);
            }

        }
        return;
    }
}