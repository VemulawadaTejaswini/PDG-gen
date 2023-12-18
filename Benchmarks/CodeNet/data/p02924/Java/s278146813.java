import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final long N = scan.nextLong();
        scan.close();

        BigInteger ans = BigInteger.valueOf(0);
        for (long i = 1; i < N; i++) {
            ans = ans.add(BigInteger.valueOf(i));
        }

        System.out.println(ans.toString());
    }

}
