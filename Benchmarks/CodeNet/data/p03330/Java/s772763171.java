import java.util.*;

public class Main {
    int map[][], cost[][];

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int c = sc.nextInt();
        cost = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        map = new int[3][c];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[(i + j) % 3][sc.nextInt() - 1]++;
            }
        }

        int ans = 1145141919;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    continue;
                }

                for (int k = 0; k < c; k++) {
                    if (j == k || k == i) {
                        continue;
                    }
                    ans = Math.min(ans, calc(c, i, j, k));
                }
            }
        }

        System.out.println(ans);
    }

    private int calc(int n, int... colors) {
        int res = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                res += map[i][j] * cost[j][colors[i]];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
