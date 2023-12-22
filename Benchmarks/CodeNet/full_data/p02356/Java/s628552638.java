import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	int N,Q;
	int[] a,x;
    public void solve() {
		 N = nextInt();
		 Q = nextInt();
		 
		 a = new int[N];
		 x = new int[Q];
		 
		 for(int i = 0;i < N;i++){
		 	a[i] = nextInt();
		 }
		 
		 for(int i = 0;i < Q;i++){
		 	x[i] = nextInt();
		 }
		 
		 for(int i = 0;i < Q;i++){
		 	int right = 0;
			long sum = 0;
			int count = 0;
			for(int left = 0;left < N;left++){
				while(right < N && sum + a[right] <= x[i]){
					sum += a[right];
					right++;
				}
				count += (right - left);
				sum -= a[left];
			}
			
			out.println(count);
		 }
    }
 
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}
		/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}