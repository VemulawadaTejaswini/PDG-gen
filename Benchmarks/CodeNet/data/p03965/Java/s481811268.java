import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		String s=sc.next();
		int N=s.length();
		int g=0;
		int p=0;
		int win=0;
		int lose=0;
		for(int i=0; i<N; i++) {
			if(i==0) {
				if(s.charAt(0)=='p') {
					lose++;
					g++;
				}
				else if(s.charAt(0)=='g') {
					g++;
				}
			}
			else {
				if(s.charAt(i)=='p') {
					if(p<g) {
						p++;
					}
					else if(p==g) {
						g++;
						lose++;
					}
				}
				else if(s.charAt(i)=='g') {
					if(p<g) {
						p++;
						win++;
					}
					else if(p==g) {
						g++;
					}
				}
			}
		}
		pl(win-lose);
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