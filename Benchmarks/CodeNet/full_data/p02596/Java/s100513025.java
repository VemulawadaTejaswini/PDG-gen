import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //   int k = Integer.parseInt(sc.next());
        BigInteger k = new BigInteger(sc.next());

        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("7");

        BigInteger two = new BigInteger("2");
        if (k.remainder(two).compareTo(BigInteger.ZERO) == 0) {
            System.out.println("-1");
        } else {
            while (true) {
                count++;
                BigInteger num = new BigInteger(sb.toString());
                if (num.remainder(k).compareTo(BigInteger.ZERO) == 0) {
                    break;
                }
                sb.append("7");
            }
            System.out.println(count);
        }
        sc.close();
    }
}
