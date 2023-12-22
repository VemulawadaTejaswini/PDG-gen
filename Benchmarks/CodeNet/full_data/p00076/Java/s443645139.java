import java.util.Scanner;

public class Main {
    static final int N = 1000;

    public static void main(String... args) {
        double[] x = new double[N + 1];
        double[] y = new double[N + 1];
        x[0] = 1.0;
        y[0] = 0.0;
        for (int i = 1; i <= N; i++) {
            double r = Math.sqrt((double) i);
            x[i] = x[i - 1] - (y[i - 1] / r);
            y[i] = y[i - 1] + (x[i - 1] / r);
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            int k = sc.nextInt();
            if (k <= 0) break;
            System.out.println(String.format("%.2f\n%.2f", x[k - 1], y[k - 1]));
        }
    }
}