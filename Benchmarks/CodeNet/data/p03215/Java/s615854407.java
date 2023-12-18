import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] NUM=new long[N];
		for(int i=0; i<N; i++) {
			NUM[i]=NUM[Math.max(i-1, 0)]+sc.nextLong();
		}
		ArrayList<Long> split=new ArrayList<Long>();
		for(int i=0; i<N; i++) {
			split.add(NUM[i]);
			for(int j=0; j<N; j++) {
				if(i>j) {
					split.add(NUM[i]-NUM[j]);
				}
			}
		}
		long max=0L;
		long[] ary=new long[64];
		ary[0]=1;
		for(int i=1; i<64; i++) {
			ary[i]=ary[i-1]*2;
		}
		int counter=0;
		long tmp=0;
		for(int h=63; h>=0; h--) {
			tmp=max+ary[h];
			counter=0;
			for(int i=0; i<split.size(); i++) {
				if((split.get(i)&tmp)==tmp) {
					counter++;
				}
			}
			if(counter>=K) {
				max+=ary[h];
			}
		}
		pl(max);
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
}