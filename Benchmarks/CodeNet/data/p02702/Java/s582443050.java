import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        long ans = 0;

        BigInteger con = new BigInteger("2019");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 5; j <= s.length(); j++) {
                BigInteger bigInteger = new BigInteger(s.substring(i, j));
                if (bigInteger.mod(con).intValue() == 0) {
                    ans++;
                    j += 4;
                }
            }
        }
        System.out.println(ans);
    }
}