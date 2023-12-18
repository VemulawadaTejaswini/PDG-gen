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
        ArrayList<int[]> result = new ArrayList<int[]>();
        for (int i = 0; i < m; i++) {
            int a_tmp = Integer.parseInt(sc.next());
            int b_tmp = Integer.parseInt(sc.next());
            paths[a_tmp - 1][b_tmp - 1] = true;
            paths[b_tmp - 1][a_tmp - 1] = true;
        }

        for (int i = 0; i < n; i += 2) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (cnt < 2 && paths[i][j]) {
                    int[] set = { i, j };
                    result.add(set);
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

        for (int[] set : result) {
            System.out.println((set[0] + 1) + " " + (set[1] + 1));
        }
    }
}