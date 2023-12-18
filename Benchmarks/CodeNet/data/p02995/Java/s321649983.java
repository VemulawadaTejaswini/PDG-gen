import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long min = sc.nextLong() - 1;
        long max = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long lcm = LCM(c, d);
        long cnt = 0;

        cnt += devide(max, c);
        cnt += devide(max, d);
        cnt -= devide(max, lcm);

        cnt -= devide(min, c);
        cnt -= devide(min, d);
        cnt += devide(min, lcm);

        System.out.println(max - min - cnt);
    }

    public static long devide(long a, long b) {
        return a / b;
    }

    public static long GCD(long a, long b) {
        if (a < b) {
            return GCD(b, a);
        } else if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }
}
