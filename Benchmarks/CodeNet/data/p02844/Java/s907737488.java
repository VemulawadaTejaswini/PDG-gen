import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static boolean check(String str , int[] patt) {
		int pointer = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)-'0'==patt[pointer]) {
				pointer++;
			}
			if(pointer==3) {
				return true;
			}
		}
		return false;
	}
	
	public static void solve() {
		int n=s.nextInt();
		String str=s.next();
		int[] patt  =new int[3];
		int count = 0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k =0;k<=9;k++) {
					patt[0]=i;
					patt[1]=j;
					patt[2]=k;
					if(check(str,patt)) {
						count++;
					}
				}
			}
		}
		out.println(count);
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
