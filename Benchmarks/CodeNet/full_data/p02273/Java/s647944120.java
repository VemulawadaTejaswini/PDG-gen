import java.io.*;

class Main {
    static int n;
    static double[][] kochCurve;
    static int i = 0;

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        kochCurve = new double[(int) Math.pow(4, n) + 1][2];

        drawKoch(0, 0, 100, 0, 1);

        kochCurve[kochCurve.length - 1] = new double[] {100, 0};

        StringBuilder sb = new StringBuilder("");
        for (int j = 0; j < kochCurve.length; j++) {
            sb.append(kochCurve[j][0]).append(" ").append(kochCurve[j][1]).append("\n");
        }
        System.out.print(sb.toString());
    }

    public static void drawKoch(double p1x, double p1y, double p2x, double p2y, int count) {
        double sx = (p2x - p1x) / 3 + p1x;
        double sy = (p2y - p1y) / 3 + p1y;
        double tx = p2x - (p2x - p1x) / 3;
        double ty = p2y - (p2y - p1y) / 3;

        double ux = ((tx - sx) - Math.sqrt(3) * (ty - sy)) / 2 + sx;
        double uy = ((ty - sy) + Math.sqrt(3) * (tx - sx)) / 2 + sy;

        if (count == n) {
            kochCurve[i++] = new double[] {p1x, p1y};
            kochCurve[i++] = new double[] {sx, sy};
            kochCurve[i++] = new double[] {ux, uy};
            kochCurve[i++] = new double[] {tx, ty};
            return;
        }
        count++;
        drawKoch(p1x, p1y, sx, sy, count);
        drawKoch(sx, sy, ux, uy, count);
        drawKoch(ux, uy, tx, ty, count);
        drawKoch(tx, ty, p2x, p2y, count);
    }
}