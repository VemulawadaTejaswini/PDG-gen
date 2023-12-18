// 全然わかんねぇ数学できねぇ俺らは感覚でコードを書いている
// 参考 -> #6056988
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long ans = f(b, c, d) - f(a-1, c, d);

        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long f(long n, long c, long d) {
        long x = n;
        x -= n / c;
        x -= n / d;
        long tmp = c / gcd(c, d) * d;
        x += n / tmp;
        return x;
    }
}