
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int ball = scanner.nextInt();
        final int people = scanner.nextInt();

        System.out.println(ball - people);
    }
}
