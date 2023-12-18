
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int total = 0;

        for (int i = 0 ; i < N ; i++) {
            A[i] = scanner.nextInt();
            total += A[i];
        }

        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            if (A[i] * 4 * M >= total) count++;
            if (count >= M) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
