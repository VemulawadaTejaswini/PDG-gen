import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int N = sc.nextInt();
		int S = sc.nextInt();

		int sum = 0;
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			sum += sc.nextInt();
			A[i] = sum;
		}

		int min = Integer.MAX_VALUE;
		for(int i=1; i<N; i++) {
			if(A[i] - A[0] < S) {
				continue;
			}

			int j = i - 1;
			boolean flag = false;
			while(j >= 0 && i - j < min) {
				if(A[i] - A[j] >= S) {
					flag = true;
					break;
				}
				j--;
			}

			if(flag) {
				min = i - j;
			}
		}

		if(min == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(min);
		}

	}

	static class FastScanner {
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
    }
}