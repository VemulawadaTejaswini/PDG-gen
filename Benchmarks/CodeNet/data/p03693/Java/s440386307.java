
import java.util.Scanner;

/**
 * Created by codoge on 2017/6/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        if (canDivide4(r, g, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canDivide4(int r, int g, int b) {
        if (g % 2 == 0) {
            return b % 4 == 0;
        } else {
            return (b+2) % 4 == 0;
        }
    }
}
