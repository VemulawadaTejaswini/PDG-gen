import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        String S = sc.next();
        String T = sc.next();
        long k = N*M/(gcd(N,M));
        long NtoM = k/N;
        long MtoN = k/M;
        if (S.charAt(0) != T.charAt(0)) {
            System.out.println(-1);
            return;
        }
        for (int i = 1; MtoN*i < S.length() && NtoM*i < T.length(); i++) {
            if (S.charAt((int)MtoN*i) != T.charAt((int)NtoM*i)) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(k);
    }
    
    private static long gcd(long a, long b) {
        long tmp = a % b;
        long ans = 0;
        if (tmp == 0) {
            ans = b;
        } else {
            ans = gcd(b, tmp);
        }
        return ans;
    }
    
}
