import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		Deque<Integer> tmp=new ArrayDeque<Integer>();
		String s=sc.next();
		int counter=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='1') {
				if(tmp.size()>0) {
					if(tmp.peek()==0) {
						tmp.remove();
						counter++;
					}
					else {
						tmp.push(1);
					}
				}
				else {
					tmp.push(1);
				}
			}
			else if(s.charAt(i)=='0') {
				if(tmp.size()>0) {
					if(tmp.peek()==1) {
						tmp.remove();
						counter++;
					}
					else {
						tmp.push(0);
					}
				}
				else {
					tmp.push(0);
				}
			}
		}
		pl(counter*2);
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