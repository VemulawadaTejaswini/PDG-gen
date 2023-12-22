
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] A = new long[N];

        for (int i = 0 ; i < N ; i++) {
            A[i] = scanner.nextLong();
        }

        Arrays.sort(A);

        long score = A[N - 1];
        if (N == 2) {
            System.out.println(score);
            return;
        }

        for (int i = 0 ; i < N - 2 ; i++) {
//            System.out.printf("i:%d A[%d] %d%n", i, N - 2 - i / 2 , A[N - 2 - i / 2]);
            score += A[N - 2 - i / 2];
        }

        System.out.println(score);
    }
}
