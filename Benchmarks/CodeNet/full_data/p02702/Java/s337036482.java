import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        BigInteger a = BigInteger.ZERO;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+4; j < s.length()+1; j++) {
                a = new BigInteger(s.substring(i, j));
                if (a.remainder(new BigInteger("2019")).equals(BigInteger.ZERO)) count++;
            }
        }
        System.out.println(count);

    }
}
