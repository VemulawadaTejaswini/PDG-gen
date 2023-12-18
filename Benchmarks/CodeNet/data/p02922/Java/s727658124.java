import java.math.BigInteger;
import java.util.Scanner;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Main {
    // 最大公約数
    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 階乗(n!)
    BigInteger fact(BigInteger n, BigInteger ans) {
        if(n.compareTo(BigInteger.ONE) < 1) return ans;
        return fact(n.subtract(BigInteger.ONE), ans.multiply(n));
    }

    // フィボナッチ数
    BigInteger fib(BigInteger n, BigInteger a, BigInteger b) {
        if(n.equals(BigInteger.ONE)) return a;
        return fib(n.subtract(BigInteger.ONE), b, a.add(b));
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int now = 1;
        int count = 0;
        while (now < b) {
            now = now + a - 1;
            count++;
        }
        System.out.println(count);
    }
}
