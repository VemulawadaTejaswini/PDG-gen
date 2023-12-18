import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[] As=new long[N];
		long[] Bs=new long[N];
		int[] jyunjyo=new int[N];
		for(int i=0; i<N; i++) {
			As[i]=((long)(i+1))*40010;
			Bs[i]=((long)(N-i))*40010;
		}
		for(int i=0; i<N; i++) {
			jyunjyo[i]=sc.nextInt()-1;
		}
		for(int i=0; i<N; i++) {
			As[jyunjyo[i]]+=N-i;
			Bs[jyunjyo[i]]+=N-i;
		}
		for(int i=0; i<N-1; i++) {
			p(As[i]+" ");
		}
		pl(As[N-1]);
		for(int i=0; i<N-1; i++) {
			p(Bs[i]+" ");
		}
		pl(Bs[N-1]);
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
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}