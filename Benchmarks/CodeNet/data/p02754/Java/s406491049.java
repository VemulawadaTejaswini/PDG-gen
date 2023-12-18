import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        if (A <= 0) {
            System.out.println(0);
            return;
        }

        if (B <= 0) {
            System.out.println(N);
            return;
        }

        if (A >= N) {
            System.out.println(N);
            return;
        }

        if (B >= N) {
            System.out.println(A);
            return;
        }

        if (A + B >= N) {
            System.out.println(A);
            return;
        }

        long sho = N / (A + B);
        long jouyo = N % (A + B);
        System.out.println(sho * A + jouyo);
    }
}