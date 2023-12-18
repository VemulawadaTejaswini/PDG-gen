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
		int N=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int yokomin=1;
		int yokomax=W;
		String t=sc.next();
		String a=sc.next();
		if(t.charAt(N-1)=='R') {
			yokomax--;
		}
		else if(t.charAt(N-1)=='L') {
			yokomin++;
		}
		if(yokomax<yokomin) {
			pl("NO");
			System.exit(0);
		}
		for(int i=N-2; i>=0; i--) {
			if(t.charAt(i)=='R' && a.charAt(i)=='L') {
				//
			}
			else if(t.charAt(i)=='L' && a.charAt(i)=='R') {
				//
			}
			else if(t.charAt(i)=='R') {
				yokomax--;
			}
			else if(t.charAt(i)=='L') {
				yokomin++;
			}
			if(yokomax<yokomin) {
				pl("NO");
				System.exit(0);
			}
		}
		if(!(yokomin<=x && x<=yokomax)) {
			pl("NO");
			System.exit(0);
		}

		int tatemin=1;
		int tatemax=H;
		if(t.charAt(N-1)=='D') {
			tatemax--;
		}
		else if(t.charAt(N-1)=='U') {
			tatemin++;
		}
		if(yokomax<yokomin) {
			pl("NO");
			System.exit(0);
		}
		for(int i=N-2; i>=0; i--) {
			if(t.charAt(i)=='U' && a.charAt(i)=='D') {
				//
			}
			else if(t.charAt(i)=='D' && a.charAt(i)=='U') {
				//
			}
			else if(t.charAt(i)=='U') {
				tatemin++;
			}
			else if(t.charAt(i)=='D') {
				tatemax--;
			}
			if(tatemax<tatemin) {
				pl("NO");
				System.exit(0);
			}
		}
		if(!(tatemin<=y && y<=tatemax)) {
			pl("NO");
			System.exit(0);
		}
		pl("YES");
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
	public static void p(Object o) {
		System.out.print(o);
	}
}
