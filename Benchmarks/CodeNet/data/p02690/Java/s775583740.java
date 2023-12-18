import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 0;i < 100000;i++){
            long x = pow(i,5);
            for(int j = 0;j < 100000;j++){
                long y = pow(j,5);
                if(x <= n){
                    if(x+y==n){
                        System.out.println(i+" "+j);
                        return;
                    }
                }else{
                    if(x-y==n){
                        System.out.println(i+" "+-1*j);
                        return;
                    }
                }
            }
        }
    }
    static long pow(long a, long n) {
        long ans = 1;
        long m = n;
        while (m > 0) {
            if ((m & 1) == 1)
                ans = ans * a;
            a = a * a;
            m >>= 1;
        }
        return ans;
    }
    
}
