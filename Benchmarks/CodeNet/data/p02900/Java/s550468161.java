import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min = Math.min(a, b);
        List<Long> sets = new LinkedList<>();
        List<Long> sets2 = new LinkedList<>();
        long max = calc(a, b);
        System.out.println(math(max, 0));
    }
    private static long calc(long a, long b) {
        if(a == b ) return a;
        if(a > b) return calc(a -b, b);
        return calc(a, b -a);
    }
    private static long math(long m, long count) {
        if(m == 1.0) return count;
        if(m % 2 == 0) return math(m / 2, count + 1);
        for(long i = 3L; i <= m; i += 2) {
            if(m % i == 0) return math(m / i, count + 1);
        }
        return 0;
    }
}
