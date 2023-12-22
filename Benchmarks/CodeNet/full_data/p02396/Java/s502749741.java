import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            if (x > 0&&x<10000) {
                System.out.println("case" + ":" + x);
            }

        }

    }
}