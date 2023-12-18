import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int M = sc.nextInt();
    	int K = sc.nextInt();
    	if(M == 0) {
    		System.out.println("0 0");
    		return;
    	}
    	if(M == 1) {
    		if(K == 0) {
    			System.out.println("0 0 1 1");
    		} else if(K == 1) {
    			System.out.println(-1);
    		} else {
    			System.out.println(-1);
    		}
			return;
    	}
    	if(K >= Math.pow(2, M)) {
    		System.out.println(-1);
    		return;
    	}
    	StringBuilder ans = new StringBuilder();
    	ans.append(K);
    	for(int i=0; i<Math.pow(2, M); i++) {
    		if(i == K) continue;
    		ans.append(" ");
    		ans.append(i);
    	}
    	ans.append(" ");
		ans.append(K);
    	for(int i=(int)Math.pow(2, M)-1; i>=0; i--) {
    		if(i == K) continue;
    		ans.append(" ");
    		ans.append(i);
    	}
    	System.out.println(ans);
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
