import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable {

	int N;
	int[] x;
	int[][] memo;

	public void solve() {
		N = nextInt();
		x = new int[N];
		memo = new int[N+100][N+100];
		for(int i = 0;i < N+100;i++){
			for(int j = 0;j < N+100;j++){
				memo[i][j] = -1;
			}
		}
		int s = -1,t = -1;
		int maxDis = 0;
		for (int i = 2; i <= N; i++) {
			if(memo[1][i] == -1){
				out.println(String.format("? %d %d", 1, i));
				out.flush();
				int d = nextInt();
				memo[1][i] = d;
			}

			if(maxDis < memo[1][i]){
				maxDis = memo[1][i];
				s = i;
			}

			if(maxDis == N-1){
				s = 1;
				t = i;
				break;
			}
		}
		if(maxDis != N-1){
			for(int i = 1;i <= N;i++){
				if(i == s)continue;
				if(memo[Math.min(s, i)][Math.max(s,i)] == -1){
					out.println(String.format("? %d %d", i, s));
					out.flush();
					int d = nextInt();
					memo[Math.min(s, i)][Math.max(s,i)] = d;
				}
				if(memo[Math.min(s,i)][Math.max(s,i)] == N-1){
					t = i;
					break;
				}
			}
		}

		x[0] = s;
		x[N-1] = t;

		for (int i = 2; i <= N; i++) {
			if (i == x[0] || i == x[N - 1])
				continue;
			if(memo[Math.min(x[0],i)][Math.max(x[0],i)] == -1){
				out.println(String.format("? %d %d", x[0], i));
				out.flush();
				int d = nextInt();
				memo[Math.min(x[0], i)][Math.max(x[0],i)] = d;
			}
			x[memo[Math.min(x[0],i)][Math.max(x[0],i)]] = i;
		}
		out.print("!");
		for (int i = 0; i < N; i++) {
			out.print(" "+x[i]);
		}
		out.println();
		out.flush();
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
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