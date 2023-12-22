import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int[][] kumo=new int[H][W];
		for(int i=0; i<H; i++) {
			String s=sc.next();
			for(int j=0; j<W; j++) {
				if(s.charAt(j)=='.') {
					kumo[i][j]=0;
				}
				else {
					kumo[i][j]=1;
				}
			}
		}
		for(int i=0; i<H; i++) {
			StringBuilder sb=new StringBuilder();
			for(int j=0; j<W; j++) {
				int tmp=-1;
				for(int k=0; k<=j; k++) {
					if(kumo[i][j-k]==1) {
						if(j==W-1) {
							sb.append(k);
						}
						else {
							sb.append(k);
							sb.append(" ");
						}
						break;
					}
					else if(kumo[i][j-k]==0 && j-k==0) {
						if(j==W-1) {
							sb.append(-1);
						}
						else {
							sb.append(-1);
							sb.append(" ");
						}
					}
				}
			}
			pl(sb.toString());
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
