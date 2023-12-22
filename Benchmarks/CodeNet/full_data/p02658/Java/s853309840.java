import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long max = (long) 1e18;
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                if (A[i] == 0) {
                    System.out.println(0);
                    return;
                }
            }

            long multi = 1;
            for (int i = 0; i < N; i++) {
                multi *= A[i];
                if (multi > max) {
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(multi);
        }
    }
}
