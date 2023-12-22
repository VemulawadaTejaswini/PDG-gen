import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            BigInteger w = sc.nextBigInteger();
            BigInteger h = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();
            BigInteger gcd = w.gcd(h);
            System.out.println(w.divide(gcd).multiply(h.divide(gcd)).multiply(c));
        }
    }
}

