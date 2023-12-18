

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	/*static int gcd(int a, int b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b % a, a); 
	}
	static int GCD(int a, int b, int c) {
		return gcd(a , gcd(b , c));
	}*/
	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		int n = sc.nextInt();
		String s = sc.nextLine();
		long count = 0;
		for(int i = 0; i < n - 2; i++) {
			char c1 = s.charAt(i);
			for(int j = i + 1; j < n; j++) {
				char c2 = s.charAt(j);
				if(c1 == c2)
					continue;
				else {
					int diff = j - i;
					for(int k = j + 1; k < n; k++) {
						char c3 = s.charAt(k);
						if(c3 == c2 || c3 == c1 || diff == k - j)
							continue;
						else
							count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}

	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
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