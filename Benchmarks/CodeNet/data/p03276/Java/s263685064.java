import java.util.*;

public class Main {
    static int N;
    static int K;
    static PriorityQueue<Point> a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        a = new PriorityQueue<>(Comparator.comparing(Point::getX));
        for(int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            Point p;
            if (0 <= x) {
                p = new Point(x, true);
            } else {
                p = new Point(-x, false);
            }
            a.add(p);
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        ArrayList<Integer> l = new ArrayList<>();
        int count = 0;
        while (!a.isEmpty()) {
            Point p = a.poll();

            int x;
            if(p.isPlus) {
                x = p.x;
            } else {
                x = -p.x;
            }

            l.add(x);

            count++;
            if(K <= count) break;
        }

        Collections.sort(l);

        int xl = l.get(0);
        int xr = l.get(l.size() - 1);

        int pattern1 = Math.abs(xl) + Math.abs(xr - xl);
        int pattern2 = Math.abs(xr) + Math.abs(xr - xl);

        System.out.println(Math.min(pattern1, pattern2));
    }
}

class Point {
    int x;
    boolean isPlus;

    public Point(int x, boolean isPlus) {
        this.x = x;
        this.isPlus = isPlus;
    }

    public int getX() {
        return x;
    }
}