import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int x = in.nextInt();
		
		int d = 0, res = 0;
		for (int i=0; i<n; i++) {
			int l = in.nextInt();
			d += l;
			if (d <= x)
				++res;
		}
		System.out.println(res+1);
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
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
