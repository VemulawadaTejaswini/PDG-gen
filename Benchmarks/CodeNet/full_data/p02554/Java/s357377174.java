import java.math.BigInteger;
import java.util.*;

public class Main{
    final int MOD = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 1){
            System.out.println(0);
            return;
        }
        long dec = 1;
        for(int i = 0; i < n; i++){
            dec *= 8;
            if(dec > MOD) dec %= MOD;
        }
        long all = 1;
        for(int i = 0; i < n; i++){
            all *= 10;
            if(all > MOD) all %= MOD;
        }
        long dec2 = 1;
        for(int i = 0; i < n; i++){
            dec2 *= 9;
            if(dec2 > MOD) dec2 %= MOD;
        }
        dec2 *= 2;
        if(dec2 > MOD) dec2 %= MOD;
        System.out.println(all - dec2 + dec);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
