import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int num[];
    static Lab[] colors;
    static double ans;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        num = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = i;
        }
        colors = new Lab[n + 1];
        for (int i = 1; i <= n; i++) {
            colors[i] = new Lab(sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble());
        }
        ans = 0;
        combination(n, m, 0);
        System.out.printf("%.6f\n", ans);
    }

    static void combination(int n, int r, int k) {
        if (k == r) {
            double sum = 0;
            for (int i = 1; i <= r; i++) {
                for (int j = i + 1; j <= r; j++) {
                    sum += (colors[num[i]].L - colors[num[j]].L)
                            * (colors[num[i]].L - colors[num[j]].L)
                            + (colors[num[i]].a - colors[num[j]].a)
                            * (colors[num[i]].a - colors[num[j]].a)
                            + (colors[num[i]].b - colors[num[j]].b)
                            * (colors[num[i]].b - colors[num[j]].b);
                }
            }
            ans = Math.max(ans, sum);
        } else {
            int t = num[k + 1];
            for (int i = k + 1; i <= n; i++) {
                num[k + 1] = num[i];
                num[i] = t;
                if (num[k] < num[k + 1]) {
                    combination(n, r, k + 1);
                }
                num[i] = num[k + 1];
            }
            num[k + 1] = t;
        }
    }
}

class Lab {
    double L;
    double a;
    double b;

    Lab(double L, double a, double b) {
        this.L = L;
        this.a = a;
        this.b = b;
    }
}