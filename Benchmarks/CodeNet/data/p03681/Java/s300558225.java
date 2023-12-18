import java.util.*;

public class Main{
    final int MOD = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if(Math.abs(n - m) >= 2){
            System.out.println(0);
            return;
        }
        long out = 1;
        for(int i = 1; i <= n; i++){
            out *= i;
            if(out > MOD) out %= MOD;
        }
        for(int i = 1; i <= m; i++){
            out *= i;
            if(out > MOD) out %= MOD;
        }
        if(n == m) System.out.println((out * 2) % MOD);
        else System.out.println(out % MOD);
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
