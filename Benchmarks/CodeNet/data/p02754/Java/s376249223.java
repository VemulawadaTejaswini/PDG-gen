import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        double result = (double) n / (a + b) * a;
        double mod = result % 1;
        System.out.println((long)result + (mod == 0 ? 0 : 1));
    }
}