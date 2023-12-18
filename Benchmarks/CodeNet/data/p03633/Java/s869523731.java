import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        
        long[] t = new long[N];
        
        t[0] = Long.parseLong(sc.next());
        long ans = t[0];
        if(N > 1) {
            t[1] = Long.parseLong(sc.next());
            ans = t[0] / saiyaku(t[1], t[0]) * t[1];
            for(int i=2; i<N; i++) {
                t[i] = Long.parseLong(sc.next());
                ans = t[i] / saiyaku(t[i], ans) *ans;
            }
        }
        System.out.println(ans);
        
        
    }
    
    //最大公約数
    public static long saiyaku(long a, long b) {
        if(a < b) return saiyaku(b, a);
        if(b == 0) return a;
        long w = b;
        a = a % b;
        b = w;
        return saiyaku(a, b);
    }
}
