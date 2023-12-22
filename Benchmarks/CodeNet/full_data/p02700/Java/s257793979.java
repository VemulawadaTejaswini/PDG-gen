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
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            int ac = n/s+(n%s==0?0:1);
            int bc = t/m+(t%m==0?0:1);
            if(ac >= bc){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
    }
    
}
