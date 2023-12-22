import java.util.Scanner;

public class CircumscribedCircleofaTriangle2 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] vertexStrList = scan.nextLine().split(" ");
            double[] vertexList = new double[6];
            for (int i = 0; i < 6; i++) {
                vertexList[i] = Double.parseDouble(vertexStrList[i]);
            }
            double ax = vertexList[0];
            double ay = vertexList[1];
            double bx = vertexList[2];
            double by = vertexList[3];
            double cx = vertexList[4];
            double cy = vertexList[5];
            double abDX = bx - ax;
            double abDY = by - ay;
            double acDX = cx - ax;
            double acDY = cy - ay;
            double[] in = { abDX, abDY, getB(ax, ay, bx, by), acDX, acDY, getB(ax, ay, cx, cy) };
            double[] pXY = getXY(in);
            double r = Math.sqrt(Math.pow(ax - pXY[0], 2) + Math.pow(ay - pXY[1], 2));
            System.out.println(pXY[0] + " " + pXY[1] + " " + String.format("%.3f", r));
        } catch (Exception e) {
            System.exit(0);
        }
    }

    private static double[] getXY(double[] in) {
        double deno = (in[1] * in[3] - in[0] * in[4]);
        double[] xy = new double[2];
        xy[0] = (in[1] * in[5] - in[2] * in[4]) / deno;
        xy[1] = (in[0] * in[5] - in[2] * in[3]) / (deno * -1);
        return xy;
    }

    private static double getB(double ax, double ay, double bx, double by) {
        return (Math.pow(by, 2) - Math.pow(ay, 2) + Math.pow(bx, 2) - Math.pow(ax, 2)) / 2;
    }

}