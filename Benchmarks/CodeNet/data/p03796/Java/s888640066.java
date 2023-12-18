import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        BigInteger ans = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            ans = ans.multiply(new BigInteger(Integer.toString(i)));
        }

        System.out.println(ans.remainder(new BigInteger(Integer.toString(1000000000+7))));
    }
}
