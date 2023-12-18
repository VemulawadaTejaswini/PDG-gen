import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();
        final int a = scanner.nextInt();
        if (x < a) {
            System.out.println(0);
        }else {
            System.out.println(10);
        }
    }
}
