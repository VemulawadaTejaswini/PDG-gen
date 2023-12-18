import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = scanner.nextBigInteger();
        BigInteger K = scanner.nextBigInteger();
        scanner.close();

        if (N.compareTo(K) > 0) {
            System.err.println(K.subtract(new BigInteger("1")));
        } else {
            System.out.println(N);
        }
    }
}
