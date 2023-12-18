import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] A = new long[N];
            long[] B = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
                A[i] -= B[i];
            }
            Arrays.sort(A);

            long sum = 0;
            for (int r = N - 1; r >= N / 2; r--) {
                sum += A[r];
            }

            System.out.println(sum);
        }
    }
}
