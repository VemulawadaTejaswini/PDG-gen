import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;

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
public class Main {
	public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<Integer>(10001);
        input.add(-(int)1e9-1);
        FastScanner fs = new FastScanner();
        final long MOD = (long)1e9 + 7;

        int n = fs.nextInt();
        int k = fs.nextInt();
      
        for(int i = 0 ; i < n ; i++){
            input.add(fs.nextInt());
        }

        ArrayList<Long> factorial = new ArrayList<Long>(n);
        factorial.add((long)1);
        long fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact *= i;
            fact %= MOD;
            factorial.add(fact);
        }
        ArrayList<Long> factorialInv = new ArrayList<Long>(n);
        factorialInv.add((long)1);
        factorialInv.add((long)1);
        for(int i = 2 ; i <= n ; i++){
            factorialInv.add(powmod(factorial.get(i),MOD-2,MOD));
        }

        Collections.sort(input);
        long ans = 0;
        for(int i = k ; i <= n ; i++){
            ans = (ans + (((factorial.get(i-1)*factorialInv.get(k-1) % MOD)*factorialInv.get(i-k) % MOD)*input.get(i)% MOD)) % MOD;
        }
        for(int i = 1 ; i <= n-k+1 ; i++){
            ans = (MOD + ans - (((factorial.get(n-i)*factorialInv.get(k-1) % MOD)*factorialInv.get(n-k-i+1) % MOD)*input.get(i)% MOD)) % MOD;
        }

        System.out.println(ans);
    }

    public static long powmod(long a, long n, long mod){
        long res = 1;
        while(n > 0){
            if((n % 2) == 1){
                res = (res * a) % mod;
            }
            a = (a*a) % mod;
            n >>= 1;
        }
        return res;
    }
}