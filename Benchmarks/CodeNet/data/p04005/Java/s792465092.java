import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(calc(a, b, c));
//        test();
    }

    private static long calc(long a, long b, long c) {
        long [] array = new long[]{a, b, c};
        Arrays.sort(array);
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            return 0;
        } else {
            return array[0] * array[1];
        }
    }

    private static void test() {
        assert calc(3, 3, 3) == 9 : "calc(3, 3, 3) == 9";
        assert calc(2, 2, 4) == 0 : "calc(2, 2, 4) == 0";
        assert calc(5, 3, 5) == 15 : "calc(5, 3, 5) == 15";
    }
}
