
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static class Point {
        int x;
        int y;
        float dist = 0;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }
        boolean canFriend(Point blue) {
            return this.x < blue.x && this.y < blue.y;
        }
    }
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        int n  = sc.nextInt();

        List<Point> ab = new ArrayList<>();
        List<Point> cd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ab.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        for (int i = 0; i < n; i++) {
            cd.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        ab.sort((o1, o2) -> {return (int)(o2.dist - o1.dist); });
        cd.sort((o1, o2) -> {return (int)(o2.dist - o1.dist); });

        int friends = 0;
        for (int i = 0; i < n; i++) {
            Point red = ab.get(i);
            for (int j = cd.size() - 1; j >= 0 ; --j) {
                Point blue = cd.get(j);
                if (red.canFriend(blue)) {
                    cd.remove(j);
                    ++friends;
                    break;
                }
            }
        }

        System.out.println(friends);
    }
}
