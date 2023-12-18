import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	static int free=0;
	static int[] cl=new int[8];
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		Arrays.fill(cl, 0);
		for(int i=0; i<N; i++) {
			int rate=sc.nextInt();
			if(rate>=3200) {
				free++;
			}
			else {
				cl[rate/400]++;
			}
		}
		int notjiyu=0;
		for(int i=0; i<8; i++) {
			if(cl[i]>0) {
				notjiyu++;
			}
		}
		if(notjiyu>0) {
			pl(notjiyu+" "+(notjiyu+free));
		}
		else if(notjiyu==0) {
			pl(1+" "+free);
		}

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
