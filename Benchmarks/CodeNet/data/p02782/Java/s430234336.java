
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    private static int r1;
    private static int r2;
    private static int c1;
    private static int c2;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        sc.close();

        solve();
    }

    private static int[][] map;

    private static void solve() {
        map = new int[r2 + 1][c2 + 1];
        int ans = 0;

        for (int r = 0; r <= r2; r++) {
            for (int c = 0; c <= c2; c++) {
                if (r == 0 && c == 0) {
                    map[0][0] = 1;
                } else if (r == 0) {
                    map[0][c] = 1;
                } else if (c == 0) {
                    map[r][0] = 1;
                } else {
                    map[r][c] = sumIikanzi(map[r][c - 1], map[r - 1][c]);
                }

                if (r >= r1 && c >= c1) {
                    ans = sumIikanzi(ans, map[r][c]);
                }
            }
        }

        System.out.println(ans);
    }

    private static int sumIikanzi(int a, int b) {
        return (a + b) % 1000000007;
    }

}
