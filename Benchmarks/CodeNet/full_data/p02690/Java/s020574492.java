import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();

        for (long l = 0; l < x; l++) {
            //plus
            {
                long num = l;
                long apow = pow5(num);
                long diff = x - apow;
                double base = calculate(diff);
                if (isInteger(base)) {
                    if (pow5(num) - pow5((long) base) == x) {
                        System.out.println(l + " " + (long) base);
                        System.exit(0);
                    }
                    if (pow5(num) - pow5((long) base * -1) == x) {
                        System.out.println(l + " " + (long) base * -1);
                        System.exit(0);
                    }
                }
            }

            //minus
            {
                long num = l * -1;
                long apow = pow5(num);
                long diff = x - apow;
                double base = calculate(diff);
                if (isInteger(base)) {
                    if (pow5(num) - pow5((long) base) == x) {
                        System.out.println(l + " " + (long) base);
                        System.exit(0);
                    }
                    if (pow5(num) - pow5((long) base * -1) == x) {
                        System.out.println(l + " " + (long) base * -1);
                        System.exit(0);
                    }
                }

            }
        }
    }

    static long pow5(long base) {
        return base * base * base * base * base;
    }

    static boolean isInteger(double d) {
        return (d == Math.floor(d)) && !Double.isInfinite(d);
    }

    static double calculate(long base) {
        return Math.pow(base, 1.0 / 5.0);
    }
}