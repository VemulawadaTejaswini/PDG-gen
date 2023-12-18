import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args){
        long MOD = 7 + (long)1e9;

        FastScanner sc = new FastScanner();
        int n = sc.nextInt();

        int[] primelist = new int[100000];
        int primeNum = 0;
        for(int i = 2 ; i < 1_000_000 ; i++){
            boolean isP = true;
            int sq = (int)Math.sqrt(i);
            for(int k = 2 ; k <= sq ; k++){
                if((i%k) == 0){
                    isP = false;
                    break;
                }
            }
            if(isP){
                primelist[primeNum] = i;
                primeNum++;
            }
        }

        int[] a = new int[10000];
        for(int i= 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        int[] m = new int[100000];
        for(int i = 0 ; i < n ; i++){
            int tar = a[i];
            int p = 0;
            while(tar > 1){
                int pT = 0;
                int pNow = primelist[p];
                while((tar%pNow) == 0){
                    pT++;
                    tar /= pNow;
                }
                if(m[p] < pT){
                    m[p] = pT;
                }

                p++;
            }
        }

        int[] pL = new int[100000];
        int pLNum = 0;
        for(int i = 0 ; i < 100000 ; i++){
            if(m[i] > 0){
                pL[pLNum] = i;
                pLNum++;
            }
        }

        long ans = 0;
        long GCM = 1;
        for(int p = 0 ; p < pLNum ; p++){
            for(int k = 0 ; k < m[pL[p]] ; k++){
                GCM = (GCM*primelist[pL[p]]) % MOD;
            }
        }
        for(int i = 0 ; i < n ; i++){
            long b = GCM;
            b = (b * modinv(a[i],MOD)) % MOD;

            ans = (ans + b) % MOD;
        }

        System.out.println(ans);
    }

    public static long modinv(long a, long mod) {// x / a (mod MOD):=  x*= modinv(a,MOD)
        long b = mod, u = 1, v = 0;
        long buf = 0;
        while (b>0) {
            long t = a / b;
            a -= t * b;
            buf = a;
            a = b;
            b = buf;
            u -= t * v;
            buf = u;
            u = v;
            v = buf;
        }
        u %= mod;
        if (u < 0) u += mod;
        return u;

    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
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
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}