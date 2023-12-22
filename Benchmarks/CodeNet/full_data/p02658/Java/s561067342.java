import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        BigInteger ans = BigInteger.ONE;

        for (int i = 0; i < N; i++) {
            ans = ans.multiply(sc.nextBigInteger());
        }

        System.out.println(ans.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0 ? -1 : ans);
    }
}
