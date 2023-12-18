import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] D = new int[K];
        int[] A = new int[N + 1];
        Arrays.fill(A, 1);
        A[0] = 0;

        for (int j = 0; j < K; j++) {
            D[j] = sc.nextInt();
            for (int i = 0; i < D[j]; i++) {
                A[sc.nextInt()] = 0;
            }
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        System.out.println(sum);

    }
}