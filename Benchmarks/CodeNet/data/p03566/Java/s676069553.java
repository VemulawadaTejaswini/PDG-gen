import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().start();
    }

    void start() throws Exception {
        start(new Scanner(System.in));
    }

    double sum(double[] t, int offset) {
        double ret = 0;
        for (int i = offset; i < t.length; ++i) {
            ret += t[i];
        }
        return ret;
    }

    void start(Scanner sc) throws Exception{
        int n = sc.nextInt();
        double[] t = new double[n];
        double[] v = new double[n + 1];
        for (int i = 0; i < n; ++i) {
            t[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; ++i) {
            v[i] = sc.nextDouble();
        }

        double sum = 0;
        double cv = 0;
        for (int i = 0; i < n; ++i) {
            if (v[i] <= v[i + 1]) {
                if (t[i] <= v[i] - cv) {
                    double nv = cv + t[i];
                    double max = sum(t, i + 1);
                    if (nv > max) {
                        nv = max;
                    }
                    sum += Math.pow(t[i], 2);
                    sum += t[i] * (nv - cv) / 2;
                    cv = nv;
                } else {
                    double nv = v[i];
                    double max = sum(t, i + 1);
                    if (nv > max) {
                        nv = max;
                    }
                    sum += Math.pow((nv - cv), 2) / 2;
                    sum += Math.pow(t[i] - (nv - cv), 2);
                    sum += Math.pow(t[i], 2);
                    cv = nv;
                }
            } else {
                double max = sum(t, i + 1);
                double nv;
                if (v[i + 1] > max) {
                    nv = max;
                } else {
                    nv = v[i + 1];
                }

                if ((v[i] - v[i + 1]) + (v[i] - cv) <= t[i]) {
                    sum += Math.pow(v[i] - cv, 2) / 2 + cv * (v[i] - cv);
                    sum += Math.pow(v[i] - v[i + 1], 2) / 2 + (v[i] - v[i + 1]) * v[i + 1];
                    sum += (t[i] - (v[i] - cv) - (v[i] - v[i + 1])) * v[i];
                }
                else {
                    double vx = (t[i] + cv + v[i + 1]);
                    sum += Math.pow(vx - cv, 2) / 2;
                    sum += cv + (vx - cv);
                    sum += Math.pow(t[i + 1] - (vx - cv), 2) / 2;
                    sum += v[i + 1] * (t[i] - (vx - cv));
                }
                cv = nv;
            }
        }
        System.out.println(sum);
    }
}
