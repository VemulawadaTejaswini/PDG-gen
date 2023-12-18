import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int l = in.nextInt();
		int r = in.nextInt();
		if (r - l > 2019) {
			System.out.println(0);
		}
		else {
			int min1 = 2020, min2 = 2020;
			for (int i=l; i<=r; i++) {
				int next = i%2019;
				if (next <= min1) {
					min2 = min1;
					min1 = next;
				}
				else if (next < min2)
					min2 = next;
			}
			System.out.println(min1*min2);
		}
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
	}
}