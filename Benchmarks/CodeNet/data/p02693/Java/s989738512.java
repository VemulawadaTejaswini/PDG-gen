import java.util.Scanner;

/**
 * We Love Golf.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var k = Integer.parseInt(scanner.next());
        var a = Integer.parseInt(scanner.next());
        var b = Integer.parseInt(scanner.next());

        System.out.println(k * (b / k) >= a ? "OK" : "NG");
    }
}
