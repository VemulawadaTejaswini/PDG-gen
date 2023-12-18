
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[][] x= new int[N][N],y=new int[N][N];
		int[][] evidence = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				evidence[i][j] = -1;
			}
		}
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			for(int j=0;j<A[i];j++) {
				evidence[i][sc.nextInt()-1] = sc.nextInt();
			}
		}


		int result = 0;
		boolean flag = false;

		for(int i=0;i<(1<<N);i++) {
			flag = false;
			for(int j=0;j<N;j++) {
				if((i&(1<<j))!=0) {
					for(int k=0;k<N;k++) {
						int ins = (i&(1<<k))!=0 ? 1: 0;
						if(evidence[j][k] != -1 && evidence[j][k] != ins) {
							flag = true;
						}
					}
				}
			}
			if(!flag) result = Math.max(result, Integer.bitCount(i));
		}

//						for(int i=0;i<N;i++) {
//							for(int j=0;j<N;j++) {
//								out.println("evidence["+i+"]["+j+"]"+evidence[i][j]);
//							}
//						}
		out.println(result);

		out.flush();
	}


}

class FastScanner {
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
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}

