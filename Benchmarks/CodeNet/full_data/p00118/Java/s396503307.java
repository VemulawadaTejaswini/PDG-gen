import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	int H,W;
	int[] dy = {1,-1,0,0};
	int[] dx = {0,0,1,-1};
	public void solve() {
		while(true){
			H = nextInt();
			W = nextInt();

			if(H + W == 0)break;
			char[][] ch = new char[H][];
			for(int i = 0;i < H;i++){
				ch[i] = next().toCharArray();
			}

			boolean[][] used = new boolean[H][W];
			int ans = 0;
			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					if(used[i][j])continue;
					ans++;
					Queue<Integer> q = new ArrayDeque<Integer>();
					q.add(i * 100 + j);
					while(q.size() > 0){
						int point = q.poll();
						int y = point / 100;
						int x = point % 100;
						if(used[y][x])continue;
						used[y][x] = true;

						for(int k = 0;k < 4;k++){
							int ny = dy[k] + y;
							int nx = dx[k] + x;
							if(ny < 0 || nx < 0 || ny >= H || nx >= W)continue;
							if(ch[i][j] != ch[ny][nx])continue;
							q.add(ny * 100 + nx);
						}
					}
				}
			}
			out.println(ans);
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