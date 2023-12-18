import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] A = new long[N + 2];
            for (int i = 0; i < N; i++) {
                A[i + 1] = in.nextInt();
            }
            long sum = 0;
            for (int i = 1; i < N + 2; i++) {
                sum += Math.abs(A[i] - A[i - 1]);
            }
            for (int i = 1; i <= N; i++) {
                long before = Math.abs(A[i + 1] - A[i]) + Math.abs(A[i] - A[i - 1]);
                long after = Math.abs(A[i + 1] - A[i - 1]);
                System.out.println(sum - before + after);
            }

        }
    }
}
