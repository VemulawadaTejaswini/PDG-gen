import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());
        sc.close();

        for (int i=new Double(Math.sqrt(N.doubleValue())).intValue(); i>0; i--) {
            if (N.mod(new BigInteger(Integer.toString(i))).compareTo(BigInteger.ZERO)==0) {
                System.out.println(N.divide(new BigInteger(Integer.toString(i))).add(new BigInteger(Integer.toString(i-2))));
                break;
            }
        }
    }
}