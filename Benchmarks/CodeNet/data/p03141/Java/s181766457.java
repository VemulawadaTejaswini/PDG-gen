import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static long[][] ryori;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		ryori=new long[N][3];
		long a,t;
		for(int i=0; i<N; i++) {
			t=sc.nextLong();
			a=sc.nextLong();
			ryori[i][0]=t+a;
			ryori[i][1]=t;
			ryori[i][2]=a;
		}
		long tkhs=0;
		long aoki=0;
		for(int i=0; i<N; i++) {
			if(i%2==0) {
				tkhs+=ryori[N-1-i][1];
			}
			else {
				aoki+=ryori[N-i-i][2];
			}
		}
		pl(tkhs-aoki);
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
	static void q(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				tmp1=d[l][2]; tmp2=d[r][2]; d[l][2]=tmp2; d[r][2]=tmp1;
				l++; r--;
			}
		}
		q(d, left, r);
		q(d, l, right);
	}
}