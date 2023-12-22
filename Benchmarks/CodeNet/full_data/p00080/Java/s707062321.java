import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            //            double x = n / 2;
            //            while (Math.abs(x * x * x - n) >= 0.000001 * n) {
            //                x -= (x * x * x - n) / (3 * x * x);
            //            }
            double x = n;
            while (abs(x * x * x - n) > 0.000001 * n) {
                x = sqrt(sqrt(x * n));
            }
            System.out.printf("%.6f\n", x);
        }
    }
}
