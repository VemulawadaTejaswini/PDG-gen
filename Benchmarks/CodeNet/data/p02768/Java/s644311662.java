import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = rep2(2,n,mod)-1;
        long alla = 1;
        long allb = 1;
        long diva = 1;
        long divb = 1;
        for(int i = 0; i < a; i++){
            alla *= (n-i);
            alla %= mod;
            diva *= (a-i);
            diva %= mod;
        }
        for(int i = 0; i < b; i++){
            allb *= (n-i);
            allb %= mod;
            divb *= (b-i);
            divb %= mod;
        }
        alla *= rep2(diva,(long)Math.pow(10,9)+5,mod)%mod;
        alla %= mod;
        allb *= rep2(divb,(long)Math.pow(10,9)+5,mod)%mod;
        allb %= mod;
        ans -= (alla+allb);
        while(ans < 0){
            ans += mod;
        }
        System.out.println(ans%mod);
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2,mod)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
}
