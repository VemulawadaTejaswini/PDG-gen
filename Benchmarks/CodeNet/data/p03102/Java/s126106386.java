import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int C = in.nextInt();
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = in.nextInt();
            }
            int[][] A = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    A[i][j] = in.nextInt();
                }
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                int sum = C;
                for (int j = 0; j < M; j++) {
                    sum += A[i][j] * B[j];
                }
                if (sum > 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
