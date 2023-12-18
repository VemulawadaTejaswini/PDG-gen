import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int[] h = new int[N];
		for(int i=0; i<N; i++) {
			h[i] = sc.nextInt();
		}
		
		int l = 0;
		int r = 1000000000;
		while(l != r) {
			int[] h1 = new int[N];
			for(int i=0; i<N; i++) {
				h1[i] = h[i];
			}
			int m = (l + r) / 2;
			for(int i=0; i<N; i++) {
				h1[i] -= B * m;
			}
			long cnt = 0;
			for(int i=0; i<N; i++) {
				if(h1[i] > 0) {
					cnt += (h1[i] - 1) / (A - B) + 1;
				}
			}
			if(cnt <= m) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		
		System.out.println(l+1);
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
