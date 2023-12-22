import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long mod = 1000000007;
        long[] p2 = new long[1000000];
        p2[0] = 1;
        for(int i=1; i<1000000; i++) {
            p2[i] = p2[i-1]*2;
            p2[i] %= mod;
        }

        Map<String, Integer> mapa = new HashMap<>();
        Map<String, Integer> mapb = new HashMap<>();

        boolean zero = false;
        int zn = 0;
        for(int i=0; i<n; i++) {
            long xx = sc.nextLong();
            long yy = sc.nextLong();
            if(xx == 0 && yy == 0) {
               zn++;
            } else if (xx == 0) {
                yy = 1;
            } else if (yy == 0) {
                xx = 1;
            } else {
                long gcd = gcd(Math.abs(xx), Math.abs(yy));
                xx /= gcd;
                yy /= gcd;
                if(xx < 0) {
                    xx = -xx;
                    yy = -yy;
                }
            }
            x[i] = xx;
            y[i] = yy;
        }
        for(int i=0; i<n; i++) {
            if(x[i]==0 && y[i] == 0) {
                continue;
            }
            if(y[i] > 0) {
                String key = key(x[i], y[i]);
                mapa.put(key, mapa.getOrDefault(key, 0)+1);
                mapb.put(key, mapb.getOrDefault(key, 0));
            } else {
                String key = key(-y[i], x[i]);
                mapa.put(key, mapa.getOrDefault(key, 0));
                mapb.put(key, mapb.getOrDefault(key, 0)+1);
            }
        }
        long res = 1;
        for(String key : mapa.keySet()) {
            int a = mapa.get(key);
            int b = mapb.get(key);
            if(a == 0 || b == 0) {
                res *= p2[a+b];
                res %= mod;
            } else {
                long c = (p2[a] + p2[b] - 1 + mod) % mod;
                res *= c;
                res %= mod;
            }
        }

        res += mod - 1;
        res += zn;
        res %= mod;

        System.out.println(res);
    }

    static private String key(long x, long y) {
        if(x >= 0) {
            return x + ":" + y;
        } else {
            return -x + ":" + (-y);
        }
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}