import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextLong(), p = scanner.nextLong(), r = 1;
        if (n == 1) {
            System.out.println(p);
        } else {
            for (long i = 2, c = 0; i * i <= p; i++) {
                while (p % i == 0) {
                    c++;
                    p /= i;
                }
                for (long j = 0; j < c / n; j++)
                    r *= i;
            }
            System.out.println(r);
        }
    }
}