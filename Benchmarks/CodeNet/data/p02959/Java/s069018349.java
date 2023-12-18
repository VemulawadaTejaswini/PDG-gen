import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N + 1];
            for (int i = 0; i < N + 1; i++) {
                A[i] = in.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = in.nextInt();
            }

            long count = 0;
            for (int i = 0; i < N; i++) {
                int min = Math.min(A[i], B[i]);
                A[i] -= min;
                B[i] -= min;
                count += min;

                int min2 = Math.min(A[i + 1], B[i]);
                A[i + 1] -= min2;
                B[i] -= min2;
                count += min2;
            }
            System.out.println(count);
        }
    }
}
