import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import java.util.Arrays;

public class AOJ_1600 {
	
	int N,nMin,nMax;
	public void solve() {
		while(true){
			N = nextInt();
			nMin = nextInt();
			nMax = nextInt();
			
			if(N + nMin + nMax == 0)break;
			
			int[] p = new int[N];
			
			for(int i = 0;i < N;i++){
				p[i] = nextInt();
			}
			
			int gap = 0;
			int num = 0;
			
			for(int i = nMin;i <= nMax;i++){
				if(gap <= p[i - 1] - p[i]){
					gap = p[i - 1] - p[i];
					num = i;
				}
			}
			
			out.println(num);
		}
	}
 
	public static void main(String[] args) {
		out.flush();
		new AOJ_1600().solve();
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