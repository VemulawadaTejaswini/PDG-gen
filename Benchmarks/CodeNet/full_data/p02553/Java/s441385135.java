import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = BigInteger.valueOf(sc.nextLong());
        BigInteger b = BigInteger.valueOf(sc.nextLong());
        BigInteger c = BigInteger.valueOf(sc.nextLong());
        BigInteger d = BigInteger.valueOf(sc.nextLong());
        BigInteger mul = a.multiply(c);
        if (mul.compareTo(a.multiply(d)) < 0)
            mul = a.multiply(d);
        if (mul.compareTo(b.multiply(c)) < 0)
            mul = b.multiply(c);
        if (mul.compareTo(b.multiply(d)) < 0)
            mul = b.multiply(d);

        System.out.println(mul);
    }
}