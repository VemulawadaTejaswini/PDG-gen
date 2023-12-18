import java.util.*;

public class Main {

    static int mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d  = new int[n];
        boolean zeroStart = false;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            d[x]++;
            if(i == 0 && x == 0) zeroStart = true;
            if(max < x) max = x;
        }
        long ans = zeroStart && d[0] == 1 ? 1L : 0L;
        for (int i = 1; i <= max; i++) {
            ans = ans * modPow((long)d[i-1], d[i]) %mod;
        }
        System.out.println(ans);
        sc.close();

    }
    public static long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
    }

}
