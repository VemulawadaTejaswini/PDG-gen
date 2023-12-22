import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        double b = scanner.nextDouble();
        b *= 100;
        int c = (int) b;
        BigInteger d = BigInteger.valueOf(c);
        BigInteger res = a.multiply(d);
        BigInteger ans = res.divide(BigInteger.valueOf(100));
        System.out.println(ans.toString());
    }
}
