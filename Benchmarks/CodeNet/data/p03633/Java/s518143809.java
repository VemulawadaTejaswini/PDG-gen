import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBigInteger();
        }
        Arrays.parallelSort(a);
        for (int i = 0; i < n - 1; i++) {
            a[i + 1] = (a[i].multiply(a[i + 1])).divide(getGcd(a[i], a[i + 1]));
        }
        System.out.println(a[n - 1]);
    }

    private static BigInteger getGcd(BigInteger x, BigInteger y) {
        return y == BigInteger.ZERO ? x : getGcd(y, x.mod(y));
    }
}