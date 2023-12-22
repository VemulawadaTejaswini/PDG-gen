import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = s.nextLong();
        }

        Arrays.sort(A);
        long n = 0;

        if (N % 2 != 0) {
            n += A[N / 2];
            for (int i = N / 2 + 1; i < N - 1; i++) {
                n = n + 2 * A[i];
            }
            n += A[N - 1];
        } else {
            for (int i = N / 2; i < N - 1; i++) {
                n = n + 2 * A[i];
            }
            n += A[N - 1];
        }

        System.out.println(n);
    }
}