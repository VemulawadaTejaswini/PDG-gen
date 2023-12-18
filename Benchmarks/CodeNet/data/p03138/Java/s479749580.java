import java.util.*;

public class pD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        List<Long> ai = new ArrayList<Long>(n) {{
            for (int i = 0; i < n; i++) {
                add(sc.nextLong());
            }
        }};
        //
        int strlen = Long.toBinaryString(k).length();
        for( long a : ai ) {
            int tmp = Long.toBinaryString(a).length();
            if( tmp > strlen ) strlen = tmp;
        }
        //
        int nh = n/2 + n%2;
        long ans = 0L;
        boolean isSmall = false;
        int j = strlen-1;
        long unit = Math.round(Math.pow(2, j));
        for (int i = 0; i < strlen; i++) {
            int one = 0;
            for (long a : ai) {
                one += (a >> j) & 1L;
            }

            boolean flag = ( (k>>j )&1L )==1L;
            if( one >= nh ) {
                ans += unit * one;
                if( flag ) isSmall = true;
            } else {
                if( !flag & !isSmall ) {
                    ans += unit * (long)one;
                } else {
                    ans += unit * (long)(n-one);
                }
            }
            j--;
            unit /= 2L;
        }
        System.out.println(ans);
    }
}