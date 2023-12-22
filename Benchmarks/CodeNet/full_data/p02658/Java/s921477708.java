import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
            BigInteger f = new BigInteger("1");
            for (int i = 0; i < t; i++) {
                 String  a = scanner.next();
                 f = f.multiply(new BigInteger(a));
            }
            if (f.toString().length()>=19){
                System.out.println(-1);
            }else {
                System.out.println(f);
            }


    }
}