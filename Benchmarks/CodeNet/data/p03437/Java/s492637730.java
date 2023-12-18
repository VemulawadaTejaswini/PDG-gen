import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by hkoba on 2018/01/08.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // スペース区切りの整数の入力
        BigInteger x = BigInteger.valueOf(sc.nextInt());
        BigInteger y = BigInteger.valueOf(sc.nextInt());
        if (x.mod(y).signum() == 0) {
            System.out.println("-1");
            return;
        }
        BigInteger g = x.gcd(y);
        if (g.equals(BigInteger.ONE)) {
            g = y.add(BigInteger.ONE);
        }
        System.out.println(x.multiply(g));
    }
}
