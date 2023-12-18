import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		
		char s[] = sc.next().toCharArray();
		
		for (int i = 0; i < s.length; i++) {
			s[i]+=n;
			if(s[i]>'Z') {
				s[i]-=26;
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
