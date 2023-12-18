import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt()-1;
		}
		int[] dp = new int[N];
        for(int i=0; i<N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
         
        for(int i=0; i<N; i++) {
            int l = 0;
            int r = N-1;
            int m = 0;
            while(l <= r) {
                m = (l + r) / 2;
                if(dp[m] >= P[i]) {
                    if(m-1 >= 0 && dp[m-1] < P[i]) {
                        break;
                    } else {
                        r = m-1;
                    }
                } else {
                    if(m+1 <= N-1 && dp[m+1] >= P[i]) {
                        m++;
                        break;
                    } else {
                        l = m+1;
                    }
                }
            }
             
//          System.out.println(m + " " + i);
            dp[m] = P[i];
        }
         
        int i=0;
        for(; i<N; i++) {
            if(dp[i] == Integer.MAX_VALUE) {
                break;
            }
        }
        System.out.println(N - i + 1);
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
