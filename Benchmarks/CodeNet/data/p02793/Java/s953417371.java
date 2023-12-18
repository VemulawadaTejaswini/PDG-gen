import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            map = factorization(map,a[i]);
        }
        long ans = 0;
        for(long b : a){
            long tmp = 1;            
            for(Map.Entry<Long,Integer> e : map.entrySet()){
                long k = e.getKey();
                int v = e.getValue();
                long cnt = 0;
                while(b % k == 0){
                    cnt++;
                    b /= k;
                }
                tmp *= (long)Math.pow(k,v-cnt)%mod;
            }
            ans += tmp;
            ans %= mod;
        }
        System.out.println(ans);
    }
    
    static HashMap<Long,Integer> factorization(HashMap<Long,Integer> ret, long x) {
        int div2 = 0;
        while (x % 2 == 0) {
            x /= 2;
            div2++;
        }
        if(div2 != 0){
            if(ret.containsKey(2L)){
                ret.put(2L, Math.max(ret.get(2L),div2));
            }else{
                ret.put(2L, div2);
            }
            
        }
        long d = 3;
        while (x/d >= d) {
            int cnt = 0;
            while (x % d == 0) {
                cnt++;
                x /= d;
            }
            if(cnt != 0){
                if(ret.containsKey(d)){
                    ret.put(d, Math.max(ret.get(d),cnt));
                }else{
                    ret.put(d, cnt);
                }   
            }
            d += 2;
        }
        if(x != 1 && !ret.containsKey(x)){
            ret.put(x, 1);
        }
        return ret;
    }
}