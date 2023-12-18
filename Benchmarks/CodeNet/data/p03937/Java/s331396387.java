import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int H,W;
	char[][] ch;
	boolean[][] passed;
	int[] dx = {1,0};
	int[] dy = {0,1};

	public boolean check(){
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if(ch[i][j] == '#' && !passed[i][j]){
					return false;
				}
			}
		}
		return true;
	}

	public boolean dfs(int y,int x){
		if(y == H - 1 && x == W - 1){
			return check();
		}
		boolean ret = false;

		if(y + 1 < H && ch[y + 1][x] == '#'){
			passed[y + 1][x] = true;
			ret |= dfs(y + 1,x);
			passed[y + 1][x] = false;
		}
		if(x + 1 < W && ch[y][x + 1] == '#'){
			passed[y][x + 1] = true;
			ret |= dfs(y,x + 1);
			passed[y][x + 1] = false;
		}
		return ret;
	}

	public void solve() {
		H = nextInt();
		W = nextInt();

		ch = new char[H][];
		for(int i = 0;i < H;i++){
			ch[i] = next().toCharArray();
		}

		passed = new boolean[H][W];
		passed[0][0] = true;
		if(dfs(0,0)){
			out.println("Possible");
		}else{
			out.println("Impossible");
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