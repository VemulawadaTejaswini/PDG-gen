import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	int N,W,H;
	int[] row,col;

	public void solve() {
		N = nextInt();
		W = nextInt();
		H = nextInt();
		row = new int[H + 1];
		col = new int[W + 1];

		for(int i = 0;i < N;i++){
			int x = nextInt();
			int y = nextInt();
			int w = nextInt();

			row[Math.max(0,y - w)]++;
			row[Math.min(H, y + w + 1)]--;

			col[Math.max(0, x - w)]++;
			col[Math.min(W, x + w + 1)]--;
		}

		for(int i = 0;i < H;i++){
			row[i + 1] += row[i];
		}

		for(int i = 0;i < W;i++){
			col[i + 1] += col[i];
		}

		boolean okRow = true;
		boolean okCol = true;
		for(int i = 0;i < H;i++){
			if(row[i] <= 0){
				okRow = false;
				break;
			}
		}

		for(int i = 0;i < W;i++){
			if(col[i] <= 0){
				okCol = false;
				break;
			}
		}
		if(okRow || okCol){
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