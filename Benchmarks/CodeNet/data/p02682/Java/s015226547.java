import java.util.Scanner;

/**
 * Easy Linear Programming.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var k = scanner.nextInt();

        var sum = Math.min(k, a) - Math.min(k - a - b, c);
        System.out.println(sum);
    }
}