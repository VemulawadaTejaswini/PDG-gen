import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	static int sum=0;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		long A=sc.nextLong();
		long N=sc.nextLong();
		long M=sc.nextLong();
		long max=0;
		while(pw(max+A+1,N)<=M) {
			max++;
		}
		for(long i=A; i<=A+max; i++) {
			long zan=i-A;
			long ma=ketawa(pw(i,N));
			if(zan==ma && zan>0) {
				sum++;
			}
		}
		pl(sum);
	}
	static long ketawa(long a) {
		long sum=0;
		while(a>0) {
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
	static long pw(long base,long p) {
		long ans=1;
		for(long i=0; i<p; i++) {
			ans*=base;
		}
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
