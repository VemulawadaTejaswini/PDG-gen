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
		int M=sc.nextInt();
		if(N<=M) {
			pl(N);		//燐寸が潤沢にあるときは、人が来るたびにつけて消せばいい
		}
		else {		//燐寸が少ない時は効率的にやらないといけない
			M--;	//開始時に着ける
			int[] hito=new int[N];
			int time=0;
			for(int i=0; i<N; i++) {
				hito[i]=sc.nextInt();
			}
			time=hito[N-1]+1-hito[0];
			int[] diff=new int[N-1];
			for(int i=0; i<N-1; i++) {
				diff[i]=hito[i+1]-hito[i];
			}
			Arrays.sort(diff);
			for(int i=0; i<M; i++) {
				time-=diff[N-2-i];
				time++;
			}
			pl(time);
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
