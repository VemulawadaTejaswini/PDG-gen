import java.math.BigDecimal;
import java.util.Scanner;

/**
 * TITLE : Sqrt Inequality
 * URL : https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        BigDecimal abd = sqrt(a);
        BigDecimal bbd = sqrt(b);
        BigDecimal cbd = sqrt(c);

        System.out.println(abd.add(bbd));

        System.out.println(abd.add(bbd).compareTo(cbd) <= 0 ? "Yes" : "No");
        sc.close();
    }

    private static BigDecimal sqrt(long val) {
        BigDecimal a = new BigDecimal(val);
        BigDecimal x = new BigDecimal("2.0");
        BigDecimal delta = new BigDecimal("1.0");
        BigDecimal sisu = new BigDecimal("1.0E-16");

        int count = 0;
        while (sisu.compareTo(delta) < 0) {
            BigDecimal f = x.multiply(x).subtract(a);
            BigDecimal df = x.multiply(new BigDecimal("2.0"));
            x = x.subtract(f.divide((df), BigDecimal.ROUND_HALF_UP));
            delta = (x.multiply(x).subtract(a)).abs();
            count++;
        }

        System.out.println(x);

        return x;
    }
}