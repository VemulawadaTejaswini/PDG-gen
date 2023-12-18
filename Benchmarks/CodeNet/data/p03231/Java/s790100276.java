import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[]$) {
        Scanner c=new Scanner(System.in);
        int n=c.nextInt(),m=c.nextInt(),gcd=BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        String s=c.next(),t=c.next();
        System.out.println(java.util.stream.IntStream.range(0,gcd).filter(k->s.charAt(k*n/gcd)!=t.charAt(k*m/gcd)).mapToLong(k->-1).findAny().orElse(n*m/gcd));
    }
}