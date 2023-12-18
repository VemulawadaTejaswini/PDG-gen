import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	String s;
	char[] chars;
	int N;
	int[][] a;
	ArrayList<Integer>[] indexes;
	public void solve() {
		s = next();
		N = s.length();
		chars = s.toCharArray();
		a = new int[N + 1][26];
		indexes = new ArrayList[26];
		for(int i = 0;i < 26;i++){
			indexes[i] = new ArrayList<Integer>();
		}

		for(int i = 0;i < N;i++){
			indexes[chars[i] - 'a'].add(i);
		}

		for(int i = 0;i < N;i++){
			a[i + 1][chars[i] - 'a']++;
			for(int j = 0;j < 26;j++){
				a[i + 1][j] += a[i][j];
			}
		}
		for(int i = 0;i < 26;i++){
			for(int j = 0;j < indexes[i].size() - 1;j++){
				for(int k = j + 1;k < indexes[i].size();k++){
					int x = indexes[i].get(j);
					int y = indexes[i].get(k);

					if(a[y + 1][i] - a[x][i] > (y - x + 1) / 2){
						out.println((x + 1) + " " + (y + 1));
						return;
					}
				}

			}
		}

		out.println("-1 -1");

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