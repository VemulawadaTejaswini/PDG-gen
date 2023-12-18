import java.util.*;

public class Main {
    int data[][], k2;

    private class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        k2 = 2 * k;
        Point p[] = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() % k2;
            int y = sc.nextInt() % k2;
            if (!sc.next().equals("B")) {
                y = (y + k) % k2;
            }
            p[i] = new Point(x, y);
        }

        data = new int[k2][k2];
        for (int i = 0; i < n; i++) {
            add(-p[i].x, -p[i].y, 1);
            add(k - p[i].x, k - p[i].y, 1);
            add(-p[i].x, k - p[i].y, -1);
            add(k - p[i].x, -p[i].y, -1);
            add(k - p[i].x, k - p[i].y, 1);
            add(k2 - p[i].x, k2 - p[i].y, 1);
            add(k - p[i].x, k2 - p[i].y, -1);
            add(k2 - p[i].x, k - p[i].y, -1);
        }

        for (int i = 0; i < k2; i++) {
            for (int j = 1; j < k2; j++) {
                data[i][j] += data[i][j - 1];
            }
        }

        int ans = 0;
        for (int i = 0; i < k2; i++) {
            for (int j = 1; j < k2; j++) {
                data[j][i] += data[j - 1][i];
                ans = Math.max(ans, data[j][i]);
            }
        }
        System.out.println(ans);
    }

    private void add(int x, int y, int n) {
        if (x >= 0 && x < k2) {
            if (!(y >= 0 && y < k2)) {
                data[0][x] += n;
            }
            data[(k2 + y) % k2][x] += n;
        } else if (x < 0) {
            if (y >= 0 && y < k2) {
                data[y][0] += n;
                data[y][k2 + x] += n;
            } else if (y < 0) {
                data[0][0] += n;
                data[0][k2 + x] += n;
                data[k2 + y][0] += n;
                data[k2 + y][k2 + x] += n;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
