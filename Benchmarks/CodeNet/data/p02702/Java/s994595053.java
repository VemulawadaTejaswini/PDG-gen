import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int result = 0;
        BigInteger num = BigInteger.valueOf(2019);
        if (S.length() < 4) {
            System.out.println(0);
            return;
        }

        for (int i = 4; i < S.length(); i++) {
            for (int j = 0; j < S.length() - i + 1; j++) {
                BigInteger a = new BigInteger(S.substring(j, j + i));
                if (a.remainder(num) == BigInteger.ZERO) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}