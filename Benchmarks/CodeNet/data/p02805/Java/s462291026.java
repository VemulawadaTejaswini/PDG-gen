
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        double[] x = new double[N];
        double[] y = new double[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextDouble();
            y[i] = scan.nextDouble();
        }
        if (N == 2) {
            System.out.printf("%.9f\n", distance(x[0],y[0],x[1],y[1])/2);
            return;
        }
        double answer = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    double[] center = null;
                    if (is_line(x[i],y[i],x[j],y[j],x[k],y[k])) {
                        continue;
                    }
                    center = center_distance_tri(x[i],y[i], x[j],y[j], x[k], y[k]);
                    double max_distance = 0;
                    for (int p = 0; p < N; p++) {
                        max_distance = Math.max(max_distance, distance(center[0],center[1], x[p], y[p]));
                    }
                    answer = Math.min(answer, max_distance);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                double[] center = new double[2];
                center[0] = (x[i]+x[j])/2;
                center[1] = (y[i]+y[j])/2;
                double max_distance = 0;
                for (int p = 0; p < N; p++) {
                    max_distance = Math.max(max_distance, distance(center[0],center[1], x[p], y[p]));
                }
                answer = Math.min(answer, max_distance);
            }
        }
        System.out.printf("%.9f\n", answer);
    }
    private boolean is_line(double x1, double y1, double x2, double y2, double x3, double y3) {
        double dx1 = x2 - x1;
        double dy1 = y2 - y1;
        double dx2 = x3 - x1;
        double dy2 = y3 - y1;
        return dx1 * dy2 == dx2 * dy1;
    }
    private double[] center_distance_tri(double a, double b, double c, double d, double e, double f) {
        double py = ((e-a) * (a*a + b*b - c*c - d*d) - (c-a)*(a*a + b*b - e*e - f*f))/(2*(e-a)*(b-d)-2*(c-a)*(b-f));
        double px = 0;
        if (c-a == 0) {
            px = (2*(b-d)*py - a*a - b*b + c*c + d*d) / (2*(e-a));
        } else {
            px = (2*(b-f)*py - a*a - b*b + e*e + f*f) / (2*(c-a));
        }
        double[] p = new double[2];
        p[0] = px;
        p[1] = py;
        return p;
    }
    private double distance(double x1, double y1, double x2, double y2) {
        double z = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        return Math.sqrt(z);
    }
}
