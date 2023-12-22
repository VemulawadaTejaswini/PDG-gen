import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws java.lang.Exception
    {
        String b = "1000000000000000000";
        BigInteger big = new BigInteger(b);
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        BigInteger f = new BigInteger("1");
        for (int i = 0; i < t; i++) {
            String  a = scanner.next();
            f = f.multiply(new BigInteger(a));
        }


            if (f.intValue()>big.intValue()) {
                System.out.println(-1);
            } else {
                System.out.println(f);
            }


    }
}