
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		double[] t = new double[N];
		double[] v = new double[N];
		for(int i=0;i<N;i++) {
			t[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			v[i] = sc.nextInt();
		}
		double[] V = new double[N+1];
		V[0] = 0;
		V[N] = 0;
		for(int i=1;i<N;i++) {
			V[i] = Math.min(Math.min(v[i-1], v[i]), V[i-1]+t[i-1]);
		}
//		double t_sum = 0;
		for(int i=N-1;i>0;i--) {
			double V_temp = 100;
			for(int j=i;j<N;j++) {
//				t_sum += t[i];
				V_temp = Math.min(V[j+1]+t[i],V_temp);
			}
			V[i] = Math.min(V[i], V_temp);
		}
		double result=0;
		for(int i=0;i<N;i++) {
			double x = (V[i] + V[i+1] + t[i]) / 2;
			result += (V[i]+Math.min(v[i],x)) * (Math.min(v[i],x)-V[i]) / 2;
			result += Math.min(v[i],x) * (t[i] - 2*Math.min(v[i],x) +V[i] + V[i+1]);
			result += (V[i+1]+Math.min(v[i],x)) * (Math.min(v[i],x)-V[i+1]) / 2;

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

