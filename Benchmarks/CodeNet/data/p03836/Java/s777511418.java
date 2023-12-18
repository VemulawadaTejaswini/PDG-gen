import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int sx = in.nextInt();
			int sy = in.nextInt();
			int tx = in.nextInt();
			int ty = in.nextInt();
			int h = ty - sy;
			int w = tx - sx;
			String str = "";
			for(int i = 1; i <= 8; i++) {
				if(i == 1 || i == 5) {
					str = "U";
				}else if(i == 2 || i == 6) {
					str = "R";
				}else if(i == 3 || i== 7) {
					str = "D";
				}else {
					str = "L";
				}
				int tmp = 0;
				switch(i) {
				case 1:
				case 3:
					tmp = h;
					break;
				case 2:
				case 6:
					tmp = w + 1;
					break;
				case 8:
					tmp = w;
					break;
				case 4:
					tmp = w + 2;
					break;
				case 5:
					tmp = h + 1;
					break;
				case 7:
					tmp = h + 2;
					break;
				}
				for(int j = 0; j < tmp; j++) {
					out.print(str);
				}
			}
			out.println("U");
		}
	}
	
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
