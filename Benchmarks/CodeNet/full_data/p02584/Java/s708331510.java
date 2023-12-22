import java.util.*;
import java.io.*;
// import lib.util.*;
// import lib.graph.*;
// import lib.io.*;
// import lib.math.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger X = new BigInteger(Long.toString(Math.abs(sc.nextLong())));
        BigInteger D = new BigInteger(sc.next());
        BigInteger K = new BigInteger(sc.next());
        if (X.compareTo(D.multiply(K)) < 0) {
            BigInteger res = X.mod(D);
            res = res.min(res.subtract(D).abs());
            if (K.subtract(X.divide(D)).mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                res = res.add(D);
                res = res.min(res.subtract(D).subtract(D).abs());
            }
            System.out.println(res);
        } else {
            BigInteger res = X.subtract(D.multiply(K));
            System.out.println(res);
        }
    }
}