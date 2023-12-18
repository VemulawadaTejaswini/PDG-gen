import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Y = scan.nextInt();

        boolean flag = false;
        loop: for (int x = 0; x < n + 1; x++) {
            for (int y = 0; y < n + 1; y++) {
                for (int z = 0; z < n + 1; z++) {
                    if (10000 * x + 5000 * y + 1000 * z == Y) {
                        flag = true;
                        System.out.println(x + " " + y + " " + z);
                        break loop;
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("-1 -1 -1");
        }
    }
}