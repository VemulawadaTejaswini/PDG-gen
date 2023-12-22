import java.math.BigDecimal;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int dataset = sc.nextInt();

            for (int i = 1; i <= dataset; i++) {

                double ax = sc.nextDouble();
                double ay = sc.nextDouble();
                double bx = sc.nextDouble();
                double by = sc.nextDouble();
                double cx = sc.nextDouble();
                double cy = sc.nextDouble();

                double[] dxy = calcCircumcenter(ax, ay, bx, by, cx, cy);
                double dr = calcRadius(dxy, ax, ay);

                BigDecimal[] pxpy = {new BigDecimal(String.valueOf(dxy[0])),
                        new BigDecimal(String.valueOf(dxy[0]))};
                BigDecimal r = new BigDecimal(String.valueOf(dr));

                System.out.println(pxpy[0]
                        .setScale(BigDecimal.ROUND_HALF_UP, 4)
                        + " "
                        + pxpy[1].setScale(BigDecimal.ROUND_HALF_UP, 4)
                        + " "
                        + r.setScale(BigDecimal.ROUND_HALF_UP, 4));
            }

        } finally {
            sc.close();
        }
    }

    // 外心
    public static double[] calcCircumcenter(double ax, double ay, double bx,
            double by, double cx, double cy) {

        // AB
        double[] abmp = calcMidpoint(ax, ay, bx, by);
        double abm = calcSlope(ax, ay, bx, by);

        // BC
        double[] bcmp = calcMidpoint(bx, by, cx, cy);
        double bcm = calcSlope(bx, by, cx, cy); //infinity

        double x = ((abm * abmp[0] + abmp[1]) - (bcm * bcmp[0] + bcmp[1]));
        double y = abm * x - abm * abmp[0] + abmp[1];

        double[] xy = {x, y};
        return xy;

    }

    // 半径
    public static double calcRadius(double[] pxpy, double ax, double ay) {

        double r = Math.sqrt(Math.pow(pxpy[0] - ax, 2.0)
                + Math.pow(pxpy[1] - ay, 2.0));

        return r;
    }

    // 中点
    public static double[] calcMidpoint(double x1, double y1, double x2,
            double y2) {

        double[] xy = {(x1 + x2) / 2.0, (y1 + y2) / 2.0};

        return xy;
    }

    // 傾き
    public static double calcSlope(double x1, double y1, double x2, double y2) {

        double m = Math.round(y2 - y1) / Math.round(x2 - x1);

        return m;
    }
}