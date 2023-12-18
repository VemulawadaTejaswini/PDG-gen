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
		long sum1 = 0;
		long sum2 = 0;
		for(int i=0; i<N; i++) {
			h[i] = sc.nextInt();

			sum1 += (h[i] - 1) / A + 1;
			sum2 += (h[i] - 1) / B + 1;
		} 
		
		long l = sum1 / N;
		long r = sum2 / N;
		while(l < r) {
			long m = (l + r) / 2; 
//			System.out.println(l + " " + m + " " + r);
			long cnt = 0;
			for(int i=0; i<N; i++) {
				if(h[i] - B * m > 0) {
					cnt += (h[i] - B * m - 1) / (A - B) + 1;
				}
			}
			if(cnt <= m) {
				cnt = 0;
				for(int i=0; i<N; i++) {
					if(h[i] - B * (m - 1) > 0) {
						cnt += (h[i] - B * (m - 1) - 1) / (A - B) + 1;
					}
				}
				if(cnt > (m-1)) {
					l = m;
					break;
				} else {
					r = m - 1;
				}
			} else {
				l = m + 1;
			}
		}
		
		System.out.println(l);
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
