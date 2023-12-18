import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    int[][] map;
    int N;

    private void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[2][N];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(rec(0, 0, 0));
    }

    int rec(int x, int y, int sum) {
        if (x < 0 || N <= x || y < 0 || 2 <= y) {
            return 0;
        }

        sum += map[y][x];

        if (x == N - 1 && y == 1) {
            return sum;
        }
        int res = 0;

        res = Math.max(rec(x + 1, y, sum), rec(x, y + 1, sum));
        return res;
    }
}
