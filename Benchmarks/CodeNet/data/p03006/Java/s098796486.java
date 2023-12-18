import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashSet<String> cache = new HashSet<>();
        List<Point> list = new ArrayList<Point>();
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            p.x = scan.nextLong();
            p.y = scan.nextLong();
            list.add(p);
            cache.add(p.x + ":" + p.y);
        }
        list.sort(new PointComparator());
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                Point p1 = list.get(i);
                Point p2 = list.get(j);
                long dx = p2.x - p1.x;
                long dy = p2.y - p1.y;
                int temp = N;
                for (int k = 0; k < N; k++) {
                    Point current = list.get(k);
                    if (cache.contains((current.x - dx) + ":" + (current.y - dy))) {
                        temp -= 1;
                        continue;
                    }
                }
                answer = Math.min(answer, temp);
            }
        }
        System.out.println(answer);
    }
    class Point {
        long x;
        long y;
    }
    class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.x == o2.x) {
                return Long.compare(o1.y, o2.y);
            }
            return Long.compare(o1.x, o2.x);
        }
    }
}