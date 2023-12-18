
import java.util.Arrays;
import java.util.Scanner;

class Main {

    int N, M, R;
    int[] r;
    int[][] d;
    int res = Integer.MAX_VALUE;
    boolean[] used;

    public static void main(String[] args) {
        new Main().compute();
    }

    void dfs(int c, int las, int dist) {
        if (c == R) {
            if (res > dist) {
                res = dist;
            }
            return;
        }
        for (int i = 0; i < R; i++) {
            if (!used[i]) {
                used[i] = true;
                if (las == -1) {
                    dfs(c + 1, i, 0);
                } else {
                    dfs(c + 1, i, dist + d[r[las]][r[i]]);
                }
                used[i] = false;
            }
        }
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        R = sc.nextInt();
        r = new int[R];
        used = new boolean[R];
        for (int i = 0; i < R; i++) {
            r[i] = sc.nextInt() - 1;
        }
        d = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(d[i], Integer.MAX_VALUE / 9);
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            int C = sc.nextInt();
            d[A][B] = C;
            d[B][A] = C;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
                }
            }
        }
        dfs(0, -1, 0);
        System.out.println(res);
    }
}
