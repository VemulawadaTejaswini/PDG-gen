import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger r = n.mod(BigInteger.valueOf(9));
        if(r.equals(BigInteger.valueOf(0))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
