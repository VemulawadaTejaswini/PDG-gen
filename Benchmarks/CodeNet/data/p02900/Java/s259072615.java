import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long gcd = gcd(a, b);
        long gcd2 = gcd;
        long answer = 1;
        
        for (long i = 2; i <= Math.sqrt(gcd2); i++) {
            if (gcd % i == 0) {
                answer++;
                while (gcd % i == 0) {
                    gcd /= i;
                }
            }
        }
        
        System.out.println(answer);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}
