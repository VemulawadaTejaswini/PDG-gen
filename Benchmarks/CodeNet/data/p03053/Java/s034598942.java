import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] a = new boolean[h][w];

        Queue<Mass> queue = new ArrayDeque<>();
        int ans = 0;

        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                a[i][j] = s.charAt(j) == '#' ? true : false;
                if (a[i][j])
                    queue.add(new Mass(j, i, 0));
            }
        }

        int[][] b = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            Mass mass = queue.remove();
            for (int i = 0; i < b.length; i++) {
                int x = mass.x + b[i][0];
                int y = mass.y + b[i][1];
                int cnt  = mass.cnt + 1;

                if (x < 0 || x >= w || y < 0 || y >= h || a[y][x])
                    continue;

                queue.add(new Mass(x, y, cnt));
                a[y][x] = true;
                ans = Math.max(ans, cnt);
            }
        }

        System.out.print(ans);
    }

    static class Mass {
        int x;
        int y;
        int cnt;

        Mass(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}