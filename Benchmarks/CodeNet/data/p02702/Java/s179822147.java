import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if(S.length() < 4) {
            System.out.println(0);
            return;
        }

        int count = 0;
        for(int i = 0; i < S.length(); i++) {

            for(int j = i; j <= S.length(); j++) {
                if(j == i) continue;
                String a = S.substring(i, j);
                if(a.length() < 4) {
                    continue;
                }
              
                BigInteger bi = new BigInteger(a);
                if (!a.equals("0") && bi.remainder(BigInteger.valueOf(2019)).longValue() == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
