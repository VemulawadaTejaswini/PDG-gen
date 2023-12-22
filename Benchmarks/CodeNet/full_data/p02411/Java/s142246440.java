
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int r = scanner.nextInt();
        while (m != -1 || f != -1 || r != -1) {
            if (m == -1 || f == -1 || (m + f) < 30) {
                System.out.println("F");
            } else if (30 <= (m + f) && (m + f) < 50 && r < 50) {
                System.out.println("D");
            } else if (50 <= (m + f) && (m + f) < 65 || 30 <= (m + f) && (m + f) < 50 && r >= 50) {
                System.out.println("C");
            } else if (65 <= (m + f) && (m + f) < 80) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
            m = scanner.nextInt();
            f = scanner.nextInt();
            r = scanner.nextInt();
        }
    }
}

