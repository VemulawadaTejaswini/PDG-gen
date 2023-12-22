import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int k = 0; k < K; k++) {
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                double left = i + 1 - A[i] - 0.5;
                double right = i + 1 + A[i] + 0.5;
                for (int j = 0; j < N; j++) {
                    if (left < j + 1 && j + 1 < right) {
                        B[j] += 1;
                    }
                }
            }
            if (N >= 0) System.arraycopy(B, 0, A, 0, N);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }
}