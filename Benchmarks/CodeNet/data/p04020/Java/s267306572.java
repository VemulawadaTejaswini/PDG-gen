import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[] mai=new long[N];
		long[] syori=new long[N];
		long[] kisu=new long[N];
		long ans=0;
		for(int i=0; i<N; i++) {
			mai[i]=sc.nextLong();
			if(mai[i]>0) {
				kisu[i]=mai[i]%2;
				if(kisu[i]==1) {
					syori[i]=mai[i]-1;
				}
				if(kisu[i]==0) {
					kisu[i]=2;
					syori[i]=mai[i]-2;
				}
			}
		}

		for(int i=0; i<N; i++) {
			ans+=syori[i]/2;
		}
		for(int i=0; i<N; i++) {
			if(kisu[i]>0) {
				if(kisu[i]>0 && i-1>0 && kisu[i-1]>0) {
					ans++;
					kisu[i]--;
					kisu[i-1]--;
				}
				if(kisu[i]>0 && i+1<N && kisu[i+1]>0) {
					ans++;
					kisu[i]--;
					kisu[i+1]--;
				}
			}
		}
		for(int i=0; i<N; i++) {
			ans+=kisu[i]/2;
		}
		pl(ans);
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
