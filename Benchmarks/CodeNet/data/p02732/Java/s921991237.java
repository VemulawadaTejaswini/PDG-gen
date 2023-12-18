import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        final int[] counts = new int[N + 1];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            counts[A[i]] += 1;
        }

        long total = 0;
        for (int i = 1; i <= N; i++) {
            int n = counts[i];
            total += choose2(n);
        }

        for (int i = 0; i < N; i++) {
            int n = counts[A[i]];
            System.out.println(total - (n - 1));
        }        
    }

    private static long choose2(long n) {
        return n * (n - 1) / 2;
    }
}
