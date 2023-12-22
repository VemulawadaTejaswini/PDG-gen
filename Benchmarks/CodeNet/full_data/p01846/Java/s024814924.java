import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	String S;
	String[] split;
	Character[][] board;
	int a,b,c,d;
	public void solve() {
		while(true){
			S = next();

			if(S.equals("#"))break;

			split = S.split("/");
			a = nextInt() - 1;
			b = nextInt() - 1;
			c = nextInt() - 1;
			d = nextInt() - 1;

			board = new Character[split.length][];
			for(int i = 0;i < split.length;i++){
				char[] chars = split[i].toCharArray();
				ArrayList<Character> list = new ArrayList<Character>();
				for(char c : chars){
					if(c == 'b'){
						list.add('b');
					}else{
						for(int j = 0;j < c - '0';j++){
							list.add('.');
						}
					}
				}
				board[i] = (Character[])list.toArray(new Character[0]);
			}

			board[a][b] = '.';
			board[c][d] = 'b';

			StringBuilder sb = new StringBuilder();
			for(int i = 0;i < split.length;i++){
				if(i != 0)sb.append("/");
				int j = 0;
				for(;j < board[i].length;){
					if(board[i][j] == 'b'){
						sb.append(board[i][j]);
						j++;
					}else{
						int cnt = 0;
						while(j < board[i].length && board[i][j] == '.'){
							cnt++;
							j++;
						}
						sb.append(cnt);
					}
				}
			}
			out.println(sb);
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