import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger n = new BigInteger(sc.next());

        BigInteger max = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger tmp = (a.multiply(i).divide(b)).subtract(a.multiply(i.divide(b)));
            if (tmp.compareTo(max) >= 0) {
                max = tmp;
            }
        }

        System.out.println(max);    

    }
}
