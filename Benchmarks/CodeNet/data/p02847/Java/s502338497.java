import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long l = 0, r = ((long) Math.pow(10, 9) + 1);
        while (r - l > 1) {
            long m = (l + r) / 2;
            if (f(a, b, m) <= x) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }
    public static long f(long a, long b, long n) {
        return a * n + b * String.valueOf(n).length();
    }
}