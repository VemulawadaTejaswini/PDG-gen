import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextInt();
        long d = scan.nextInt();
        long out = b - a + 1 - ((b - a + 1) / c + (b - a + 1) / d - (b - a + 1) / lcm(c, d));
        System.out.println(out);
    }
    private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
    private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
}