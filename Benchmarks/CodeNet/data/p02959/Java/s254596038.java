
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] A = new long[N + 1];
        long[] B = new long[N];

        for (int i = 0 ; i < N + 1 ; i++) {
            A[i] = scanner.nextLong();
        }

        for (int i = 0 ; i < N ; i++) {
            B[i] = scanner.nextLong();
        }

        long answer = Math.min(A[0], B[0]);
        B[0] = B[0] - Math.min(A[0], B[0]);
        for (int i = 1 ; i < N ; i++) {
            answer += Math.min(A[i], B[i - 1] + B[i]);
            B[i] = B[i] - Math.min(A[i] - B[i - 1], B[i]);
        }

        answer += Math.min(A[N], B[N - 1]);

        System.out.println(answer);
    }
}
