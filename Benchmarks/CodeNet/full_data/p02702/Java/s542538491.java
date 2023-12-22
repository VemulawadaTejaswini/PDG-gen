import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BigInteger two = BigInteger.valueOf(2019);
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ans = 0;
        for(int l = 4; l < s.length(); l++) {
            for(int i = 0; i <= s.length() - l; i++) {
                String sub = s.substring(i, i + l);
                BigInteger b = new BigInteger(sub);
                if(b.mod(two).equals(BigInteger.ZERO)) {
                    ++ans;
                }
            }
        }
        System.out.println(ans);
    }
}
