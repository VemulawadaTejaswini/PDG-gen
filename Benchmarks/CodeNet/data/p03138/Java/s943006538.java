import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        List<Long> ai = new ArrayList<Long>(n) {{
            for( int i=0; i<n; i++) {
                add( sc.nextLong());
            }
        }};
        int strlen= Long.toBinaryString(Collections.max(ai)).length();
        int klen = Long.toBinaryString(k).length();
        if( klen > strlen ) strlen = klen;
        long unit = 1L;
        long x = 0L;
        long fx = 0L;
        for( int i=0; i<strlen; i++ ) {
            // count 1
            int one = 0;
            for( int j=0; j<n; j++ ) {
                long a = ai.get(j);
                one += (int)(a & 1L);
                ai.set(j,a>>1);
            }
            int zero = n - one;
            if( zero>one && k>=x+unit ) {
                fx += unit * zero;
                x+= unit;
            } else {
                fx += unit * one;
            }
            unit *= 2;
        }
        System.out.println(fx);
    }
}