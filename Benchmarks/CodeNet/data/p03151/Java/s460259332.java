
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[] a=new long[N];
		long[] b=new long[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextLong();
		}
		for(int i=0; i<N; i++) {
			b[i]=sc.nextLong();
		}
		long[] diff=new long[N];
		long sumdiff=0;
		long sup=0;
		long kaz=0;
		for(int i=0; i<N; i++) {
			if(a[i]>=b[i]) {
				sup+=a[i]-b[i];
			}
			else {
				sumdiff+=b[i]-a[i];
				kaz++;
			}
			diff[i]=a[i]-b[i];
		}
		if(sumdiff>sup) {
			pl(-1);
		}
		else if(sumdiff==0) {
			pl(0);
		}
		else {
			Arrays.sort(diff);
			for(int i=N-1; i>=0; i--) {
				sumdiff-=diff[i];
				if(sumdiff<=0) {
					pl(kaz+(N-i));
					System.exit(0);
				}
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