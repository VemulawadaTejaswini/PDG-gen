import java.util.*;
import java.io.*;

class Main{
    static long MOD=1_000_000_007;
    static HashMap<Long, long[]> pow=new HashMap<>();
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long invSum=0;
        HashMap<Long, Integer> lcm=new HashMap<>();
        for(int i=0;i<n;i++){
            long a=fsc.nextLong();
            invSum+=modinv(a);
            lcm(lcm, a);
        }
        invSum%=MOD;
        fsc.close();
        long ans=invSum;
        for(Map.Entry<Long, Integer> e:lcm.entrySet()){
            long p=e.getKey();
            int i=e.getValue();
            pow.put(p, new long[i+1]);
            ans*=pow(p, i);
            ans%=MOD;
        }
        System.out.println(ans);
    }
    public static long pow(long x, int y){
        if(y==0){
            return 1;
        } else if(y==1){
            return x;
        } else if(pow.get(x)[y]>0){
            return pow.get(x)[y];
        } else{
            long ret=(pow(x, y/2)*pow(x, y-y/2))%MOD;
            pow.get(x)[y]=ret;
            return ret;
        }
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
            if (q > 0){
                primes.put(p, q);
            }
        }
        if (n > 1){
            primes.put(n, 1);
        }
        return primes;
    }
    public static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap){
        for(Map.Entry<Long, Integer> e:bmap.entrySet()){
            long p=e.getKey();
            int i=e.getValue();
            if(amap.containsKey(p)){
                if(i>amap.get(p)){
                    amap.put(p, i);
                }
            } else{
                amap.put(p, i);
            }
        }
        return amap;
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
