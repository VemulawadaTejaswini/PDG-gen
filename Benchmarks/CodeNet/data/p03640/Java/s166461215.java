import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		
		int[][] grid = new int[H][W];
		int i = 0;
		int j = 0;
		for(int k=0; k<N; k++) {
			for(int l=0; l<a[k]; l++) {
				grid[i][j] = k;
				if(i%2 == 0) {
					if(j == W-1) {
						i++;
					} else {
						j++;
					}
				} else {
					if(j == 0) {
						i++;
					} else {
						j--;
					}
				}
			}
 		}
		
		StringBuilder ans = new StringBuilder();
		for(i=0; i<H; i++) {
			for(j=0; j<W; j++) {
				ans.append(grid[i][j] + 1);
				if(j != W-1) ans.append(" ");
			}
			ans.append("\n");
		}
		System.out.print(ans);
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
