

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		long a = sc.nextLong();
		double b = sc.nextDouble();
		
		BigDecimal x = new BigDecimal(Double.toString(b));
		x = x.multiply(new BigDecimal(Long.toString(a)));
		
		String res = x.toString();
		//System.out.println(res);
		StringBuilder temp = new StringBuilder("");
		
		for(int i = 0; i < res.length(); i++) {
			
			if(res.charAt(i) == '.')
				break;
			temp.append(res.charAt(i));
		}
		
		pr.println(temp);
		pr.close();
	}

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
