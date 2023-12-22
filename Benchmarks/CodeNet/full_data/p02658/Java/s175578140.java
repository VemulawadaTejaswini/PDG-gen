import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<BigInteger> list = new ArrayList<>();
        BigInteger zero = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            BigInteger bi = sc.nextBigInteger();
            if (bi.equals(zero)) {
                System.out.println(0);
                return;
            }
            list.add(bi);
        }

        BigInteger a, b, c;
        a = new BigInteger("1");
        c = new BigInteger("1000000000000000000");

        for (int i = 0; i < n; i++) {
            b = list.get(i);
            a = a.multiply(b);
            if (a.compareTo(c) > 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(a);
    }
}
