import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Point> mList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            mList.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        sc.close();

        mList.sort(Comparator.comparingInt(a -> a.b));

        int ans = 1;

        int point = mList.get(0).b;
        mList.remove(0);

        for (Point p : mList) {
            if (p.a < point && p.b >= point) {
                continue;
            } else {
                point = p.b;
                ans++;
            }
        }

        System.out.println(ans);
    }

    private static class Point {
        int a;
        int b;

        public Point(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}