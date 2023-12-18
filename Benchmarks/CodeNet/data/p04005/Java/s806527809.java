
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(0);
        } else {
            if (a < b && c < b) {
                System.out.println(a * c);
            } else if (a < c && b <= c) {
                System.out.println(a * b);
            } else {
                System.out.println(b * c);
            }
        }

    }

}