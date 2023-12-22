import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        int d = 2 * (a + b);

        String s = String.valueOf(c + " " + d);
        System.out.println(s);

    }
}