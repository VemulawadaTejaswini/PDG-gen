import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    final static long MOD = 1000000007;

    public static void main(String[] args) throws ArithmeticException {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() throws ArithmeticException {
        try (Scanner sc = new Scanner(System.in)) {
            // Main Code
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long max = Long.MIN_VALUE;
            max = max(max,a*c);
            max = max(max,a*d);
            max = max(max,b*c);
            max = max(max,b*d);
            return max;
        }
    }

}

class ChenNumberUtil {
    /**
     * nが素数かどうかを判定します。
     *
     * @param n 素数か判定したい値
     * @return boolean 素数か否か
     */
    static boolean isPrime(long n) {
        if (n == 1)
            return false;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * nの約数の配列を求めます。
     *
     * @param n 約数を取得したい値
     * @return 約数の配列
     */
    static Collection<Long> getDivisors(long n) {
        ArrayList<Long> al = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                al.add(i);
                if (n / i != i)
                    al.add(n / i);
            }
        }
        Collections.sort(al);
        return al;
    }

    /**
     * nの約数の個数を求めます。
     *
     * @param n 約数の個数を取得したい値
     * @return 約数の個数
     */
    static long getDivisorsCount(long n) {
        long count = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i)
                    count++;
            }
        }
        return count;
    }

    /**
     * nの約数の総和を求めます。
     *
     * @param n 約数を取得したい値
     * @return 約数の配列
     */
    static long getDivisorsSum(long n) {
        long sum = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i)
                    sum += n / i;
            }
        }
        return sum;
    }

    /**
     * nの素因数分解の数列を求めます。
     *
     * @param n , not {@code null}
     * @return 素因数分解のペア配列 <素因数, 指数>
     */
    static Collection<Pair<Long, Long>> primeFactorize(long n) {
        ArrayList<Pair<Long, Long>> al = new ArrayList<>();
        for (long a = 2; a * a <= n; ++a) {
            if (n % a != 0)
                continue;
            long ex = 0;

            while (n % a == 0) {
                ex++;
                n /= a;
            }

            al.add(new Pair<>(a, ex));
        }
        if (n != 1)
            al.add(new Pair<>(n, 1l));
        return al;
    }

    /**
     * 最大公約数を求めます。1が返る場合、xとyは互いに素です。
     *
     * @param x 自然数1
     * @param y 自然数2
     * @return 最大公約数
     * @throws Error x,yのどちらかが0だよ
     */
    static long getGCD(long x, long y) throws Error {
        long r;
        if (x == 0 || y == 0) {
            throw new Error("Invalid Value");
        }
        while ((r = x % y) != 0) {
            x = y;
            y = r;
        }
        return y;
    }

    /**
     *
     * @param a
     * @param p
     * @return
     * @throws Error
     */
    static long modInvert(long a, long p) throws Error {
        if (ChenNumberUtil.getGCD(a, p) != 1)
            throw new Error("Inverse element does not exist");
        long b = p, u = 1, v = 0;
        while (b != 0) {
            long t = a / b, temp;

            a -= t * b;
            temp = a;
            a = b;
            b = temp;

            u -= t * v;
            temp = u;
            u = v;
            v = temp;
        }
        u %= p;
        if (u < 0)
            u += p;
        return u;
    }
}

class ChenBitUtil {
    static int popCount(int bit) {
        return Integer.bitCount(bit);
    }

    static boolean isFlag(int bit, int i) {
        return 0 != (bit & (1 << i));
    }

    static int setTrue(int bit, int i) {
        return bit |= (1 << i);
    }

    static int setFalse(int bit, int i) {
        return bit &= ~(1 << i);
    }

    static int setReverse(int bit, int i) {
        return isFlag(bit, i) ? setFalse(bit, i) : setTrue(bit, i);
    }

    static int reverseAll(int bit) {
        return ~bit;
    }
}

/**
 * ペアで値を格納します
 *
 * @param <K>
 * @param <V>
 */
class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
    /** serialVersionUID. */
    private static final long serialVersionUID = 6411527075103472113L;

    public Pair(final K key, final V value) {
        super(key, value);
    }
}