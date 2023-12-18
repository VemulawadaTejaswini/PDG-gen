import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {

	int H,W,N;
	int[] a;

	public void solve() {
		H = nextInt();
		W = nextInt();
		N = nextInt();

		a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < N;i++){
			for(int j = 0;j < a[i];j++){
				list.add(i + 1);
			}
		}


		int[][] map = new int[H][W];
		int index = 0;

		for(int i = 0;i < H;i++){

			if(i % 2 == 0){
				for(int j = 0;j < W;j++){
					map[i][j] = list.get(index++);
				}
			}else{
				for(int j = W-1;j >= 0;j--){
					map[i][j] = list.get(index++);
				}
			}
		}

		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if(j != 0)out.print(" ");
				out.print(map[i][j]);
			}
			out.println();
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