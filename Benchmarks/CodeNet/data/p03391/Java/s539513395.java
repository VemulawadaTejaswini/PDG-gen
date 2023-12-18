import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Q = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < Q; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A != 0 && A < B) {
                count += A;
            }
            if (A > B) {
                count += A - B;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}