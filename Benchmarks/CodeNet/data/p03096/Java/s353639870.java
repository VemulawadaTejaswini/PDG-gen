import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static long MOD = 1000000007;
    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int[] C = new int[N];
    	int[] lastClrIdx = new int[200001];
    	int[] lastPairIdx = new int[N];
    	for(int i=0; i<200001; i++) {
    		lastClrIdx[i] = -1;
    	}
    	for(int i=0; i<N; i++) {
    		lastPairIdx[i] = -1;
    	}
    	for(int i=0; i<N; i++) {
    		C[i] = sc.nextInt();
    		if(lastClrIdx[C[i]] != -1) {
    			lastPairIdx[i] = lastClrIdx[C[i]];
    		}
    		lastClrIdx[C[i]] = i;
    	}
    	long[] dp = new long[N];
    	dp[0] = 1;
    	for(int i=1; i<N; i++) {
    		dp[i] = dp[i-1];
    		if(lastPairIdx[i] != -1 && i - lastPairIdx[i] != 1) {
    			dp[i] = (dp[i] + dp[lastPairIdx[i]]) % MOD;
    		}
    		//System.out.println(i + " " + dp[i]);
    	}
    	System.out.println(dp[N-1]);
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
