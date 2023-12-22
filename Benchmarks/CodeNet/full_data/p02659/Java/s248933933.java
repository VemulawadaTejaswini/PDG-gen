import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        double b = scanner.nextDouble();
        System.out.println((long)Math.floor(a * b));
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

}



