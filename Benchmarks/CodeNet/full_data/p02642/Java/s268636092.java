import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	//java11

	public static void main(String[] args) {

		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();

		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int ans = 0;
		Arrays.sort(A);
		boolean[] judges = new boolean[N];
		Arrays.fill(judges, true);
		boolean containsOne = false;
		for(int i=0; i<N; i++) {

			if(!judges[i]) {
				if(i+1 < N && A[i+1] == A[i]) {
					judges[i+1] = false;
//					System.out.println((i+1) + ": " + judges[i+1]);
				}
				continue;
			}

			if(!containsOne && isPrime(A[i])) {
				if(i+1 < N && A[i+1] == A[i]) {
					judges[i] = false;
					judges[i+1] = false;
				}
			}else {
				if(A[i] == 1)
					containsOne = true;

				for(int j=0; j<Math.min(i+2, N); j++) {
					if(i == j)
						continue;

					if(A[i] % A[j] == 0) {
//						System.out.println(A[i] + "%" + A[j]);
						judges[i] = false;
						break;
					}
				}
			}

//			System.out.println("judges: " + judges[i]);
			if(judges[i]) {
//				System.out.println("i=" + i);
				ans++;
			}
		}

		System.out.println(ans);
	}

	//高速な素数判定(O(√n))
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;

		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}

		return true;
	}

	public static class FastScanner {
	    private InputStream in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    public FastScanner(InputStream in) {
	    	this.in = in;
	    }

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
	    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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

	    public int nextInt() {
	        if (!hasNext()) throw new NoSuchElementException();
	        int n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }

	    public long nextLong() {
	        if (!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	}
}
