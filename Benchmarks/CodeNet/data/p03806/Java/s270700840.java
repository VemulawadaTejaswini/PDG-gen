import java.util.*;

public class Main {
    private static final int INF = 114514;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();

        int map[][][] = new int[41][401][401];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j <= 400; j++) {
                Arrays.fill(map[i][j], INF);
            }
        }

        map[0][0][0] = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 0; j <= 400 - a; j++) {
                for (int k = 0; k <= 400 - b; k++) {
                    map[i + 1][j][k] = Math.min(map[i][j][k], map[i + 1][j][k]);
                    map[i + 1][j + a][k + b] = Math.min(map[i][j][k] + c, map[i + 1][j + a][k + b]);
                }
            }
        }

        int ans = INF;
        for (int i = 1; (ma * i <= 400) && (mb * i <= 400); i++) {
            ans = Math.min(ans, map[n][i * ma][i * mb]);
        }
        System.out.println(ans == INF ? -1 : ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
