import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int A = sc.nextInt() - 1;
    	int B = sc.nextInt() - 1;
    	int C = sc.nextInt() - 1;
    	int D = sc.nextInt() - 1;
    	char[] S = sc.next().toCharArray();
    	if(C < D) {
    		int stone = 0;
    		for(int i=A+1; i<C; i++) {
    			if(S[i] == '#') {
    				stone++;
    				if(stone == 2) {
    					System.out.println("No");
    					return;
    				}
    			} else {
    				stone = 0;
    			}
    		}
    		stone = 0;
    		for(int i=B+1; i<D; i++) {
    			if(S[i] == '#') {
    				stone++;
    				if(stone == 2) {
    					System.out.println("No");
    					return;
    				}
    			} else {
    				stone = 0;
    			}
    		}
    	} else {
    		int stone = 0;
    		boolean flg = false;
    		for(int i=B; i<=D; i++) {
    			if(S[i] == '#') {
    				stone++;
    				if(stone == 2) {
    					System.out.println("No");
    					return;
    				}
    			} else {
    				stone = 0;
    				if(i != 0 && i != N-1) {
    					if(S[i-1] == '.' && S[i+1] == '.') {
    						flg = true;
    					}
    				}
    			}
    		}
    		if(!flg) {
    			System.out.println("No");
				return;
    		}
    		stone = 0;
    		for(int i=A+1; i<C; i++) {
    			if(S[i] == '#') {
    				stone++;
    				if(stone == 2) {
    					System.out.println("No");
    					return;
    				}
    			} else {
    				stone = 0;
    			}
    		}

    	}
    	System.out.println("Yes");

    }

    static void debug(long... args) {
    	if(!DEBUG_FLG) return;
    	boolean flg = false;
    	for(long s : args) {
    		if(flg) System.out.print(" ");
    		flg = true;
    		System.out.print(s);
    	}
    	System.out.println();
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
