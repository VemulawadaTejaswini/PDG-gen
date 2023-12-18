import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Q = scanner.nextInt();

        int count = 0;
        int minb = Integer.MAX_VALUE;

        for (int i = 0; i < Q; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            count += A;
            if (minb > B) {
                minb = B;
            }
        }
        scanner.close();
        System.out.println(count - minb);
    }
}