import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num2019 = BigInteger.valueOf(2019L);

        String s = scanner.next();
        List<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > (i + 4); j--) {
                String sub = s.substring(i, j);
                BigInteger num = new BigInteger(sub);
                if (num.mod(num2019).longValue() == 0) {
                    list.add(num);
                }
            }
        }
        System.out.println(list.size());

    }

}