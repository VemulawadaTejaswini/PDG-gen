import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String B = sc.next();
        long B1 = 0L;
        long B2 = 0L;
        boolean flag = false;
        for(int i=0; i<B.length(); i++) {
            switch(B.charAt(i)) {
                case '.':
                    flag = true;
                    break;
                default:
                    if(flag) {
                        B2 = B2 * 10 + (B.charAt(i) - '0');
                    } else {
                        B1 = B1 * 10 + (B.charAt(i) - '0');
                    }
                    break;
            }
        }
        BigInteger AA = new BigInteger(String.format("%d", A * 100L));
        BigInteger BB = new BigInteger(String.format("%d", B1 * 100L + B2));
        BigInteger rr = AA.multiply(BB);
        BigInteger ss = rr.divide(new BigInteger("10000"));
        System.out.println(ss.toString());
    }
}
