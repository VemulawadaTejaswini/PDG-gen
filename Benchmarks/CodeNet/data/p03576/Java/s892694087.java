import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {

            int N = in.nextInt();
            int K = in.nextInt();

            long[] x = new long[N];
            long[] y = new long[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            long area = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == i) {
                        continue;
                    }
                    int count = 0;
                    for (int k = 0; k < N; k++) {
                        if (isInside(x[i], y[i], x[j], y[j], x[k], y[k])) {
                            count++;
                        }
                    }
                    if (count >= K) {
                        area = Math.min(area, Math.abs(x[i] - x[j]) * Math.abs(y[i] - y[j]));
                    }
                }
            }

            System.out.println(area);
        }
    }

    private static boolean isInside(long xi, long yi, long xj, long yj, long xk, long yk) {
        if (xk < Math.min(xi, xj) || xk > Math.max(xi, xj)) {
            return false;
        }
        if (yk < Math.min(yi, yj) || yk > Math.max(yi, yj)) {
            return false;
        }
        return true;
    }
}
