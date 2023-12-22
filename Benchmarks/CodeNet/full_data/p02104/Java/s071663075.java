import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main implements Runnable {

	int N;
	int[] P;

	public void solve(){
		N = nextInt();
		P = new int[N];
		for(int i = 0;i < N;i++){
			P[i] = nextInt()-1;
		}

		boolean[] used = new boolean[N];
		int[] ans = new int[N];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		for(int i = 0;i < N;i++){
			q.add(i);
		}
		while(q.size() > 0){
			int n = q.poll();

			if(!used[P[n]]){
				used[P[n]] = true;
				ans[P[n]] = n;
				continue;
			}
			P[n]++;
			if(P[n] >= N)P[n] = 0;
			q.add(n);
		}

		for(int i = 0;i < N;i++){
			out.println(ans[i]+1);
		}
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