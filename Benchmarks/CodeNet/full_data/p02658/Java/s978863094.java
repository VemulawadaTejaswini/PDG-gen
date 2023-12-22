import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private final static BigInteger MAX =
        new BigInteger("1000000000000000000");
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        BigInteger mult = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            mult = mult.multiply(sc.nextBigInteger());
        }
        
        if (MAX.compareTo(mult) < 0) {
            System.out.println("-1");
        } else {
            System.out.println(mult);
        }
    }
}