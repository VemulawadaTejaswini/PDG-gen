import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            double[] x = new double[100];
            double[] y = new double[100];
            double[] px = new double[10000];
            double[] py = new double[10000];
            for (int i = 0; i < n; i++) {
                String[] s = sc.next().split(",");
                x[i] = Double.parseDouble(s[0]);
                y[i] = Double.parseDouble(s[1]);
            }
            int now = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) < 4.0000001) {
                        double d = sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
                        double mx = (x[i] + x[j]) / 2;
                        double my = (y[i] + y[j]) / 2;
                        double s = sqrt(1 - d * d / 4);
                        double theta = atan((y[i] - y[j]) / (x[i] - x[j]));
                        px[now] = mx - sin(theta) * s;
                        py[now++] = my + cos(theta) * s;
                        px[now] = mx + sin(theta) * s;
                        py[now++] = my - cos(theta) * s;
                    }
                }
            }
            int ret = 1;
            for (int i = 0; i < now; i++) {
                int k = 0;
                for (int j = 0; j < n; j++)
                    if ((px[i] - x[j]) * (px[i] - x[j]) + (py[i] - y[j]) * (py[i] - y[j]) < 1.0000001)
                        k++;
                ret = max(ret, k);
            }
            System.out.println(ret);
        }
    }
}
