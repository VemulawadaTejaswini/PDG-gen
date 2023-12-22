import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int W = sc.nextInt();
		ArrayList<Integer> v = new ArrayList<>();
		ArrayList<Integer> w = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int va = sc.nextInt();
			int wa = sc.nextInt();
			int m = sc.nextInt();
			int k = 1;
			int sum = 0;
			while(k <= m/2) {
				v.add(va*k);
				w.add(wa*k);
				sum += k;
				k *= 2;
			}
			v.add(va*(m - sum));
			w.add(wa*(m - sum));
		}
		
		int[] dp = new int[W+1];
		for(int i=0; i<v.size(); i++) {
			for(int j=W; j>=0; j--) {
				if(j-w.get(i) >= 0 && dp[j-w.get(i)] + v.get(i) > dp[j]) {
					dp[j] = dp[j-w.get(i)] + v.get(i);
				}
			}
		}
		
		int max = 0;
		for(int j=0; j<=W; j++) {
			if(dp[j] > max) {
				max = dp[j];
			}
		}
		System.out.println(max);
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