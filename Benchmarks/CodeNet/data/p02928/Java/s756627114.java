import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] a = new long[(int)n];
        for(long i = 0; i < n; i++){
            a[(int)i] = sc.nextLong();
        }
        long ans = 0;
        for(long i = 0; i < n; i++){
            for(long j = i-1; j >= 0; j--){
                if(a[(int)i] > a[(int)j]){
                    ans += ((k-1)*k)/2%mod;
                    ans %= mod;
                }
            }
            for(long j = i+1; j < n; j++){
                if(a[(int)i] > a[(int)j]){
                    ans += k*(k+1)/2%mod;
                    ans %= mod;
                }
            }
        }
        System.out.println(ans);
    }
}
