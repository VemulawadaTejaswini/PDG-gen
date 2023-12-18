import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	static class Pair {
		public int x, y, id;
		public Pair() {
			x = y = 0;
		}
		public Pair(int x, int y, int i) {
			this.x = x;
			this.y = y;
			id = i;
		}
	}
	
	public static void main(String[] args) throws IOException {

		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			if(x%2==0) {
				if((x%3!=0)&&(x%5!=0)) {
					out.print("DENIED");
					out.flush();
					return;
				}
			}
		}
		out.print("APPROVED");
		out.flush();

	}

	static class InputReader {
		StreamTokenizer tokenizer;

		public InputReader(InputStream stream) {
			tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(stream)));
			tokenizer.ordinaryChars(33, 126);
			tokenizer.wordChars(33, 126);
		}

		public String next() throws IOException {
			tokenizer.nextToken();
			return tokenizer.sval;
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean hasNext() throws IOException {
			int res = tokenizer.nextToken();
			tokenizer.pushBack();
			return res != StreamTokenizer.TT_EOF;
		}
	}

}
