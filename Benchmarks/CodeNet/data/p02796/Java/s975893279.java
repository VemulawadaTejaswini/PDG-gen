
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "[" + this.x + ", " + this.y + "]";
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(points, (p1, p2) -> p1.y - p2.y);

        int count = 0;
        int currentEnd = 0;
        for (Point point : points) {
            if (point.x > currentEnd) {
                currentEnd = point.y;
                count++;
            }
        }
        System.out.println(count);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
