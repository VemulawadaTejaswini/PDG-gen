import java.util.*;

public class Main{
    final long mod = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        long ans = 0;
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < n - 1; i++){
            sum -= a[i];
            ans += a[i] * sum;
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
