import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int gcd = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
            System.out.println((x + 1) + (y + 1) - (gcd + 1));
        }
    }
}

