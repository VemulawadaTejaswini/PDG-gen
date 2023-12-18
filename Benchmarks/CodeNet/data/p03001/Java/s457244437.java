import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger W = new BigInteger(scanner.next());
        BigInteger H = new BigInteger(scanner.next());
        BigInteger x = new BigInteger(scanner.next());
        BigInteger y = new BigInteger(scanner.next());

        BigInteger menseki = W.multiply(H).divide(BigInteger.valueOf(2));
        BigInteger halfW = W.divide(BigInteger.valueOf(2));
        BigInteger halfH = H.divide(BigInteger.valueOf(2));

        int divType = 0;
        if (halfW.compareTo(x) == 0
                && halfH.compareTo(y) == 0) {
            divType = 1;
        }
        System.out.printf("%f %d\n", menseki.doubleValue(), divType);
    }
}