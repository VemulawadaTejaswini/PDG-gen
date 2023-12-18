import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = os.nextInt();
		String s = os.next();
		
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char se = s.charAt(i);
			int a = 0;
			while(a++ < n) {
				se++;
				if (!Pattern.matches("^[A-Z]+$", String.valueOf(se))) se = 'A';
			}
			str += String.valueOf(se);
		}
		pw.println(str);
		pw.close();
	}
	
	static class OriginScanner {
		private BufferedReader br;
		private StringTokenizer st;
		
		public OriginScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = null;
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			return str;
		}
		String next() {
			if (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(nextLine());
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
