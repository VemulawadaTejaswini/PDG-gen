import java.util.*;
import java.math.*;
class Main
 {
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if((Integer.valueOf(s) & 1) == 0) {
            System.out.println("-1");
            return;
        }
        int count = 1;
        StringBuilder sevens = new StringBuilder("7");
        BigInteger b;
        BigInteger divisor = new BigInteger(s);
        BigInteger zero = new BigInteger("0");
        while(count <= 1e6) {
            b = new BigInteger(sevens.toString());
            BigInteger m = b.mod(divisor);
            if(m.compareTo(zero) == 0) {
                System.out.println(count);
                return;
            }
            count++;
            sevens.append("7");
        }
        System.out.println("-1");
	 }
}