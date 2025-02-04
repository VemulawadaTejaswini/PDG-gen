import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		
		for(int i=0; i<q; i++) {
			int m = sc.nextInt();
			
			if(exhaustiveSearch(A, m, 0, 0)){
				System.out.println("yes");
				continue;
			} else {
				System.out.println("no");
			}
		}
	}
	
	static boolean exhaustiveSearch(int[] A, int m, int sum, int idx) {
		for(int i=idx; i<A.length; i++) {
			System.out.println(sum + " " + idx + " " + i);
			if(sum + A[i] == m) {
				return true;
			} else if(sum + A[i] < m) {
				if(exhaustiveSearch(A, m, sum + A[i], i+1)) {
					return true;
				}
			}
		}
		
		return false;
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