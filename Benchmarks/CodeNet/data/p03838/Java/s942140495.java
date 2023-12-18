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
            return y - x + 2;
        } else if (x <= 0 && y < x) {
            return x - y;
        } else if (x >= 0 && y <= 0) {
            if (Math.abs(x) > Math.abs(y)) {
                return x + y + 1;
            } else {
                return -y - x + 1;
            }
        } else if (x <= 0 && y >= 0) {
            if (Math.abs(x) > Math.abs(y)) {
                return -x - y + 1;
            } else {
                return x + y + 1;
            }
        }
        return 0;
    }

    private static void test() {
        assert calc(10, 20) == 10 : "10, 20";
        assert calc(10, -10) == 1 : "10, -10";
        assert calc(-10, -20) == 12 : "-10, -20";
    }
}
