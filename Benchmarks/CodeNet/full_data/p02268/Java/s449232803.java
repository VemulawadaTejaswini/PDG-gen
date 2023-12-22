import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] S = new int[n];
		for(int i=0; i<n; i++) {
			S[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		
		int cnt = 0;
		for(int i=0; i<q; i++) {
			int T = sc.nextInt();
			
			int a = 0;
			int b = n-1;
			if(binarySearch(S, T, a, b)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	static boolean binarySearch(int[] S, int T, int a, int b) {
		int c = (a + b) / 2;
		if(T < S[c]) {
			b = c - 1;
			if(b < a) {
				return false;
			} else {
				return binarySearch(S, T, a, b);
			}
		} else if(T > S[c]) {
			a = c + 1;
			if(b < a) {
				return false;
			} else {
				return binarySearch(S, T, a, b);
			}
		} else {
			return true;
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