import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long bunshi = (n * a + a + b - 1);
        long bunbo = a + b;
        long result = bunshi == 0 || bunbo == 0 ? 0 : bunshi / bunbo;
        System.out.println(result);
    }
}