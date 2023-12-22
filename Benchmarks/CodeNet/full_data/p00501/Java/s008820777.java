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
		int ans=0;
		String genpon=sc.next();
		String[] base=new String[N];
		boolean[] kaz=new boolean[N];
		for(int i=0; i<N; i++) {
			base[i]=sc.next();
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<base[i].length(); j++) {
				for(int k=1; k<=base[i].length(); k++) {
					int tmp=j;
					sb=new StringBuilder();
					while(tmp<base[i].length()) {
						sb.append(base[i].charAt(tmp));
						tmp+=k;
						if((sb.toString()).equals(genpon)) {
							//pl(sb.toString());
							kaz[i]=true;
							break;
						}
					}
				}
			}
		}
		for(int i=0; i<N; i++) {
			if(kaz[i]) {
				ans++;
			}
		}
		pl(ans);
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
