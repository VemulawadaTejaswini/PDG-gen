import java.util.Arrays;
import java.util.Scanner;

/**
 * Gluttony
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            sc.nextLine();

            long[] A = new long[N];
            long[] F = new long[N];

            String[] a = sc.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(a[i]);
            }
            a = sc.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                F[i] = Long.parseLong(a[i]);
            }

            //long sum = Arrays.stream(A).sum();
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
            }
            if (sum <= K) {
                System.out.println(0);
                return;
            }

            Arrays.sort(A);
            Arrays.sort(F);

            long min = 0;
            long max = 0;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, A[i] * F[N - 1 - i]);
            }

            while (max - min > 1) {
                long mid = (min + max) / 2;

                long need = 0;
                for (int i = 0; i < N; i++) {
                    need += Math.max(0, A[i] - mid / F[N - 1 - i]);
                }

                if (need > K) {
                    min = mid;
                } else {
                    max = mid;
                }
            }

            System.out.println(max);
        }

    }

}
