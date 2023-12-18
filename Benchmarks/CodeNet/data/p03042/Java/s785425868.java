import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		String s=sc.next();
		int sento=Integer.parseInt(s.substring(0, 2));
		int usiro=Integer.parseInt(s.substring(2, 4));
		//pl(sento+" "+usiro);
		if(sento==0){
			//YYMMのとき
			if(usiro>0 &&usiro<=12) {
				pl("YYMM");
			}
			else {
				pl("NA");
			}
		}
		else if(sento>0 && sento<=12) {
			if(usiro>0 && usiro<=12) {
				pl("AMBIGUOUS");
			}
			else {
				pl("MMYY");
			}
		}
		else {
			if(usiro>0 &&  usiro<=12) {
				pl("YYMM");
			}
			else {
				pl("NA");
			}
		}
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