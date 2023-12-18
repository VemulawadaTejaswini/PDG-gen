import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(calc(x, y));
    }

    private static int calc(int x, int y) {
        if (x == y) {
            return 0;
        } else if (y >= 0 && y < x) {
            return x - y;
        } else if (x >= 0 && y > x) {
            return y - x + 2;
        } else if (y <= 0 && x < y) {
            return y - x;
        } else if (x <= 0 && y < x) {
            return x - y;
        } else {
            return Math.abs(Math.abs(x) - Math.abs(y)) + 1;
        }
    }
}
