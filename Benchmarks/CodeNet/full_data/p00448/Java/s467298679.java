import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	int R,C,N;
	int[][] table;

	public int dfs(int r){
		if(r == R){

			for(int j = 0;j < C;j++){
				int black = 0;
				int white = 0;
				for(int i = 0;i < R;i++){
					if(table[i][j] == 0){
						black++;
					}else{
						white++;
					}
				}

				if(black > white){
					for(int i = 0;i < R;i++){
						if(table[i][j] == 0){
							table[i][j] = 1;
						}else{
							table[i][j] = 0;
						}
					}
				}
			}
			int black = 0;
			int white = 0;
			for(int i= 0;i < R;i++){
				for(int j = 0;j < C;j++){
					if(table[i][j] == 0){
						black++;
					}else{
						white++;
					}
				}
			}

			return Math.max(black, white);
		}

		int ret = dfs(r + 1);

		int[] copy = Arrays.copyOf(table[r], C);
		for(int i = 0;i < C;i++){
			if(table[r][i] == 0){
				table[r][i] = 1;
			}else{
				table[r][i] = 0;
			}
		}

		ret = Math.max(ret,dfs(r + 1));
		table[r] = copy;
		return ret;
	}

	public void solve() {
		while(true){
			R = nextInt();
			C = nextInt();

			if(R + C == 0)break;

			table = new int[R][C];
			for(int i = 0;i < R;i++){
				for(int j = 0;j < C;j++){
					table[i][j] = nextInt();
				}
			}
			out.println(dfs(0));
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