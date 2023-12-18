import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calc(a, b, c));
//        test();
    }

    private static int calc(int a, int b, int c) {
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            return 0;
        } else {
            if (a >= b) {
                if (a >= c) {
                    return b * c;
                } else {
                    return a * b;
                }
            } else {
                if (b >= c) {
                    return a * c;
                } else {
                    return a * b;
                }
            }
        }
    }

    private static void test() {
        assert calc(3, 3, 3) == 9 : "calc(3, 3, 3) == 9";
        assert calc(2, 2, 4) == 0 : "calc(2, 2, 4) == 0";
        assert calc(5, 3, 5) == 15 : "calc(5, 3, 5) == 15";
    }
}
