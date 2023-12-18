import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] * 4 * M < sum) {
                    continue;
                }
                count++;
            }

            System.out.println(count >= M ? "Yes" : "No");
        }
    }
}
