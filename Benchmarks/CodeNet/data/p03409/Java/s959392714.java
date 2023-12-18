
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//        printTime("start");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Point> redSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            redSet.add(new Point2(a,b));
        }
//        System.out.println(redSet);

        Set<Point> blueSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            blueSet.add(new Point(a,b));
        }
//        System.out.println(blueSet);

        int ans = 0;
        for (Point red: redSet) {
            for (Point blue: blueSet) {
                if (red.isGood(blue)) {
                    ans++;
                    blueSet.remove(blue);
//                    System.out.println("" + red + blue);
                    break;
                }
            }
        }
       System.out.println(ans);

        sc.close();
//        printTime("end");
    }


    static class Point implements Comparable<Point> {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isGood(Point o) {
            return ((x < o.x) && (y < o.y));
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }

        @Override
        public int compareTo(Point o) {
            return x * y - o.x * o.y;
        }
    }

    static class Point2 extends Point {
        Point2(int x, int y) {
            super(x, y);
        }
        @Override
        public int compareTo(Point o) {
            return - super.compareTo(o);
        }
    }

    static void printTime(String str){
        long now = System.currentTimeMillis();
        System.out.println(String.format("[%tH:%tM:%tS:%tL]%s", now, now, now, now, str));
    }
}
