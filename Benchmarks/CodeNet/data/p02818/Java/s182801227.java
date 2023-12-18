import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger k = new BigInteger(sc.next());

            if (a.compareTo(k) > 0) {
                a = a.subtract(k);
            } else {
                b = b.subtract(k.subtract(a));
                a = new BigInteger("0");
                if (b.compareTo(new BigInteger("0")) < 0) {
                    b = a;
                }
            }
            System.out.println(a + " " + b);
        }
    }

}
