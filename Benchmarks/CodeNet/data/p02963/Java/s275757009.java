import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long s = scanner.nextLong();
        long l = 1000000000;

        if (s % l == 0) {
            System.out.printf("0 0 %d 0 0 %d\n", s / l, l);
        } else {
            while (true) {
                long a = l + s / l * l;
                long b = a - s;
                for (long i = 1; i * i <= b; i++) {
                    if (b % i == 0) {
                        System.out.printf("0 0 %d %d %d %d\n", l, i, b / i, a / l);
                        return;
                    }
                }
                l--;
            }
        }
    }
}