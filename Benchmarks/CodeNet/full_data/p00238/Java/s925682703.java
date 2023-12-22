
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t != 0) {
            int n = scanner.nextInt();
            int i = 0;
            int y = t;
            for (int a = 0; a < n; a++) {
                int s = scanner.nextInt();
                int f = scanner.nextInt();
                int x = f - s;
                y = y - x;
            }
            if (y < 0) {
                System.out.println("OK");
            } else {
                System.out.println(y);
            }
            t = scanner.nextInt();
        }
    }
}

