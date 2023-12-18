import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 1;
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        for(long i = 2; i <= n; i++){
            map = factorization(map,i);
        }
        for(Map.Entry<Long,Integer> e : map.entrySet()){
            if(e.getKey() == 1){
                continue;
            }
            ans *= (e.getValue()+1);
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
                ret.put(2L, ret.get(2L)+div2);
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
                    ret.put(d, ret.get(d)+cnt);
                }else{
                    ret.put(d, cnt);
                }   
            }
            d += 2;
        }
        if(ret.containsKey(x)){
            ret.put(x, ret.get(x)+1);
        }else{
            ret.put(x, 1);
        }
        return ret;
    }
}

