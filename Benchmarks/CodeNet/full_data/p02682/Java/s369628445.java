import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        long K = scanner.nextLong();

        long result;

        if (A >= K) {
            result = K;
        }
        else if (B >= K - A) {
            result = A;
        } else {
            result = -1 * (K - A - B) + A;
        }

        System.out.println(result);
    }
}
