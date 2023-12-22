import java.util.*;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        BigInteger product = new BigInteger("1");
        long limit = (long) Math.pow(10, 18);
      //  System.out.println(limit);
        boolean smaller = true;
        
        for (int i = 1; i <= N; i++) {
            long A_i = scan.nextLong();
            if (A_i == 0) {
                System.out.println(0);
                return;
            }
            
            if (product.compareTo(BigInteger.valueOf(limit)) != 1) {
                product = product.multiply(BigInteger.valueOf(A_i));
            } else {
                smaller = false;
            }
        }

        if(smaller) {
            System.out.println(product);
        } else {
            System.out.println(-1);
        }
    }

}
