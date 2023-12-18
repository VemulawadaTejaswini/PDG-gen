import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		String str = in.next();
		
		String res = "";
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'B') {
				if (res.length() != 0)
					res = res.substring(0, res.length()-1);
			}
			else
				res += str.charAt(i);
		}
		System.out.println(res);
	}

	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
	}
}