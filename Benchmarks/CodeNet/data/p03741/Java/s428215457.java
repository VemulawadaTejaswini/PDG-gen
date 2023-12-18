import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            long[] sum = new long[N];
            for (int i = 0; i < N; i++) {
                sum[i] = A[i] + (i - 1 >= 0 ? sum[i - 1] : 0);
            }

            int op = 0;
            int op2 = 0;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    if (sum[i] <= 0) {
                        op += 2 * (1 - sum[i]);
                    }
                    if (sum[i] >= 0) {
                        op2 += 2 * (sum[i] - -1);
                    }
                } else {
                    if (sum[i] >= 0) {
                        op += 2 * (sum[i] - -1);
                    }
                    if (sum[i] <= 0) {
                        op2 += 2 * (1 - sum[i]);
                    }
                }
            }

            System.out.println(Math.min(op, op2));
        }
    }
}
