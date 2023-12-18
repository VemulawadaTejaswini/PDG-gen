
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

//    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Point> redSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            redSet.add(new Point(a,b));
        }
        List<Point> redList = new LinkedList<>(redSet);

        Set<Point> blueSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            blueSet.add(new Point(a,b));
        }
        List<Point> blueList = new LinkedList<>(blueSet);
        
        int ans = calc(redList, blueList);
        System.out.println(ans);

        sc.close();
    }

    static int calc(List<Point> redList, List<Point> blueList) {
        if (redList.isEmpty()) return 0;
        int[] result = new int[blueList.size()+1];
//        int result1 = 0;
//        int result2 = 0;
        Point redPoint = redList.remove(0);
        for (int i = 0; i < blueList.size(); i++) {
            if (redPoint.isGood(blueList.get(i))) {
                List<Point> blueList2 = new ArrayList<>(blueList);
                blueList2.remove(i);
                result[i] = 1 + calc(redList, blueList2);
            }
        }
        result[blueList.size()] = calc(redList, blueList);

        for (int i = 1; i <= blueList.size(); i++) {
            if (result[0] < result[i]) result[0] = result[i];
        }

        return result[0];
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            return x - o.x;
        }

        boolean isGood(Point o) {
            return x < o.x && y < o.y;
        }
    }

}
