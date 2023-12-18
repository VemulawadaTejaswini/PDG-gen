import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc=new SC(System.in);

		int W=sc.nextInt();
		for(long i=0; i<W-1; i++) {
			pl((i+1)*(W-1-i));
			pl(2 * i - W + 1);
		}
		int H=sc.nextInt();
		long sum=0;
		long MOD=1000000007;
		long[] X=new long[W];
		long[] Y=new long[H];
		for(int i=0; i<W; i++) {
			X[i]=sc.nextLong();
		}
		for(int i=0; i<H; i++) {
			Y[i]=sc.nextLong();
		}
		long xsum=0;
		long ysum=0;
		for(int i=0; i<W; i++) {
			xsum+=(2*i-1-W)*X[i];
			xsum%=MOD;
		}
		for(int i=0; i<H; i++) {
			xsum+=(2*i-1-H)*Y[i];
			xsum%=MOD;
		}
		pl((xsum*ysum)%MOD);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
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
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
