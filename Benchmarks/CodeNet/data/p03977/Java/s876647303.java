import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
 
import java.util.*;
public class Main {
	int T,N,D;
	public void solve(){
		T = nextInt();
		for(int i = 0;i < T;i++){
			N = nextInt();
			D = nextInt();
			
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			pq.add(D);
			for(int j = 0;j < N - 1;j++){
				int d = pq.poll();
				pq.add(127);
				pq.add(d ^ 127);
			}
			int sum = 0;
			while(pq.size() > 0){
				sum += pq.poll();
			}
			
			out.println(sum);
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