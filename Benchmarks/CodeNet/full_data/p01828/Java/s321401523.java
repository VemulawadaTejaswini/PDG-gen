import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	int N;
	String A,B;
	char[] a,b;
	
	public boolean dfs(int n,int x,int y,int m)
	{
		if(n == N)return true;
		boolean ret = false;
		
		if(m == 0){
			for(int i = x;i < N;i++){
				if(a[i] == a[n]){
					ret = dfs(n + 1,i + 1,y,1);
					
					if(ret)return true;
				}
			}
		}else{
			for(int i = y;i < N;i++){
				if(b[i] == a[n]){
					ret = dfs(n + 1,x,i + 1,0);
					
					if(ret)return true;
				}
			}
		}
		return false;
	}
	
    public void solve() {
		A = next();
		B = next();
		a = A.toCharArray();
		b = B.toCharArray();
		N = A.length();
		
		if(dfs(0,0,0,0) || dfs(0,0,0,1)){
			out.println("Yes");
		}else{
			out.println("No");
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