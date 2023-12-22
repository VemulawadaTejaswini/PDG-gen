import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            result = result.multiply(new BigInteger(s.next()));
        }
        System.out.println(result.compareTo(new BigInteger("1000000000000000000")) > 0 ? -1 : result);
    }
}