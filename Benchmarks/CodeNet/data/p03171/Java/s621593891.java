import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long[] D = new long[N];

            for (int i = 0; i < N; i++) {
                D[i] = Long.MIN_VALUE;

                if (i > 0 && A[i - 1] < A[i]) {
                    continue;
                }
                if (i < N - 1 && A[i] > A[i + 1]) {
                    continue;
                }

                int k = (N % 2 == 1) ? 1 : -1;
                D[i] = A[i] * k;

                int left = i;
                int right = i;
                k *= -1;

                while (true) {
                    if (left == 0 && right == N - 1) {
                        break;
                    }

                    if (left == 0) {
                        right++;
                        D[i] += A[right] * k;
                    } else if (right == N - 1) {
                        left--;
                        D[i] += A[left] * k;
                    } else {
                        if (A[left - 1] >= A[right]) {
                            left--;
                            D[i] += A[left] * k;
                        } else {
                            right++;
                            D[i] += A[right] * k;
                        }
                    }

                    k *= -1;
                }
            }

            long ans = Arrays.stream(D).max().getAsLong();

            System.out.println(ans);
        }
    }

}
