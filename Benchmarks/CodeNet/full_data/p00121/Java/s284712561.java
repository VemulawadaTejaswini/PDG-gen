import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	boolean[] used;
	int[] dy = {0,0,1,-1};
	int[] dx = {1,-1,0,0};
	private class P{
		int x,y;
		public P(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	public void solve() {
		while(hasNext()){
			int n = 0;
			for(int i = 0;i < 8;i++){
				int m = nextInt();
				for(int j = 7 - i;j > 0;j--){
					m *= 10;
				}
				n += m;
			}
			Queue<P> q = new ArrayDeque<P>();
			used = new boolean[100000000];
			q.add(new P(n,0));
			while(q.size() > 0){
				P p = q.poll();

				int x = p.x;
				int y = p.y;

				if(used[x])continue;
				used[x] = true;
				if(x == 1234567){
					out.println(y);
					break;
				}

				int[][] a = new int[2][4];
				int py = 0;
				int px = 0;
				for(int i = 7;i >= 0;i--){
					a[i / 4][i % 4] = x % 10;
					if(a[i / 4][i % 4] == 0){
						py = i / 4;
						px = i % 4;
					}
					x/=10;
				}
				for(int i = 0;i < 4;i++){
					int ny = py + dy[i];
					int nx = px + dx[i];
					if(ny < 0 || nx < 0 || ny >= 2 || nx >= 4)continue;
					int tmp = a[py][px];
					a[py][px] = a[ny][nx];
					a[ny][nx] = tmp;
					int m = 0;
					for(int j = 0;j < 8;j++){
						int b = a[j / 4][j % 4];
						for(int k = 7 - j;k > 0;k--){
							b *= 10;
						}
						m += b;
					}
					q.add(new P(m,y + 1));
					tmp = a[py][px];
					a[py][px] = a[ny][nx];
					a[ny][nx] = tmp;
				}
			}
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