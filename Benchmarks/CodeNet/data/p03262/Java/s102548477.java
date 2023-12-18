import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long d = in.nextLong(); in.nextLine();
        String[] tmp = in.nextLine().split(" ");
        long[] ary = new long[n];
        for( int i = 0; i < n; i++ ) ary[i] = Math.abs(Long.parseLong(tmp[i])-d);
        long ans = ary[0];
        for( long L : ary ) {
            ans = gcd(ans,L);
        }
        System.out.println(ans);
    }
    static long gcd(long a, long b) {
        if( b == 0 ) return a;
        return gcd(b,a%b);
    }
}