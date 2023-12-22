import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            double[][] points = new double[n][4];
            int bottomRightIndex = 0;
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().split(",");
                points[i][0] = Double.parseDouble(values[0]);
                points[i][1] = Double.parseDouble(values[1]);
                if (points[i][1] < points[bottomRightIndex][1]
                        || (points[i][1] == points[bottomRightIndex][1] && points[i][0] > points[bottomRightIndex][0])) {
                    bottomRightIndex = i;
                }
            }
            if (bottomRightIndex != 0) {
                double[] tmp = points[0];
                points[0] = points[bottomRightIndex];
                points[bottomRightIndex] = tmp;
            }
            points[0][3] = 1.0;
            for (int i = 1; i < n; i++) {
                double dx = points[i][0] - points[0][0];
                double dy = points[i][1] - points[0][1];
                points[i][2] = Math.hypot(dx, dy);
                points[i][3] = dx / points[i][2];
            }
            Arrays.sort(points, new Comparator<double[]>() {

                @Override
                public int compare(double[] point1, double[] point2) {
                    double d = point2[3] - point1[3];
                    if (d == 0.0) {
                        d = point1[2] - point2[2];
                    }
                    return (int) Math.signum(d);
                }
            });
            int result = 0;
            Stack<double[]> pointStack = new Stack<double[]>();
            pointStack.push(points[0]);
            pointStack.push(points[1]);
            for (int i = 2; i < n; i++) {
                double[] point3 = points[i];
                double[] point2 = pointStack.pop();
                double[] point1 = pointStack.pop();
                while (true) {
                    if (ccw(point1[0], point1[1], point2[0], point2[1],
                            point3[0], point3[1]) > 0.0) {
                        break;
                    }
                    result++;
                    point2 = point1;
                    point1 = pointStack.pop();
                }
                pointStack.push(point1);
                pointStack.push(point2);
                pointStack.push(point3);
            }
            out.println(result);
        }
    }

    private static double ccw(double x1, double y1, double x2, double y2,
            double x3, double y3) {
        return (x2 - x1) * (y3 - y2) - (x3 - x2) * (y2 - y1);
    }
}