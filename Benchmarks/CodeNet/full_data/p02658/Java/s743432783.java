import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        long tmpA;
        BigInteger biResult = new BigInteger("1");

        for (int i = 0 ; i < N ; i++) {
            tmpA = s.nextLong();
            biResult = biResult.multiply(BigInteger.valueOf(tmpA));
        }
        if (biResult.compareTo(BigInteger.valueOf(1000000000000000000l)) > 0) {
            System.out.println(-1);
        } else {
            System.out.println(biResult);
        }
    }
}