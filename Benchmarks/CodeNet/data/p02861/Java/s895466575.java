import java.util.*;

public class Main {

    private static Double allSum;

    public static class Point {
        public int x;
        public int y;
        public boolean isUsed;

        public Point(int x, int y, boolean isUsed) {
            this.x = x;
            this.y = y;
            this.isUsed = isUsed;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void setUseCondition(boolean cond) {
            this.isUsed = cond;
        }

        public boolean getUsedCondition() {
            return this.isUsed;
        }
    }

    public static void main(String[] args) {
        // 諸々init
        allSum = Double.parseDouble("0");
        double res = 0;

        // 入力読取＆街の座標の配列を作成
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Point[] towns = new Point[N];

        int count = 0;
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            Point point = new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1]), false);
            towns[count] = point;
            count++;
        }
        sc.close();

        // 経路パターン数(N!)の取得
        int patterns = 1;
        for (int i = N; i >= 2; i--) {
            patterns = patterns * i;
        }

        goWithRoute(towns, null, Double.parseDouble("0"));

        res = allSum / patterns;

        System.out.println(res);
    }

    public static void goWithRoute(Point[] towns, Point lastPoints, double sum) {
        boolean isDo = false;
        double originsum = sum;
        for (Point point : towns) {
            if (point.isUsed) {
                continue;
            }
            isDo = true;
            //System.out.println("【P】x: " + point.getX() + ", y: " + point.getY());
            point.setUseCondition(true);
            if (!Objects.isNull(lastPoints)) {
                //System.out.println("before sum = " + sum);
                double xDiff = lastPoints.getX() - point.getX();
                double yDiff = lastPoints.getY() - point.getY();
                double powSum = Math.pow(xDiff, 2) + Math.pow(yDiff, 2);
                double distance = Math.sqrt(powSum);
                sum += distance;
                //System.out.println("after sum = " + sum);
            }

            goWithRoute(towns, point, sum);
            sum = originsum;

            point.setUseCondition(false);
        }
        if (!isDo) {
            //System.out.println("◆◆ finish ! : value = " + sum + " ◆◆");
            allSum += sum;
        }
    }

}