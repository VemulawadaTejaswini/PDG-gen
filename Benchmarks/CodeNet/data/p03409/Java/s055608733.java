import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Point[] red = new Point[n];
            Point[] blue = new Point[n];
            for (int i = 0; i < n; i++) {
                red[i] = new Point(in.nextInt(), in.nextInt());
            }

            for (int i = 0; i < n; i++) {
                blue[i] = new Point(in.nextInt(), in.nextInt());
            }

            Arrays.sort(red, new Comparator<Point>() {

                public int compare(Point o1, Point o2) {
                    if (o1.x == o2.x) {
                        return o2.y - o1.y;
                    }
                    return o2.x - o1.x;
                }
            });


            Arrays.sort(blue, new Comparator<Point>() {

                public int compare(Point o1, Point o2) {
                    if (o1.x == o2.x) {
                        return o2.y - o1.y;
                    }
                    return o2.x - o1.x;
                }
            });

            int cnt = 0;
            for (Point bluePoint : blue) {
                for (Point redPoint : red) {
                    if (bluePoint.x > redPoint.x &&
                            bluePoint.y > redPoint.y) {
                        if (!bluePoint.isPair && !redPoint.isPair) {
                            cnt++;
                            bluePoint.isPair = true;
                            redPoint.isPair = true;
                            break;
                        }
                    }
                }
            }

            out.print(cnt);
        }

    }

    static class Point {
        int x;
        int y;
        boolean isPair;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.isPair = false;
        }

    }
}

