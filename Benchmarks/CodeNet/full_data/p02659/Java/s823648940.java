import java.util.*;
import java.math.*;

public class Main {

    public static void main (String[] args) throws Exception {

        final Scanner in = new Scanner(System.in);
        final BigInteger A = in.nextBigInteger();
        final BigDecimal B = in.nextBigDecimal();

        final BigDecimal AA = new BigDecimal(A);

        final BigDecimal product = AA.multiply(B);

        System.out.println(product.toBigInteger());

    }
}