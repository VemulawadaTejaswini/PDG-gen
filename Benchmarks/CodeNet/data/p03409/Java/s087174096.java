import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Point> red = new ArrayList<>();
        List<Point> blue = new ArrayList<>();

        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            red.add(new Point(a, b));
        }
        for (int i=0; i<N; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            blue.add(new Point(c, d));
        }

        System.out.println(solve(N, red, blue));

    }

    static class Point {
        public int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int solve(int N, List<Point> red, List<Point> blue) {
        int ans = 0;

        Collections.sort(red, new Comparator<Point>() {
            public int compare(Point p1, Point p2) {
                return p1.x - p2.x;
            }
        });
        Collections.sort(blue, new Comparator<Point>() {
            public int compare(Point p1, Point p2) {
                return p1.x - p2.x;
            }
        });

        for (int i=0; i<blue.size(); i++) {
            Iterator it = red.iterator();
            Point max = null;
            while (it.hasNext()) {
                Point p = (Point)it.next();
                if (p.x < blue.get(i).x && p.y < blue.get(i).y) {
//                    System.err.println(p.x + ", " + p.y + " < " + blue.get(i).x + ", " + blue.get(i).y);
                    if (max == null || max.y < p.y) {
                        max = p;
                    }

                }
            }
            if (max != null) {
                ans++;
                red.remove(max);
            }
        }

        return ans;
    }
}