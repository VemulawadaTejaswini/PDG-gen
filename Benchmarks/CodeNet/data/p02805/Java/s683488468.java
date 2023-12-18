import java.util.*;
import java.io.*;
public class Main {
    static final double phi = (1.0 + Math.sqrt(5)) / 2;
    static final double phi_1 = phi - 1;
    static final double C1 = 1000 * (1 - phi_1);
    static final double C2 = 1000 * phi_1;
    static int N;
    static int[] X, Y;
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        N = nextInt();
        X = new int[N];
        Y = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = nextInt();
            Y[i] = nextInt();
        }

        double x = calc(0, C1, C2, 1000);
        System.out.println(calc_r(x, calc_y(0, C1, C2, 1000, x)));
    }

    public static double calc(double low, double x1, double y2, double high) {
        if (y2 - x1 < 0.0000001) return x1;

        if (calc_r(x1, calc_y(0, x1, y2, 1000, x1)) < calc_r(y2, calc_y(0, x1, y2, 1000, y2))) {
            return calc(low, low + (y2 - low) * (1 - phi_1), x1, y2);
        } else {
            return calc(x1, y2, x1 + (high - x1) * (phi_1), high);
        }
    }

    public static double calc_y(double low, double y1, double y2, double high, double x) {
        if (y2 - y1 < 0.0000001) return y1;

        if (calc_r(x, y1) < calc_r(x, y2)) {
            return calc_y(low, low + (y2 - low) * (1 - phi_1), y1, y2, x);
        } else {
            return calc_y(y1, y2, y1 + (high - y1) * (phi_1), high, x);
        }
    }

    public static double calc_r(double x, double y) {
        double r = 0;
        for (int i = 0; i < N; i++) {
            double dx = x - X[i];
            double dy = y - Y[i];
            r = Math.max(r, Math.sqrt(dx * dx + dy * dy));
        }
        return r;
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }

    public static double nextDouble() throws Exception {
        return Double.parseDouble(nextString());
    }
}