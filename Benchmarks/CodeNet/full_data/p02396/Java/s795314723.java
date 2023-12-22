import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            count++;
            if (x >= 1 && x <= 10000) {

                System.out.println("Case " + count + ": " + x);
            } else {
                break;
            }

        }

    }
}