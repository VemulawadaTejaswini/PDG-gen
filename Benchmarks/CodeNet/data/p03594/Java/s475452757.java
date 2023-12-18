import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int d = sc.nextInt();
		
		char[][] ans = new char[H][W];
		if(d%2 == 0) {
			int cnta = 0;
			boolean modea = false;
			for(int i=0; i<H+W-1; i++) {
				if(cnta == d) {
					cnta = 0;
					modea = !modea;
				}
				boolean mode = modea;
				int h;
				int w;
				if(i < W) {
					h = 0;
					w = i;
				} else {
					h = i - (W-1);
					w = W - 1;
				}
				int cnt = 0;
				while(h < H && w >= 0) {
					if(i%4 == 0 || i%4 == 1) {
						if(cnt == d / 2) {
							cnt = 0;
							mode = !mode;
						}
						if(!mode) {
							ans[h][w] = 'R';
						} else {
							ans[h][w] = 'Y';
						}
					} else {
						if(cnt == d / 2) {
							cnt = 0;
							mode = !mode;
						}
						if(!mode) {
							ans[h][w] = 'G';
						} else {
							ans[h][w] = 'B';
						}
					}	
					cnt++;
					h++;
					w--;
				}
				cnta++;
			}
		} else {
			for(int i=0; i<H+W-1; i++) {
				int h;
				int w;
				if(i < W) {
					h = 0;
					w = i;
				} else {
					h = i - (W-1);
					w = W - 1;
				}
				while(h < H && w >= 0) {
					if(i%2 == 0) {
						ans[h][w] = 'R';
					} else {
						ans[h][w] = 'Y';
					}
					h++;
					w--;
				}
			}
		}
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
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
