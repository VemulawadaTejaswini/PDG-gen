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
                    
        System.out.println((calc(ways, 0, 0)+MOD-1)%MOD);
    }
    static int digitSum(int x){
        int sum = 0;
        while(x>0){
            sum += x%10;
            x/=10;
        }
        return sum;
    }
    static long calc(long[][] ways, int idx, int rem){
        if(idx == s.length())return rem == 0?1:0;
        int dig = s.charAt(idx)-'0';
        long ans = 0;
        for(int di = 0; di < dig; di++){
            int digits = n-idx-1;
            int remainder = (D-(rem+di)%D)%D;
            ans += ways[remainder][digits];
            if(ans >= MOD)ans -= MOD;
        }
        ans += calc(ways, idx+1, (rem+dig)%D);
        if(ans >= MOD)ans -= MOD;
        return ans;
    }
}