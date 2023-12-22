import java.util.Scanner;

public class Main {
    final double pi = (1 << 2)
            * (Math.cbrt(1. / 0.015625) * Math.atan(0.2) - Math.atan(1. / 239));
    final double EPS = 1.0e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            double max = 0;
            for (int i = 0; i < (1 << n); i++) {
                if (Integer.bitCount(i) == 6) {
                    int idx = 0;
                    int[] ns = new int[6];
                    for (int j = 0; j < n; j++) {
                        if (((i >> j) & 1) == 1) {
                            ns[idx++] = a[j];
                        }
                    }
                    for (int j = 0; j < 6; j++) {
                        for (int k = 0; k < 6; k++) {
                            if (j == k)
                                continue;
                            for (int p = 0; p < 6; p++) {
                                if (k == p || j == p)
                                    continue;
                                for (int q = 0; q < 6; q++) {
                                    if (k == q || j == q || p == q)
                                        continue;
                                    for (int r = 0; r < 6; r++) {
                                        if (k == r || j == r || p == r
                                                || q == r)
                                            continue;
                                        for (int s = 0; s < 6; s++) {
                                            if (k == s || j == s || p == s
                                                    || q == s || r == s)
                                                continue;
                                            int b = ns[j];
                                            int c = ns[k];
                                            int d = ns[p];
                                            int e = ns[q];
                                            int f = ns[r];
                                            int g = ns[s];
                                            double alpha = (b * b + g * g)
                                                    * (-b * b * g * g + d * d
                                                            * e * e + c * c * f
                                                            * f)
                                                    + (d * d + e * e)
                                                    * (b * b * g * g - d * d
                                                            * e * e + c * c * f
                                                            * f)
                                                    + (c * c + f * f)
                                                    * (b * b * g * g + d * d
                                                            * e * e - c * c * f
                                                            * f);
                                            double beta = (b * b * d * d * f * f)
                                                    + (d * d * c * c * g * g)
                                                    + (b * b * c * c * e * e)
                                                    + (g * g * e * e * f * f);
                                             if (Math.abs(c - e) < b
                                             && b < c + e
                                             && Math.abs(d - g) < c
                                             && c < d + g
                                             && Math.abs(f - g) < e
                                             && e < f + g
                                             && Math.abs(f - d) < b
                                             && b < f + d && alpha-beta>0) {

                                                double v = Math.sqrt(alpha
                                                        - beta) / 12;
                                                max = Math.max(max, v);
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.printf("%.8f\n", max);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}