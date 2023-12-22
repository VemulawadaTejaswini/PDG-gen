import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();

        long mod = (long) Math.pow(10, 9) + 7;
        long all = powmod(10, s, mod);
        long nothing0 = powmod(9, s, mod);
        long nothing9 = powmod(9, s, mod);
        long nothingBoth = powmod(8, s, mod);
        long nothingOne = (nothing0 + nothing9 - nothingBoth);


        System.out.println((all - nothingOne)%mod);

    }

    public static long powmod(long x, long y, long mod) {
        long total = 1;
        for (int i = 0; i < y; i++) {
            total = (total*x) % mod;
        }
        return total;
        
    }
}