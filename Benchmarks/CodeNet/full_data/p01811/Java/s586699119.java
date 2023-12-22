import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	String S;
	int N,A,B,C;

	public boolean dfs(String s){

		if(s.equals("ABC"))return true;

		int a = 0,b = 0,c = 0;
		for(int i = 0;i < s.length();i++){
			if(s.charAt(i)=='A')a++;
			if(s.charAt(i)=='B')b++;
			if(s.charAt(i)=='C')c++;
		}

		{
			StringBuilder sb = new StringBuilder();
			int na = a,nb = b,nc = c;
			for(int i = 0;i < s.length();i++){
				if(i + 2 < s.length() && s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
					sb.append("A");
					nb--;
					nc--;
				}else{
					sb.append(s.charAt(i));
				}
			}

			if((a!=na&&b!=nb&&c!=nc) && sb.length() >= 3 && a > 0 && b > 0 && c > 0){
				if(dfs(sb.toString()))return true;
			}
		}

		{
			StringBuilder sb = new StringBuilder();
			int na = a,nb = b,nc = c;
			for(int i = 0;i < s.length();i++){
				if(i + 2 < s.length() && s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
					sb.append("B");
					na--;
					nc--;
				}else{
					sb.append(s.charAt(i));
				}
			}

			if((a!=na&&b!=nb&&c!=nc) && sb.length() >= 3 && a > 0 && b > 0 && c > 0){
				if(dfs(sb.toString()))return true;
			}
		}

		{
			StringBuilder sb = new StringBuilder();
			int na = a,nb = b,nc = c;
			for(int i = 0;i < s.length();i++){
				if(i + 2 < s.length() && s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
					sb.append("C");
					na--;
					nb--;
				}else{
					sb.append(s.charAt(i));
				}
			}

			if((a!=na&&b!=nb&&c!=nc) && sb.length() >= 3 && a > 0 && b > 0 && c > 0){
				if(dfs(sb.toString()))return true;
			}
		}

		return false;
	}

	public void solve() {
		S = next();
		N = S.length();
		for(int i = 0;i < N;i++){
			if(S.charAt(i) == 'A')A++;
			if(S.charAt(i) == 'B')B++;
			if(S.charAt(i) == 'C')C++;
		}

		if(dfs(S))out.println("Yes");
		else out.println("No");
	}

	public static void main(String[] args) {
		new Thread(null,new Main(),"",64 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}