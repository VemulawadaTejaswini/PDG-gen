import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int num = scanner.nextInt();

        System.out.println((int) Math.pow(num, 3));
    }
}