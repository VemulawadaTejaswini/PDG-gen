import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        int[] ary;
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = (n/(a+b))*a;
        n %= a+b;
        if(n < a){
            ans += n;
        }else{
            ans+=a;
        }
        System.out.println(ans);
        
    }
}

