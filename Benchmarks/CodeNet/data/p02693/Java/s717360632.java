
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B - A + 1 >= 4) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
