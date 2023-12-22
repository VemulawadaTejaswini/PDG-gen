import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] w = new int[n];
		int a = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			w[i] = sc.nextInt();
			if(w[i] > a) {
				a = w[i];
			}
			sum += w[i];
		} 
		int b = sum;
		while(true) {
//			System.out.println(a + " " + b);
			
			int c = (a + b) / 2; //???????????§?????????
			
			int track = 0;
			int amount = 0;
			boolean can = true;
			for(int i=0; i<n; i++) {
				if(amount + w[i] > c) {
					track++;
					amount = 0;
				}
				
				if(track == k) {
					a = c + 1;
					can = false;
					break;
				}
				
				amount += w[i];
			}
			
			if(can) {
				b = c - 1;
			}
			
			if(a > b) {
				if(can) {
					System.out.println(c);
				} else {
					System.out.println(c+1);
				}
				break;
			}
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