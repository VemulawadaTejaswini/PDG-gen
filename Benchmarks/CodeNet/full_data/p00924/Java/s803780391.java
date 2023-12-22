import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
 
public class Main {
	final int INF = (int)1e9 + 7;
	int N,M;
	int[] B,P,one,zero;
	public int calc(int n,int[] a,int[] b)
	{
		int ret = 0;
		for(int i = 0;i < N;i++){
			if(a[i] != b[i]){
				boolean find = false;
				for(int j = i + 1;j < N;j++){
					if(a[j] != b[i])continue;
					find = true;
					ret += j - i;
					int copy = a[j];
					
					for(int k = j;k > i;k--){
					
						a[k] = a[k - 1];
					}
					a[i] = copy;
					break;
				}
				if(!find){
					return INF;
				}
			}
		}
		return ret;
		
	}
	
	public void solve() {
		N = nextInt();
		M = nextInt();
		
		B = new int[N];
		P = new int[M];
		for(int i = 0;i < N;i++){
			B[i] = nextInt();
		}
		
		for(int i = 0;i < M;i++){
			P[i] = nextInt();
		}
		one = new int[N];
		zero = new int[N];
		int k = 0;
		for(int i = 0;i < M;i++){
			for(int j = 0;j < P[i];j++){
				one[k + j] = i % 2 == 0 ? 1 : 0;
			}
			k += P[i];
		}
		k = 0;
		for(int i = 0;i < M;i++){
			for(int j = 0;j < P[i];j++){
				zero[k + j] = i % 2 == 0 ? 0 : 1;
			}
			k += P[i];
		}
		int ans = calc(0,Arrays.copyOf(B,N),one);
		ans = Math.min(ans,calc(0,Arrays.copyOf(B,N),zero));
		out.println(ans);
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