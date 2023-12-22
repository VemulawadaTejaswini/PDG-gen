import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(power(n, m));
     }
     
     static long power(long x, int p) {
         if (p == 0) {
             return 1;
         }
         if (p % 2 == 0) {
             return power(x * x % MOD, p / 2);
         } else {
             return power(x, p - 1) * x % MOD;
         }
     }
}
