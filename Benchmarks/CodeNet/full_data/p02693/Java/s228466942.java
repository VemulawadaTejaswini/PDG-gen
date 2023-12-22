
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A % K == 0 || B % K == 0) {
            System.out.println("OK");
            return;
        }

        int a = A / K;
        int b = B / K;
        if (b - a > 0) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
