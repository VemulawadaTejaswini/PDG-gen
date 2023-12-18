
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Point> redList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            redList.add(new Point(a,b));
        }

        List<Point> blueList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            blueList.add(new Point(a,b));
        }

        int ans = calc(redList, blueList);
        System.out.println(ans);

        sc.close();
    }

    static int calc(List<Point> redList, List<Point> blueList) {
//        System.out.println(redList);
        if (redList.isEmpty()) return 0;
        int[] result = new int[blueList.size()+1];

        Point redPoint = redList.remove(redList.size()-1);
        for (int i = 0; i < blueList.size(); i++) {
            if (redPoint.isGood(blueList.get(i))) {
                List<Point> blueList2 = new ArrayList<>(blueList);
                blueList2.remove(i);
//                Point bluePoint = blueList2.remove(i);
//                System.out.println("[IN ]red:" + redPoint + " / blue:" + bluePoint);
                result[i] = 1 + calc(new ArrayList<>(redList), blueList2);
//                System.out.println("[OUT]red:" + redPoint + " / blue:" + bluePoint + ", result:" + result[i]);
            }
        }
//        result[blueList.size()] = calc(new ArrayList<>(redList), new ArrayList<>(blueList));
        result[blueList.size()] = calc(redList, blueList);

        int max = 0;
        for (int i = 0; i <= blueList.size(); i++) {
            if (max < result[i]) max = result[i];
        }

        return max;
    }

    static class Point {
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
    }

}
