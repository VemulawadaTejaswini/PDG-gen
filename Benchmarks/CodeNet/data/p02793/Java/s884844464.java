import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            long l = sc.nextLong();
            li.add(l);
            map = fact(l,map);
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
    
    static HashMap<Long,Long> fact(long l, HashMap<Long,Long> map) {
        long cnt = 0;
        while (l % 2 == 0) {
            cnt++;
            l /= 2;
        }
        if(cnt != 0 &&(!map.containsKey(2L) || map.get(2L) < cnt)){
            map.put(2L,cnt);
        }
        long d = 3;
        long q = l / d;
        while (q >= d) {
            cnt = 0;
            while(l % d == 0) {
                cnt++;
                l /= d;
            }
            if(cnt != 0 && (!map.containsKey(d) || map.get(d) < cnt)){
                map.put(d,cnt);
            }
            d += 2;
            q = l / d;
        }
        if(l != 1 && !map.containsKey(l)){
            map.put(l,1L);
        }
        return map;
    }
}
