import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        BigInteger a = BigInteger.ZERO;
        int count = 0;
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+4; j < s.length()+1; j++) {
                String s1 = s.substring(i, j);
                if (h.contains(s1)) {
                    count++;
                    continue;
                }
                a = new BigInteger(s1);
                if (a.remainder(new BigInteger("2019")).equals(BigInteger.ZERO)) {
                    count++;
                    h.add(s1);
                }
            }
        }
        System.out.println(count);

    }
}
