import java.util.Scanner;

public class Main {
    private static class Point {
        int x, y, magic;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.magic = 0;
        }

        private void setMagic(int magic) {
            this.magic = magic;
        }
    }

    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        Point a[] = new Point[h * w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[sc.nextInt() - 1] = new Point(j, i);
            }
        }

        for (int i = 1; i <= d; i++) {
            Point p1 = a[i - 1];
            for (int j = 1; i + j * d <= h * w; j++) {
                Point p2 = a[i + j * d - 1];
                p2.setMagic(p1.magic + Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y));
                p1 = p2;
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(a[r - 1].magic - a[l - 1].magic);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
