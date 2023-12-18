import java.util.*;
import java.text.*;

public class Main {
    static long MOD = (long)1e9+7;
    static String s;
    static int n, D;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        s = in.next();
        D = in.nextInt(); n = s.length();
        long[][] ways = new long[D][1+n];
        ways[0][0] = 1;
        for(int c = 0; c < n; c++)
            for(int di = 0; di < D; di++)
                for(int nxt = 0; nxt < 10; nxt++)
                    ways[(di+nxt)%D][c+1] = (ways[(di+nxt)%D][c+1]+ ways[di][c])%MOD;
                    
        long ans = MOD-1;
        int rem = 0;
        for(int idx = 0, digits = n-1; idx < n; idx++, digits--){
            int dig = s.charAt(idx)-'0';
            for(int di = 0; di < dig; di++){
                int remainder = (D-(rem+di)%D)%D;
                ans += ways[remainder][digits];
                if(ans >= MOD)ans -= MOD;
            }
            rem = (rem+dig)%D;
        }
        System.out.println(ans);
    }
}