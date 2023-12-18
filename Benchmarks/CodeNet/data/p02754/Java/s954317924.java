import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        String a = scan.next();
        String b = scan.next();

        BigInteger nb = new BigInteger(n);
        BigInteger ab = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

        if(ab.compareTo(BigInteger.ZERO) == 0) {
        	System.out.println(0);
        	return;
        }
        if(bb.compareTo(BigInteger.ZERO) == 0) {
        	System.out.println(n);
        }
        if(ab.add(bb).compareTo(nb) > 0 && ab.compareTo(nb) <= 0) {
        	System.out.println(ab);
        }
        if(ab.add(bb).compareTo(nb) > 0 && ab.compareTo(nb) >= 0) {
        	System.out.println(n);
        }


        BigInteger div = nb.divide(ab.add(bb));
        BigInteger dif = nb.remainder(ab.add(bb));

        BigInteger ans = div.multiply(ab);

        if(dif.compareTo(BigInteger.ZERO) != 0) {
        	if(dif.compareTo(ab) <= 0) {
        		ans = ans.add(dif);
        	}else {
        		ans = ans.add(ab);
        	}
        }
        System.out.println(ans);
    }
}
