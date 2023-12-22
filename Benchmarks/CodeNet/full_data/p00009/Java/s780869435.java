
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int y = 2;
            int s = 0;
            if (n >= 2) {
                s++;
            }
            for (int x = 3; x <= n; x += 2) {
                y = 3;
                while (x % y != 0 && x >= y * y) {
                    y += 2;
                }
                if (x < y * y) {
                    s++;
                }
                y = 2;
            }
            System.out.println(s);
        }
    }
}

