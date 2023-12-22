import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007L;

            // in
            int N = Integer.parseInt(sc.next());
            long A[] = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(sc.next());
            }

            // solve
            long sum = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += A[i] * A[j] % MOD;
                    sum %= MOD;
                }
            }
            System.out.println(sum);
        }
    }
}