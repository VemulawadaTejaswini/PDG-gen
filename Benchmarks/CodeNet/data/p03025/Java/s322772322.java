import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static long mod = 1000000007;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	long[] frac = new long[200000];
    	frac[0] = 1;
    	for(int i=1; i<200000; i++) {
    		frac[i] = frac[i-1] * i % mod;
    	}
    	long ans = 0;
    	long ApBdiv = power(A+B, mod-2);
    	for(int i=0; i<=N-1; i++) {
    		long c = frac[N-1+i] * power(frac[N-1], mod-2) % mod * power(frac[i], mod-2) % mod;
    		long pra = c * power(A * ApBdiv % mod, N) % mod * power(B * ApBdiv % mod, i) % mod;
    		long prb = c * power(B * ApBdiv % mod, N) % mod * power(A * ApBdiv % mod, i) % mod;
    		long pr = (pra + prb) % mod;
    		ans = (ans + (pr * (N + i) % mod)) % mod;
    	}
    	ans = ans * 100 % mod * ApBdiv % mod;
    	System.out.println(ans);
    }

    static long power(long m , long n){
    	if(n == 0) {
    		return 1;
    	}else if(n == 1){
            return m;
        }else if(n % 2 == 0){
            long s = power(m, n/2);
            return ( (s % mod) * (s % mod) ) % mod;
        }else{
            return ( (m % mod) * (power(m, n-1) % mod) ) % mod;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
