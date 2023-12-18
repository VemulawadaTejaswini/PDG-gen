
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextLong();

        long a = X / 500;
        X = X % 500;
        long b = X / 5;
        System.out.println(a * 1000 + b * 5);
    }
}
