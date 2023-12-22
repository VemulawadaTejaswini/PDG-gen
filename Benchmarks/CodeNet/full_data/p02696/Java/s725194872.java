import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long max = Math.max(func(a, b, n), func(a, b, Math.max(n / b * b - 1, 0)));
        System.out.println(max);
    }
    
    static long func(long a, long b, long x) {
        return a * x / b - a * (x / b);
    }
}