import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	int H,W,N;
	int[] a,b;
	Set<P> color,point;
	long[] cnt;

	private class P implements Comparable<P>{
		int x,y;
		public P(int y,int x){
			this.x = x;
			this.y = y;
		}

		public int compareTo(P p){
			if(this.x == p.x && this.y == p.y)return 0;

			if(this.y < p.y)return -1;
			if(this.y > p.y)return 1;

			if(this.x < p.x)return -1;
			else return 1;
		}
	}

	public void solve() {
		H = nextInt();
		W = nextInt();
		N = nextInt();

		color = new TreeSet<P>();
		point = new TreeSet<P>();

		a = new int[N];
		b = new int[N];
		cnt = new long[10];
		cnt[0] = (long)(H - 2)* (W - 2);
		for(int k = 0;k < N;k++){
			a[k] = nextInt() - 1;
			b[k] = nextInt() - 1;

			color.add(new P(a[k],b[k]));

			for (int i = -2; i <= 0; i++) {
				for (int j = -2; j <= 0; j++) {
					if (a[k] + i >= 0 && b[k] + j >= 0 && a[k] + i + 3 <= H && b[k] + j + 3 <= W) {
						point.add(new P(a[k] + i, b[k] + j));
					}
				}
			}
		}

		for(P p : point){
			int c = 0;
			for(int i = 0;i < 3;i++){
				for(int j = 0;j < 3;j++){
					if(color.contains(new P(p.y + i,p.x + j))){
						c++;
					}
				}
			}
			cnt[c]++;
		}

		for(int i = 1;i <= 9;i++){
			cnt[0] -= cnt[i];
		}

		for(int i = 0;i < 10;i++){
			out.println(cnt[i]);
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