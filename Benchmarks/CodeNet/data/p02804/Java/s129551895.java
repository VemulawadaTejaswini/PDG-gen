import java.util.*;
import java.io.*;

class Main{
    static long[] comb;
    static long MOD=1_000_000_007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int k=fsc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=fsc.nextLong();
        }
        fsc.close();
        Arrays.sort(a);
        comb=new long[n];
        for(int i=k-1;i<n;i++){
            if(i==k-1){
                comb[i]=comb(i, k-1, MOD);
            } else{
                comb[i]=(((comb[i-1]*i)%MOD)*modinv(i-k+1, MOD))%MOD;
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=(comb[i]*a[i])%MOD;
            ans-=(comb[n-i-1]*a[i])%MOD;
            ans%=MOD;
            if(ans<0){
                ans+=MOD;
            }
        }
        System.out.println(ans);
    }

    public static long modinv(long a, long MOD) {
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

    public static long comb(long n, long r, long MOD) {
        if (n < r){
            return 0;
        }
        r = Math.min(r, n - r);
        long res = 1;
        for (int d = 1; d <= r; d++) {
            res *= n;
            res %= MOD;
            n--;
            res *= modinv(d, MOD);
            res %= MOD;
        }
        return res;
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
