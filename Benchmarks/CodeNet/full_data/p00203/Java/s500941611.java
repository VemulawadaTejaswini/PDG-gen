import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[][] map;
    int X;
    int Y;
    int[][] dp;
    int[] dx = { -1, 0, 1 };
    int[] dy = { 1, 1, 1 };

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            X = sc.nextInt();
            Y = sc.nextInt();
            if ((X | Y) == 0)
                break;
            map = new int[Y + 2][X + 2];
            dp = new int[Y + 2][X + 2];
            for (int i = 0; i <= Y; i++) {
                map[i][0] = 1;
                map[i][X + 1] = 1;
            }
            for (int i = 1; i <= Y; i++) {
                for (int j = 1; j <= X; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for (int i = 1; i <= X; i++) {
                for (int j = 0; j <= Y + 1; j++) {
                    Arrays.fill(dp[j], -1);
                }
                ans += slove(i, 1);
            }
            System.out.println(ans);
        }
    }

    int slove(int x, int y) {
        if (dp[y][x] > 0) {
            return dp[y][x];
        } else {
            int res = 0;
            if (map[y][x] == 1) {
                res = 0;
            } else if (y >= Y) {
                return 1;
            } else if (map[y][x] == 2) {
                res = slove(x, y + 2);
            } else {
                for (int i = 0; i < 3; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (!(map[ny][nx] == 2 && x != nx))
                        res += slove(nx, ny);
                }
            }
            return dp[y][x] = res;
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}