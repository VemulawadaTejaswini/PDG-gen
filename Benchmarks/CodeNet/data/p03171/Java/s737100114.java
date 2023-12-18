import java.util.Scanner;

/**
 * Deque
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long D = 0;
            int k = 1;

            int left = 0;
            int right = N - 1;

            while (true) {
                if (left == right) {
                    D += A[left] * k;
                    break;
                }

                long dl = A[left] - A[left + 1];
                long dr = A[right] - A[right - 1];

                if (dr - dl >= 0) {
                    D += A[right] * k;
                    right--;
                } else {
                    D += A[left] * k;
                    left++;
                }

                k *= -1;
            }

            System.out.println(D);
        }
    }

}
