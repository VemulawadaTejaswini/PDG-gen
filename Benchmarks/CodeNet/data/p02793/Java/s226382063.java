import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        ArrayList<Long> pl = getPrimeList(99997);
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            long l = sc.nextLong();
            li.add(l);
            for(long p : pl){
                if(l < p) break;
                long cnt = 0;
                while(l % p == 0){
                    l /= p;
                    cnt++;
                }
                if(map.containsKey(p)){
                    map.put(p,Math.max(map.get(p),cnt));
                }else{
                    map.put(p,cnt);
                }
            }
        }
        long ans = 0;
        for(long v : li){
            long tmp = 1;
            for (Map.Entry<Long,Long> e : map.entrySet()) {
                long k = e.getKey();
                long ev = e.getValue();
                long cnt = 0;
                if(v != 1){
                    while(v % k == 0){
                        cnt++;
                        v /= k;
                    }
                }
                tmp *= rep2(k,ev-cnt, mod);
                tmp %= mod;
            }
            ans += tmp;
            ans %= mod;
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
    
    private static ArrayList<Long> getPrimeList(long l){
        ArrayList<Long> ret = new ArrayList<Long>();
        if(l < 2) return ret;
        ret.add(2L);
        long len = (long)Math.pow(l,0.5)+1;
        for(long i = 3; i < len; i += 2){
            boolean bool = true;
            for(long p : ret){
                if(i % p == 0){
                    bool = false;
                    break;
                }
            }
            if(bool) ret.add(i);
        }
        return ret;
    }
}
