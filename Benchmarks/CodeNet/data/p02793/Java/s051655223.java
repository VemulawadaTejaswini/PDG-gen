import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HashMap<Long,Long>> li = new ArrayList<HashMap<Long,Long>>();
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        for(int i = 0; i < n; i++){
            long l = sc.nextLong();
            HashMap<Long,Long> tmp = new HashMap<Long,Long>();
            tmp = fact(l,tmp);
            for (Map.Entry<Long,Long> e : tmp.entrySet()) {
                long k = e.getKey();
                long ev = e.getValue();
                if(!map.containsKey(k) || map.get(k) < ev){
                    map.put(k,ev);
                }
            }
            li.add(tmp);
        }
        long ans = 0;
        for(HashMap<Long,Long> hm : li){
            long tmp = 1;
            for (Map.Entry<Long,Long> e : map.entrySet()) {
                long k = e.getKey();
                long ev = e.getValue();
                if(hm.containsKey(k)){
                    tmp *= rep2(k, ev-hm.get(k), mod);
                    tmp %= mod;
                }else{
                    tmp *= rep2(k, ev, mod);
                    tmp %= mod;
                }
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
        map.put(2L,cnt);
        long d = 3;
        long q = l / d;
        while (q >= d) {
            cnt = 0;
            while(l % d == 0) {
                cnt++;
                l /= d;
            }
            map.put(d,cnt);
            d += 2;
            q = l / d;
        }
        if(l != 1){
            map.put(l,1L);
        }
        return map;
    }
}

