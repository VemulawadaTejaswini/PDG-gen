import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        while (true) {
            if (d == 0)
                break;
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("#");
            } else {
                char[][] map = new char[n][n];
                for (int i = 0; i < n; i++) {
                    Arrays.fill(map[i], ' ');
                }
                int x = 0;
                int y = n - 1;
                int dx = 0;
                int dy = -1;
                int right = n - 1;
                int left = 0;
                int top = 0;
                int bottom = n - 1;
                while (true) {
                    if (map[y][x] == '#')
                        break;
                    int[] ddx = { 0, 1, 0, -1 };
                    int[] ddy = { 1, 0, -1, 0 };
                    int c = 0;
                    for (int i = 0; i < 4; i++) {
                        int nx = x + ddx[i];
                        int ny = y + ddy[i];
                        if (nx >= 0 && ny < n && ny >= 0 && nx < n
                                && map[ny][nx] == '#') {
                            c++;
                        }
                    }
                    if (c > 1)
                        break;
                    map[y][x] = '#';
                    int nx = x + dx;
                    int ny = y + dy;
                    if (ny < top) {
                        dy = 0;
                        dx = 1;
                        left += 2;
                        nx = x + dx;
                        ny = y + dy;
                    } else if (nx > right) {
                        dy = 1;
                        dx = 0;
                        top += 2;
                        nx = x + dx;
                        ny = y + dy;
                    } else if (ny > bottom) {
                        dx = -1;
                        dy = 0;
                        right -= 2;
                    } else if (nx < left) {
                        dx = 0;
                        dy = -1;
                        bottom -= 2;
                    }
                    x += dx;
                    y += dy;
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(map[i][j]);
                    }
                    System.out.println();
                }
            }
            d--;
            if(d!=0)System.out.println();
        }
    }
}