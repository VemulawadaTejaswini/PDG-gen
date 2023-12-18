import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());

        scanner.close();

        if (B <= 1) {
            System.out.println(0);
            return;
        }

        int adapters = 1;
        int ports = adapters * A;

        while (B > ports) {
            // 増やす
            adapters++;
            ports += A - 1;
        }

        System.out.println(adapters);
    }
}
