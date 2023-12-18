
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        // N = (A + B) * x + c
        // ans = A * x + min(A, c)
        long x = N / (A + B);
        long c = N % (A + B);
        System.out.println(A * x + Math.min(A, c));

    }
}
