import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m = BigInteger.ONE;

        int n = sc.nextInt();
        BigInteger[] input = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextBigInteger();
            m = m.multiply(input[i]);
        }

        m = m.subtract(BigInteger.ONE);

        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            ans = ans.add(m.mod(input[i]));
        }

        System.out.println(ans);
    }
}