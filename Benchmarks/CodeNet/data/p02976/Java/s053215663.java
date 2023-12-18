import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        boolean[][] paths = new boolean[n][n];
        boolean[][] result = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            int a_tmp = Integer.parseInt(sc.next());
            int b_tmp = Integer.parseInt(sc.next());
            paths[a_tmp - 1][b_tmp - 1] = true;
            paths[b_tmp - 1][a_tmp - 1] = true;
        }

        if (n % 2 == 1) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < n; i += 2) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (cnt < 2 && paths[i][j]) {
                    result[i][j] = true;
                    cnt++;
                } else if (cnt == 2) {
                    break;
                }
            }
            if (cnt % 2 == 1) {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j]) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}