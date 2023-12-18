
import java.util.*;


public class Main1 {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long num = lcm(c, d);

        long result = 0;
        long warenai = num - (num/c) - (num/d) + 1;

        long bsyou = b / num;
        long asyou = (a - 1) / num;
        long bamari = b % num;
        long aamari = a % num - 1;

        result = (bsyou - asyou) * warenai;

        long aamariwarenaicount = aamari - (aamari/c) - (aamari/d);
        long bamariwarenaicount = bamari - bamari/c - bamari/d;
        result += bamariwarenaicount;
        result -= aamariwarenaicount;

        System.out.println(result);

    }

    //最大公約数
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}
