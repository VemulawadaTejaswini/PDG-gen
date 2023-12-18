import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

    final static boolean fileIO = false;
    final static boolean DEBUG = false;
    final static String input = "input.txt";
    final static String output = "output.txt";
    
    public static void main(String args[]) throws Exception {

		InputStream is = null;
		OutputStream os = null;
		if (fileIO) {
			is = new FileInputStream("input.txt");
			os = new FileOutputStream("output.txt");
		} else {
			is = System.in;
			os = System.out;
		}
		InputReader in = new InputReader(is);
		PrintWriter out = new PrintWriter(os);
		new Task().solve(in, out);
		out.close();	

	}
	
	static class Task {
		
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			Integer a[] = new Integer[n];
			for (int i = 0; i < n; ++i) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			int ans = 0;
			for (int i = 0; i < a.length; ) {
				int cur = a[i], j = i;
				while (j < n && a[j] == a[i]) {
					j += 1;
				}
				if (j - i < a[i]) {
					ans += j - i;
				} else if (j - i > a[i]) {
					ans += (j - i - a[i]);
				}
				i = j;
			}
			out.println(ans);
		}
	}

	static class InputReader {
	
		private StringTokenizer tokenizer;
		private BufferedReader reader;

		public InputReader(InputStream is) {
			tokenizer = null;
			reader = new BufferedReader(new InputStreamReader(is), 32768);
		}

		public String nextString(String delim) {
			String ans = null;
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line != null) {
						tokenizer = new StringTokenizer(line, delim);
						ans = tokenizer.nextToken();
					} else {
						ans = null;
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			} else {
				ans = tokenizer.nextToken();
			}
			return ans;
		}
	
		public Integer nextInt() {
			return Integer.parseInt(nextString(" "));		
		}
	}
}
