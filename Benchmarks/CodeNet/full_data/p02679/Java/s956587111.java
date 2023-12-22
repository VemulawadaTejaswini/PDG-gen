import java.util.*;
import java.io.*;
 
public class Main {
    static long mod = 1000000007;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Map<List<Long>, List<Integer>> mp = new HashMap<>();
        int zero = 0;
        
        for(int i = 0; i < N; i++) {
            String[] sp = br.readLine().split(" ");
            long x = Long.parseLong(sp[0]), y = Long.parseLong(sp[1]);
            if(x == 0 && y == 0) {
                zero ++;
                continue;
            }
            long g = gcd(x, y);
            x /= g; y /= g;
            if(x <= 0) {
                long tmp = x;
                x = y; y = -tmp;
                List<Long> lk = new ArrayList<>();
                lk.add(x); lk.add(y);
                if(!mp.containsKey(lk)) {
                    List<Integer> lv = new ArrayList<>();
                    lv.add(0); lv.add(1);
                    mp.put(lk, lv);
                } else {
                    List<Integer> l = mp.get(lk);
                    l.set(1,l.get(1)+1);
                    mp.put(lk, l);
                }
            } else {
                List<Long> lk = new ArrayList<>();
                lk.add(x); lk.add(y);
                if(!mp.containsKey(lk)) {
                    List<Integer> lv = new ArrayList<>();
                    lv.add(1); lv.add(0);
                    mp.put(lk, lv);
                } else {
                    List<Integer> l = mp.get(lk);
                    l.set(0,l.get(0)+1);
                    mp.put(lk, l);
                }
            }
        }
        // System.out.println(mp);
        
        long ans = 1;
        for(List<Long> q : mp.keySet()) {
            List<Integer> p = mp.get(q);
            int s = p.get(0);
            int t = p.get(1);
            long now = 1;
            now += modPow(2, s) - 1;
            now += modPow(2, t) - 1;
            now = mod(now);
            ans *= now;
            ans = mod(ans);
        }

        ans += zero;
        ans -= 1;
        ans = mod(ans);
        System.out.println(ans);
        
    }
    
    public static long gcd(long n1,long n2) {
        if(n2==0) return n1;
        else return gcd(n2,n1%n2);
    }
    
    public static long modPow(long n1, long n2) {
        long p = 1;
        for(int i = 0; i < n2; i++) {
            p *= n1;
            p = mod(p);
        }
        return p;
    }
    
    public static long mod(long n) {
        long m = n % mod;
        if(m < 0) {
            m += mod;
        }
        return m;
    }
    
}