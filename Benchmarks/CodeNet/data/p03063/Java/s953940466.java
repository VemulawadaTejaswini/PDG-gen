import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int[] kuro=new int[N+2];
		int[] siro=new int[N+2];
		String isi=sc.next();
		Arrays.fill(kuro, 0);
		Arrays.fill(siro, 0);
		for(int i=0; i<N; i++) {
			if(isi.charAt(i)=='.') {
				siro[i+1]++;
			}
			else {
				kuro[i+1]++;
			}
		}
		for(int i=1; i<=N; i++) {
			kuro[i]=kuro[i-1]+kuro[i];
			siro[i]=siro[i-1]+siro[i];
		}
		kuro[N+1]=kuro[N];
		siro[N+1]=siro[N];
		int min=1_000_000_007;
		for(int i=1; i<=N; i++) {
			min=Math.min(min, kuro[i]+siro[N+1]-siro[i]);
		}
		min=Math.min(min, kuro[N+1]);
		min=Math.min(min, siro[N+1]);
		pl(min);
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