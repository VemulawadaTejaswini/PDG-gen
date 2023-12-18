import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int N,K;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		long[] bunbo=new long[N+1];
		Arrays.fill(bunbo,0);

		for(int i=1; i<=N; i++) {
			if(i>=K) {
				bunbo[i]=((long)N);
			}
			else {
				bunbo[i]=kettei(i);
			}
		}
		long bunsi=0;
		for(int i=1; i<=N; i++) {
			bunsi+=bunbo[1]/bunbo[i];
		}
		pl(((double) bunsi)/((double) bunbo[1]));
	}
	static long kettei(int ten) {
		int kaisu=0;
		while(ten<K) {
			ten*=2;
			kaisu++;
		}
		long ans=1;
		for(int i=0; i<kaisu; i++) {
			ans*=2L;
		}
		ans*=((long)N);
		return ans;
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

