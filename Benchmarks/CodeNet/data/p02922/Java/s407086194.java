import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int r = b / a + (b % a == 0 ? 0 : 1);
        System.out.println(r);
    }
}