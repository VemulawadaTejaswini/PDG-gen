import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            long[] x = new long[N];
            long[] y = new long[N];
            long[] z = new long[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextLong();
                y[i] = in.nextLong();
                z[i] = in.nextLong();
            }

            long[] sum = new long[N];
            long max = 0;
            for (int dx = -1; dx <= 1; dx += 2) {
                for (int dy = -1; dy <= 1; dy += 2) {
                    for (int dz = -1; dz <= 1; dz += 2) {
                        for (int i = 0; i < N; i++) {
                            sum[i] = dx * x[i] + dy * y[i] + dz * z[i];
                        }
                        Arrays.sort(sum);
                        long s = 0;
                        for (int i = 0; i < M; i++) {
                            s += sum[N - 1 - i];
                        }
                        max = Math.max(max, s);
                    }
                }
            }

            System.out.println(max);
        }
    }
}
