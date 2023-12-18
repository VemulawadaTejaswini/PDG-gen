import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        long H = sc.nextLong();
        long W = sc.nextLong();
        sc.close();

        if (H > 1 && W > 1) {
            BigInteger n1 = new BigInteger(String.valueOf((H - 1) / 2 + 1));
            BigInteger n2 = new BigInteger(String.valueOf(H / 2));

            n1 = n1.multiply(new BigInteger(String.valueOf(W / 2 + W % 2)));
            n2 = n2.multiply(new BigInteger(String.valueOf(W / 2)));

            BigInteger sum = new BigInteger("0");
            sum = sum.add(n1);
            sum = sum.add(n2);

            System.out.println(sum);
        }else{
            System.out.println(1);
        }
    }
}