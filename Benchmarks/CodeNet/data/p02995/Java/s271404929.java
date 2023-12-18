import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long aMinusOne = a - 1;
        System.out.println(count(b, c, d) - count(aMinusOne, c, d));
    }
    public static long count(long num, long c, long d) {
      long lcm = lcm(c, d);
      long count = num / c + num / d - num / lcm;
      return num - count;
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
