import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static final long MOD = 1000000007;

    public static long pow(long a, long n){
        if(n == 0){return 1L;}
        if(n == 1){return a;}
        long res = n/2;
        long rem = n%2;
        long p = pow(a, res) % MOD;
        return (p*p*pow(a, rem)) % MOD;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        List<SoInsu> llist = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            llist.add(new SoInsu(sc.nextLong()));
        }
        SoInsu result = llist.stream().reduce(
                new SoInsu(1L),
                (a, b)->
                    SoInsu.LCM(a,b)
                );
        long ans = llist.stream().map(p->result.waru(p)).collect(Collectors.summingLong(Long::longValue));
        System.out.println(ans % 1000000007);
    }

    public static class SoInsu{
        Map<Long, Long> mp = new HashMap<>();
        public SoInsu(long a){
            for(long i=2;i<=a;i++){
                if(a % i == 0){
                    a /= i;
                    long cnt=mp.computeIfAbsent(i, (val)-> 0L);
                    mp.put(i, cnt+1);
                    i--;
                }
            }
            if(a != 1){
                mp.put(a, 1L);
            }
        }
        public SoInsu(){}

        public static SoInsu LCM(SoInsu a, SoInsu b){
            SoInsu ret = new SoInsu();
            for(Long k: a.mp.keySet()){
                if(b.mp.containsKey(k)){
                    ret.mp.put(k, Math.max(a.mp.get(k), b.mp.get(k)));
                }else{
                    ret.mp.put(k, a.mp.get(k));
                }
            }
            for(Long k: b.mp.keySet()){
                if(ret.mp.containsKey(k)){
                    ret.mp.put(k, Math.max(a.mp.get(k), b.mp.get(k)));
                }else{
                    ret.mp.put(k, b.mp.get(k));
                }
            }
            return ret;
        }

        public long waru(SoInsu p){
            long res = 1;
            for(Long k:mp.keySet()){
                long s =mp.get(k);
                if(p.mp.containsKey(k)){
                    s -= p.mp.get(k);
                }
                res *= pow(k, s);
                res %= MOD;
            }
            return res;
        }

        @Override
        public String toString(){
            return mp.toString();
        }
    }
}
