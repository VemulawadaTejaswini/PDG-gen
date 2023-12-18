import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        if (N % 2 == 1) {
            int start = N / 2;
            int before = start;
            long sum1 = 0;
            long sum2 = 0;

            for (int i = 0; i < N/2; i++) {
                sum1 += A[N - 1 - i] - A[before];
                sum1 += A[N - 1 - i] - A[i];
                before = i;
            }

            before = start;
            for (int i = 0; i < N/2; i++) {
                sum2 += A[before] - A[i];
                sum2 += A[N - 1 - i] - A[i];
                before = N - 1 - i;
            }

            System.out.println(Math.max(sum1, sum2));
        } else {
            int start = N / 2 - 1;
            int before = start;
            long sum1 = 0;
            long sum2 = 0;

            for (int i = 0; i <= N/2 - 1; i++) {
                if (i == N/2 - 1) {
                    sum1 = A[N - 1 - i] - A[before];
                } else {
                    sum1 += A[N - 1 - i] - A[before];
                    sum1 += A[N - 1 - i] - A[i];
                    before = i;
                }
            }

            start = N / 2;
            before = start;
            for (int i = 0; i <= N/2 - 1; i++) {
                if (i == N/2 - 1) {
                    sum2 += A[before] - A[i];
                } else {
                    sum2 += A[before] - A[i];
                    sum2 += A[N - 1 - i] - A[i];
                    before = N - 1 - i;
                }
            }

            System.out.println(Math.max(sum1, sum2));
        }
    }
}