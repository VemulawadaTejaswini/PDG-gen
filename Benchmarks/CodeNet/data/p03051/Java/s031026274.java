//package TaskE;

import java.io.FileInputStream;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    long N;
    long[] A;
    long XOR = 0;
    static long M = (long)1e9 + 7;

    Map<Long,Long> mp = new HashMap<>();

    long mpow(long a, long n){
        if(n==0) return 1;
        long r = mpow(a, n/2);
        r = (r * r)%M;
        if(n%2==1) r = r * a;
        return r % M;
    }

    void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = new long[(int)N];
        long res = 0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextLong();
            XOR = XOR ^ A[i];
            if(!mp.containsKey(XOR)){
                mp.put(XOR, 0L);
            }
            mp.put(XOR, mp.get(XOR)+1);
        }

        if(XOR == 0){
            for(long a : mp.keySet()){
                long n = mp.get(a);
                if(a!=0) res += mpow(2, n/2);
                else res += mpow(2, n-1);
                res %= M;
            }

        }else{
            long n = mp.get(XOR);
            res = mpow(2, n/2);
            res = res % M;

        }
        System.out.println(res);


    }

    public static void main(String[] args) throws Exception{
        //System.setIn(new FileInputStream("inputs/e.in"));
        Main s = new Main();
        s.solve();
    }
}
