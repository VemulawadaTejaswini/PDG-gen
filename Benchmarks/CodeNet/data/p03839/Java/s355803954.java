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
		int K=sc.nextInt();
		long[] score=new long[N];
		long[] su=new  long[N+1];
		for(int i=0; i<N; i++) {
			score[i]=sc.nextLong();
		}
		long[] hosei=new long[N];
		for(int i=0; i<N; i++) {
			hosei[i]=Math.max(0, score[i]);
		}
		long[] ruisekiwa=new long[N+1];
		Arrays.fill(ruisekiwa, 0);
		Arrays.fill(su,0);
		for(int i=1; i<=N; i++) {
			ruisekiwa[i]=hosei[i-1];
			su[i]=score[i-1];
		}
		for(int i=1; i<=N; i++) {
			ruisekiwa[i]=ruisekiwa[i-1]+ruisekiwa[i];
			su[i]=su[i-1]+su[i];
		}
		long max=0;
		for(int i=0; i<=N-K; i++) {
			long tmp=su[i+K]-su[i];
			if(i==0) {
				tmp+=ruisekiwa[N]-ruisekiwa[N-K];
			}
			else if(i==N-K) {
				tmp+=ruisekiwa[N-K];
			}
			else {
				tmp+=ruisekiwa[N]-ruisekiwa[i+K];
				tmp+=ruisekiwa[i];
			}
			long tmp2=0;
			if(i==0) {
				tmp+=ruisekiwa[N]-ruisekiwa[N-K];
			}
			else if(i==N-K) {
				tmp+=ruisekiwa[N-K];
			}
			else {
				tmp+=ruisekiwa[N]-ruisekiwa[i+K];
				tmp+=ruisekiwa[i];
			}
			max=Math.max(Math.max(tmp, tmp2), max);
		}
		pl(max);
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