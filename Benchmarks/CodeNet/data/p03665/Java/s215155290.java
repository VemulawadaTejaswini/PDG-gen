import java.util.*;

public class Main {
    static long MOD = 188172829231L;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        int odds = 0;
        int evens = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        
        long evens_ans = 0;
        for (int i = 0; i <= evens; i++) {
            evens_ans += nCk(evens, i);
        }
        
        long odds_ans = 0;
        if (p == 0) {
            for (int i = 0; i <= odds; i += 2) {
                odds_ans += nCk(odds, i);
            }
        } else {
            for (int i = 1; i <= odds; i += 2) {
                odds_ans += nCk(odds, i);
            }
        }
        
        long ans = evens_ans * odds_ans;
        System.out.println(ans);
        
        
        
        // p = 0
        // 偶数を0~evens個選ぶ、奇数を2,4,odds個選ぶ
        // p=1
        // 偶数を0~evens個選ぶ、奇数を1,3,odds個選ぶ
    }
    
    public static long nCk(int n, int k) {
        if (k > n - k) return nCk(n, n - k);
    
        long res = 1;
        for (int i = n; i > n - k; i--) {
            res *= i;
        }
        for (int i = 1; i <= k; i++) {
            res /= i;
        }
        
        // System.out.println(res);
        return res;
    }
}
