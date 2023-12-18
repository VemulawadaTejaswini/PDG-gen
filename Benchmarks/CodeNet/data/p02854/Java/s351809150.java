import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final long[] A = new long[N];
        long sum = 0;
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            sum += A[i];
        }
        long min = Long.MAX_VALUE;
        long left = A[0];
        long right = sum - A[0];
        for(int i = 1; i < N; i++) {
            final long cost = Math.abs(left - right);
            min = Math.min(min, cost);
            left += A[i];
            right -= A[i];
        }
        System.out.println(min);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
