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
        String s = sc.next();
        String t = sc.next();
        String tmp = t.substring(0, t.length()-1);
        if(s.equals(tmp)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
