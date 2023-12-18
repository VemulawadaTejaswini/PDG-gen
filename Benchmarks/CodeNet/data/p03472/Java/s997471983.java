import java.math.*;
import java.util.*;
 // im dumb
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        long max_a = -1L;
        for( int i = 0; i < n; i++ ) {
            a[i] = in.nextLong();
            b[i] = in.nextLong();
            max_a = Math.max(max_a, a[i]);
        }
        BigInteger ct = new BigInteger(0+"");
        Arrays.sort(b);
        for( int i = n-1; i >=0; i-- ) {
            if(b[i] > max_a) {k -= b[i]; ct = ct.add(new BigInteger(1+""));}
            else break;
        }
        BigDecimal dc = (new BigDecimal(k+"")).divide(new BigDecimal(max_a+""), RoundingMode.UP);
        ct = ct.add(dc.toBigInteger());
        System.out.println(ct.toString());
    }
}