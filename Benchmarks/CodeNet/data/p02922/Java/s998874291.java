import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int r;
        if (b / a <= 1) {
            r = b / a + (b % a == 0 ? 0 : 1);
        } else {
            r = (b - 1) / (a - 1) + ((b - 1) % (a - 1) == 0 ? 0 : 1);
        }
        System.out.println(r);
    }
}