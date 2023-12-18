import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int INF = Integer.MAX_VALUE / 2;

    void solve() {
        int N = sc.nextInt();

        int[][] mat = new int[N][N];
        boolean all_dot = true;
        for (int i = 0; i < N; ++i) {
            String line = sc.next();
            for (int j = 0; j < N; ++j) {
                if (line.charAt(j) == '#') {
                    mat[i][j] = 1;
                    all_dot = false;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        if (all_dot) {
            System.out.println(-1);
            return;
        }

        int not_filled_column = N; // 埋まっていない列
        for (int i = 0; i < N; ++i) {
            boolean flag = true;
            for (int j = 0; j < N; ++j) {
                if (mat[j][i] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                not_filled_column--;
            }
        }

        int ans = INF;
        for (int i = 0; i < N; ++i) {
            boolean all_dots_column_i = true;
            for (int j = 0; j < N; ++j) {
                if (mat[j][i] == 1) all_dots_column_i = false;
            }

            int dots = 0;
            for (int j = 0; j < N; ++j) {
                if (mat[i][j] == 0) {
                    dots++;
                }
            }
            int cand = dots + not_filled_column;
            if (all_dots_column_i) cand++;
            if (ans > cand) {
                ans = cand;
            }

        }

        if (ans == INF) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);


    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
