
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

        int p = 0;
        for (int i = N - 3 ; i >= 0 ; i++) {
            score += A[i + ((1 + p) % 2)];
            p++;
        }

        System.out.println(score);
    }
}
