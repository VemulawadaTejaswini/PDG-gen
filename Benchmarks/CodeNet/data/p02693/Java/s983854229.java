import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (A % K == 0 || B % K == 0) {
            System.out.println("OK");
            return;
        }

        if (A / K == B / K) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }
    }
}
