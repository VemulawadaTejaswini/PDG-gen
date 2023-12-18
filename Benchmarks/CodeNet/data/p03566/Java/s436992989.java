import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] t = new int[N];
		int[] v = new int[N];
		for(int i=0;i<N;i++) {
			t[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			v[i] = sc.nextInt();
		}
		int[] t_sum = new int[N+1];
		double[] V = new double[N+1];
		V[0] = 0;
		V[N] = 0;
		t_sum[0] = 0;
		for(int i=1;i<N+1;i++) {
			t_sum[i] = t_sum[i-1] + t[i-1];
		}
		for(int i=1;i<N;i++) {
			V[i] = Math.min(Math.min(v[i-1], v[i]), V[i-1]+t[i-1]);
		}
		double result=0;
		for(int i=0;i<N;i++) {
			if(v[i]<V[i]+t[i]) {
				result += (V[i]+v[i]) * (v[i]-V[i]) / 2;
				result += v[i] * (t[i] - 2*v[i] +V[i] + V[i+1]);
				result += (V[i+1]+v[i]) * (v[i]-V[i+1]) / 2;
			}
			else {
				result += (Math.max(V[i+1], V[i])-Math.min(V[i+1], V[i])) * t[i] / 2;
			}
		}

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

