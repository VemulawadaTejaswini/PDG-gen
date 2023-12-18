import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        BigInteger two = BigInteger.valueOf(2);
        Scanner sc = new Scanner(System.in);

        BigInteger k = sc.nextBigInteger();
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        if ((a.add(BigInteger.ONE)).compareTo(b) >= 0) {
            System.out.println(k.add(BigInteger.ONE));
            return;
        }

        if (k.compareTo(BigInteger.ONE.add(two)) < 0) {
            System.out.println(k.add(BigInteger.ONE));
            return;
        }

        BigInteger bis = b;
        k = k.subtract(BigInteger.ONE.add(a));

        if (k.remainder(two).equals(BigInteger.ONE)) {
            bis = bis.add(BigInteger.ONE);
            k = k.subtract(BigInteger.ONE);
        }

        bis = bis.add(b.subtract(a).multiply(k.divide(two)));
        System.out.println(bis);
    }
}