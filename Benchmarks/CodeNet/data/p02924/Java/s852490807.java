import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final long N = scan.nextLong();
        scan.close();

        System.out.println(BigInteger.valueOf(N + 1).multiply(BigInteger.valueOf(N)).divide(BigInteger.valueOf(2)).toString());
    }

}