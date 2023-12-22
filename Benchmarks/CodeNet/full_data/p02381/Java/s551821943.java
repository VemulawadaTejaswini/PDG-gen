import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while(true) {
            int n = Integer.parseInt(sc.next());
            if (n == 0) {
                break;
            }
            double[] s = new double[n];
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                s[i] = Double.parseDouble(sc.next());
                sum += s[i];
            }

            double m = sum / n;
            double v = 0.0;
            for (int i = 0; i < n; i++) {
                v += (s[i] - m) * (s[i] - m);
            }
            v /= n;
            double a = Math.sqrt(v);
            out.printf("%.10f\n", a);
        }
        out.flush();
    }
}
