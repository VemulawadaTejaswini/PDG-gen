import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int x5 = scanner.nextInt();

        scanner.close();

        if (x1 == 0) {
            System.out.println(1);
            return;
        }
        if (x2 == 0) {
            System.out.println(2);
            return;
        }
        if (x3 == 0) {
            System.out.println(3);
            return;
        }
        if (x4 == 0) {
            System.out.println(4);
            return;
        }
        if (x5 == 0) {
            System.out.println(5);
            return;
        }
    }
}
