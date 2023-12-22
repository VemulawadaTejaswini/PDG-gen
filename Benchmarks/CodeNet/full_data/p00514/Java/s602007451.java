import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, r;
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        if (r - n * m < 0) {
            System.out.println("0");
        }
        BigInteger ZERO = BigInteger.ZERO;
        BigInteger ONE = BigInteger.ONE;
        BigInteger b = ONE, k;
        BigInteger lb = new BigInteger(Integer.toString(r - n * m));
        k = new BigInteger(Integer.toString(r - n * m + n - 1));
        while (k.compareTo(lb) > 0) {
            b = b.multiply(k);
            k = k.subtract(ONE);
        }
        k = new BigInteger(Integer.toString(n - 1));
        while (k.compareTo(ZERO) > 0) {
            b = b.divide(k);
            k = k.subtract(ONE);
        }
        System.out.println(b);
    }
}