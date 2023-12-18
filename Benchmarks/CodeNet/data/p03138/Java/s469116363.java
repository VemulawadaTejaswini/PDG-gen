import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long k = s.nextLong();
        long pow = maxPowerOfTwo(k);
        long ans = 0;
        while(n > 0) {
            n--;
            long ele = s.nextLong();
            ans += (pow ^ ele);
        }
        System.out.println(ans);
    }

    static long maxPowerOfTwo(long n) {
        if(n == 0) {
            return 0;
        }
        long pow = 1;
        while(pow <= n) {
            pow <<= 1;
        }
        return pow >> 1;
    }
}
