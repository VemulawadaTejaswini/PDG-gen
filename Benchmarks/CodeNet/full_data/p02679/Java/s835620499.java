import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Map<List<Long>, List<Long>> mp = new HashMap<>();
        int zero = 0;
        for(int i = 0; i < N; i++) {
            long x = Integer.parseInt(sc.next()), y = Integer.parseInt(sc.next());
            if(x == 0 && y == 0) {
                zero ++;
                continue;
            }
            long g = gcd(x, y);
            x /= g; y /= g;
            if(y < 0) {
                x = -x; y = -y;
            }
            if(y == 0 && x < 0) {
                x = -x;
            }
            
            if(x < 0) {
                long tmp = x;
                x = y; y = -tmp;
                List<Long> lk = new ArrayList<>();
                lk.add(x); lk.add(y);
                if(!mp.containsKey(lk)) {
                    List<Long> lv = new ArrayList<>();
                    lv.add(0L); lv.add(1L);
                    mp.put(lk, lv);
                } else {
                    List<Long> l = mp.get(lk);
                    l.set(1,l.get(1)+1);
                    mp.put(lk, l);
                }
            } else {
                List<Long> lk = new ArrayList<>();
                lk.add(x); lk.add(y);
                if(!mp.containsKey(lk)) {
                    List<Long> lv = new ArrayList<>();
                    lv.add(1L); lv.add(0L);
                    mp.put(lk, lv);
                } else {
                    List<Long> l = mp.get(lk);
                    l.set(0,l.get(0)+1);
                    mp.put(lk, l);
                }
            }
        }
        //System.out.println(mp);
        
        long ans = 1;
        for(List<Long> q : mp.keySet()) {
            List<Long> p = mp.get(q);
            Long s = p.get(0);
            Long t = p.get(1);
            long now = 1;
            now += Math.pow(2, s) - 1;
            now += Math.pow(2, t) - 1;
            now %= 1000000007;
            ans *= now;
            ans %= 1000000007;
        }
        ans -= 1;
        ans += zero;
        System.out.println(ans);
        
    }
    
    public static long gcd(long n1,long n2) {
        if(n2==0) return n1;
        else return gcd(n2,n1%n2);
    }
}
