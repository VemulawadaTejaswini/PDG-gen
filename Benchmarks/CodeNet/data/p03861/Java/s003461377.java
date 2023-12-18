import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger x = sc.nextBigInteger();

        System.out.println(b.divide(x).subtract(a.subtract(BigInteger.ONE).divide(x)));
    }
}