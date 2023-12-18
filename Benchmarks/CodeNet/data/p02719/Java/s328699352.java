import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String K = sc.next();
        BigInteger Nsu = new BigInteger(N);
        BigInteger Ksu = new BigInteger(K);
        BigInteger ZERO = BigInteger.ZERO;
        BigInteger TEN = BigInteger.TWO;


        if (Nsu.compareTo(Ksu) == -1) {
            System.out.println(N);
            return;
        } else if (Nsu.bitLength() > 10) {
            Nsu = Nsu.divide(Nsu);
        }

        while (Nsu.compareTo(ZERO) == 1) {
            Nsu = Nsu.subtract(Ksu);
        }

        System.out.println(Nsu.abs());
    }
}