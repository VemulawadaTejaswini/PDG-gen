import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double ex[] = new double[t + 1];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            double rsum = 0;
            int v[] = new int[m];
            double r[] = new double[m];
            for (int j = 0; j < m; j++) {
                v[j] = sc.nextInt();
                r[j] = sc.nextDouble();
                rsum += r[j];
            }
            ex[i] = 0;
            for (int j = 0; j < m; j++) {
                ex[i] += 1.0 * v[j] * r[j] / rsum;
            }
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        int v[] = new int[q];
        double r[] = new double[q];
        double rsum = 0;
        for (int j = 0; j < q; j++) {
            v[j] = sc.nextInt();
            r[j] = sc.nextDouble();
            rsum += r[j];
        }
        ex[t] = 0;
        for (int j = 0; j < q; j++) {
            ex[t] += 1.0 * v[j] * r[j] / rsum;
        }
        boolean flag = false;
        for (int i = 0; i < t; i++) {
            if (ex[i] - ex[t] > 0.0000001) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");

    }
}