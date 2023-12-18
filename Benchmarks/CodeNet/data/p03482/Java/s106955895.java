import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		int min1 = Integer.MAX_VALUE;
		for(int i=0; i<S.length; i++) {
			if(S[i] == '1') {
				if(S.length%2 == 1 && i == S.length/2) {
					if(S.length/2 + 1 < min1) min1 = S.length/2 + 1;
				} else if(i < S.length/2) {
					if(S.length - i - 1 < min1) min1 = S.length - i - 1;
				} else {
					if(i < min1) min1 = i;
				}
			}
		}
		
		for(int i=0; i<S.length; i++) {
			if(S[i] == '0') {
				S[i] = '1';
			} else {
				S[i] = '0';
			}
		}
		
		int min2 = Integer.MAX_VALUE;
		for(int i=0; i<S.length; i++) {
			if(S[i] == '1') {
				if(S.length%2 == 1 && i == S.length/2) {
					if(S.length/2 + 1 < min2) min2 = S.length/2 + 1;
				} else if(i < S.length/2) {
					if(S.length - i - 1 < min2) min2 = S.length - i - 1;
				} else {
					if(i < min2) min2 = i;
				}
			}
		}
		
		System.out.println(Math.max(min1, min2));
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
