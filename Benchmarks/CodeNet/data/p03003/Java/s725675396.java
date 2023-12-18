import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static long mod = 1000000007;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] S = new int[N];
    	for(int i=0; i<N; i++) {
    		S[i] = sc.nextInt();
    	}
    	int[] T = new int[M];
    	for(int i=0; i<M; i++) {
    		T[i] = sc.nextInt();
    	}
    	long[][] dp = new long[N+1][M+1];
    	long[][] ans = new long[N+1][M+1];
    	for(int i=1; i<=N; i++) {
    		for(int j=1; j<=M; j++) {
    			if(S[i-1] == T[j-1]) {
    				ans[i][j] = (1 + dp[i-1][j-1]) % mod;
    			}
    			dp[i][j] = (dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + ans[i][j] + mod) % mod;

    		}
    	}

    	long sum = 0;
    	for(int i=1; i<=N; i++) {
    		for(int j=1; j<=M; j++) {
    			sum = (sum + ans[i][j]) % mod;
    		}
    	}
    	sum = (sum + 1) % mod;
    	System.out.println(sum);
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
