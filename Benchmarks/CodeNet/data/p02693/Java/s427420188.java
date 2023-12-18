import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (A / K == B / K && K != 1) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }
    }
}
