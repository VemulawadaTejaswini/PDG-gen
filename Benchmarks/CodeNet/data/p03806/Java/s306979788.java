import java.util.*;

public class Main {
    private static final int INF = 114514;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();

        int map[][] = new int[n * ma + 1][n * mb + 1];
        for (int i = 0; i <= n * ma; i++) {
            Arrays.fill(map[i], INF);
        }

        map[0][0] = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = a; j <= n * ma; j++) {
                for (int k = b; k <= n * mb; k++) {
                    map[j][k] = Math.min(map[j][k], map[j - a][k - b] + c);
                }
            }
        }

        int ans = INF;
        for (int i = 1; i <= n; i++) {
            ans = Math.min(ans, map[i * ma][i * mb]);
        }
        System.out.println(ans == INF ? -1 : ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
