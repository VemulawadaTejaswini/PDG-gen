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
            int one = 0;
            for( int j=0; j<n; j++ ) {
                long a = ai.get(j);
                one += (int)(a & 1L);
                ai.set(j,a>>1);
            }
            int zero = n - one;
            if( zero>one && k>=x+unit ) {
                fx += unit * (long)zero;
                x+= unit;
            } else {
                fx += unit * (long)one;
            }
            unit *= 2L;
        }
        System.out.println(fx);
    }
}
