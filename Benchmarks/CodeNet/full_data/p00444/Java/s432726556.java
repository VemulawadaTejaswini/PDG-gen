import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main{
	static int[] sum=new int[10000];
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			int o2ri=1000-sc.nextInt();
			if(o2ri==1000) {
				System.exit(0);
			}
			int coin=0;
			coin+=o2ri/500;
			o2ri%=500;
			coin+=o2ri/100;
			o2ri%=100;
			coin+=o2ri/50;
			o2ri%=50;
			coin+=o2ri/10;
			o2ri%=10;
			coin+=o2ri/5;
			o2ri%=5;
			coin+=o2ri;
			pl(coin);
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
