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
		int syurui=(N+1)/2;
		int[] kosu=new int[syurui];
		if(N%2==0) {
			for(int i=0; i<N; i++) {
				kosu[sc.nextInt()/2]++;
			}
		}

		else if(N%2==1) {
			for(int i=0; i<N; i++) {
				kosu[(sc.nextInt()-1)/2]++;
			}
		}

		for(int i=0; i<N; i++) {
			if(N%2==0) {
				if(kosu[i]!=2) {
					System.out.println("0");
					System.exit(0);
				}
			}
			else {
				if(i>0) {
					if(kosu[i]!=2) {
						System.out.println("0");
						System.exit(0);
					}
				}
			}
		}
		long a=1;
		for(int i=0; i<N/2; i++) {
			a*=2;
			a%=1000000007;
		}
		System.out.println(a);

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
}