import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] r = new int[n+1];
		
		for(int i=0; i<n+1; i++) {
			r[i] = sc.nextInt();
			if(i < n-1) {
				sc.nextInt();
			}
		}
		
		int[][] A = new int[n][n];
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {	
				A[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=1; i<=n-1; i++) {
			for(int j=0; j<n-i; j++) {
				for(int k=j; k<j+i; k++) {
					int temp = A[j][k] + A[k+1][j+i] + r[j]*r[k+1]*r[j+i+1];
					if(temp < A[j][j+i]) {
						A[j][j+i] = temp;
					}
					
//					System.out.println(j + " " + (j+i) + " " + k + " " + temp + " " + A[j][j+i]);
				}
			}
		}
		
		System.out.println(A[0][n-1]);
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