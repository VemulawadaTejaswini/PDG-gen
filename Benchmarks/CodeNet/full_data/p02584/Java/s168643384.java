import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BigInteger TWO = new BigInteger("2");
        Scanner sc = new Scanner(System.in);
        BigInteger x = new BigInteger(sc.next());
        BigInteger k = new BigInteger(sc.next());
        BigInteger d = new BigInteger(sc.next());
        if (x.abs().compareTo(k.multiply(d)) >= 0) {
            if (x.compareTo(BigInteger.ZERO) >= 0) System.out.println(x.subtract(k.multiply(d)));
            else System.out.println(x.add(k.multiply(d)));
        // } else if (x.compareTo(BigInteger.ZERO) >= 0) {
        //     BigInteger[] dr = x.divideAndRemainder(d);
        //     if (k.remainder(TWO).equals(BigInteger.ZERO)) {
        //         if (dr[0].remainder(TWO).equals(BigInteger.ZERO)) System.out.println(dr[1]);
        //         else System.out.println(dr[1].subtract(d));
        //     }
        } else {
            BigInteger[] dr = x.abs().divideAndRemainder(d);
            if (k.remainder(TWO).equals(BigInteger.ZERO)) {
                if (dr[0].remainder(TWO).equals(BigInteger.ZERO)) System.out.println(dr[1].abs());
                else System.out.println(d.subtract(dr[1]).abs());
            }
        }
    }
}