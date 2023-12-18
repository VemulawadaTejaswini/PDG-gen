import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int a[][] = new int[h][w];
        Point[] pos = new Point[h * w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
                Point p = new Point(i + 1, j + 1);
                pos[a[i][j] - 1] = p;
            }
        }
        int q = sc.nextInt();
        int le[] = new int[q];
        int ri[] = new int[q];

        for (int i = 0; i < q; i++) {
            le[i] = sc.nextInt();
            ri[i] = sc.nextInt();
        }
        if (d == 1) {
            // tokenは1からその数字までに行くのに使う魔力
            int[] token = new int[h * w];
            token[0] = 0;
            for (int i = 1; i < h * w; i++) {
                int sax = Math.abs(pos[i].x - pos[i - 1].x);
                int say = Math.abs(pos[i].y - pos[i - 1].y);
                token[i] = token[i - 1] + sax + say;
            }
            for (int i = 0; i < q; i++) {
                int ans = token[ri[i]] - token[le[i]];
                System.out.println(ans);
                return;
            }
        }
        for (int i = 0; i < q; i++) {
            long ans = 0;
            for (int j = le[i]; j < ri[i]; j += d) {
                long sax = Math.abs(pos[j + d - 1].x - pos[j - 1].x);
                long say = Math.abs(pos[j + d - 1].y - pos[j - 1].y);
                ans += sax;
                ans += say;

            }
            System.out.println(ans);
        }
    }
}

class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}