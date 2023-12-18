import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        long gcd = sc.nextInt();
        int max = (int)gcd;
        
        for (int i = 0; i < n - 1; i++) {
            long num = sc.nextInt();
            max = Math.max(max, (int)num);
            gcd = gcd(gcd, num);
        }
        
        if (target <= max && target % gcd == 0) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}
