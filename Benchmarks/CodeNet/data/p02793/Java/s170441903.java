import java.util.*;
import java.io.*;

class Main{
    static long MOD=1_000_000_007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long invSum=0;
        HashMap<Long, Integer> lcm=new HashMap<>();
        for(int i=0;i<n;i++){
            long a=fsc.nextLong();
            invSum+=modinv(a);
            lcm=lcm(lcm, a);
        }
        invSum%=MOD;
        fsc.close();
        long ans=invSum;
        for(long p:lcm.keySet()){
            int indx=lcm.get(p);
            for(int i=0;i<indx;i++){
                ans*=p;
                ans%=MOD;
            }
        }
        System.out.println(ans);
    }
    public static long modinv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a;
            a = b;
            b = tmp1;
            u -= t * v;
            long tmp2 = u;
            u = v;
            v = tmp2;
        }
        u %= MOD;
        return u >= 0 ? u : u + MOD;
    }
    public static HashMap<Long, Integer> primeFactorization(long n) {
        HashMap<Long, Integer> primes = new HashMap<Long, Integer>();
        for (long p = 2; p <= Math.ceil(Math.sqrt(n)); p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0)
                primes.put(p, q);
        }
        if (n > 1)
            primes.put(n, 1);
        return primes;
    }
    public static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap){
        HashMap<Long, Integer> lcmmap=new HashMap<>();
        for(long p:amap.keySet()){
            if(bmap.containsKey(p)){
                lcmmap.put(p, Math.max(amap.get(p), bmap.get(p)));
                bmap.remove(p);
            } else{
                lcmmap.put(p, amap.get(p));
            }
        }
        lcmmap.putAll(bmap);
        return lcmmap;
    }
    public static HashMap<Long, Integer> lcm(long a, long b){
        HashMap<Long, Integer> amap=primeFactorization(a);
        HashMap<Long, Integer> bmap=primeFactorization(b);
        return lcm(amap, bmap);
    }
    public static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, long b){
        HashMap<Long, Integer> bmap=primeFactorization(b);
        return lcm(amap, bmap);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
            }
        return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
