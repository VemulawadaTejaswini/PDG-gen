import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);
    long MOD = 1000000007;

    long[] l = new long[1001];
    void solve(){
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            fn(i);
        }
        long ans = 1;
        for(int i = 2; i <= n; i++){
            ans = ans * (l[i] + 1) % MOD;
        }
        System.out.println(ans);
    }

    void fn(int x){
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                fn(i);
                fn(x / i);
                return;
            }
        }
        l[x]++;
    }

    public static void main(String[] args){
       new Main().solve();    
    }
}