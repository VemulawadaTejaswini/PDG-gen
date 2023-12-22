import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int N=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int cost=0;
		for(int i=0; i<N-1; i++) {
			int tmpx=sc.nextInt();
			int tmpy=sc.nextInt();
			if(x<tmpx && y<tmpy) {//斜めが使える時
				int tmpcost=Math.max(tmpx-x, tmpy-y);
				cost+=tmpcost;
			}
			else if(x>tmpx && y>tmpy) {
				int tmpcost=Math.max(x-tmpx, y-tmpy);
				cost+=tmpcost;
			}
			else {
				cost+=Math.abs(tmpx-x)+Math.abs(tmpy-y);
			}
			x=tmpx;
			y=tmpy;
		}
		pl(cost);
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
