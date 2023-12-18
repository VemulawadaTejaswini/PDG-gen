import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	static final int INF = (int)1e9+7;
	char[] s;
	int N;

	public void solve(){
		s = next().toCharArray();
		N = s.length;

		int ans = INF;

		for(int i = 0;i < 26;i++){

			List<Integer> list = new ArrayList<>();
			list.add(-1);
			for(int j = 0;j < N;j++){
				if(s[j] == 'a' + i){
					list.add(j);
				}
			}

			if(list.size() == 1)continue;

			int max = 0;
			for(int j = 0;j < list.size()-1;j++){
				max = Math.max(max,list.get(j+1)-list.get(j)-1);
			}
			max = Math.max(max,N - list.get(list.size()-1)-1);
			ans = Math.min(ans,max);
		}

		out.println(ans == INF ? 0 : ans);
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