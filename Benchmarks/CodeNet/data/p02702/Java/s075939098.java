import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 4; j <= 200000; j++) {
                if (i+j > S.length()) break;
                BigInteger bi = new BigInteger(S.substring(i, i+j));
                if (bi.mod(BigInteger.valueOf(2019)) == BigInteger.ZERO) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
