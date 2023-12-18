import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
    
        boolean isOdd = (n & 1) == 1;
        int num = 0;
        for(int i = 0; i < n; i++) {
            num = sc.nextInt();

            if(isOdd && ((num & 1) == 1)) {
                System.out.println(0);
                return;
            } else if(!isOdd && ((num & 1) == 0)) {
                System.out.println(0);
                return;
            }
            
            times[num]++;
            if(times[num] > 2 || times[0] == 2) {
                System.out.println(0);
                return;
            }
        }
    
        long ans = 1;
		for(int i = 0; i < n/2; i++)
		    ans = 2 * ans % 1000000007;
		System.out.println(modPow(2L, n / 2));
    }
    static int MOD = 1000000007;
    static long modPow(long x, long n) {
        long res = 1L;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return res;
    }
}
