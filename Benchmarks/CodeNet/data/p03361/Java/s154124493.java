import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int h = fr.nextInt();
		int w = fr.nextInt();
		String[] str = new String[h];
		for (int i=0; i<h; i++) {
			str[i] = fr.nextLine();
		}
		boolean res = true;
		for (int i=0; i<h && res; i++) {
			for (int j=0; j<w && res; j++) {
				if (str[i].charAt(j) == '#') {
					res &= ((i>0 && str[i-1].charAt(j) == '#') 
							|| (j > 0 && str[i].charAt(j-1) == '#') 
							|| (i < h-1 && str[i+1].charAt(j) == '#')
							|| (j <w-1 && str[i].charAt(j+1) == '#'));
				}
			}
		}
		System.out.println(res ? "Yes" : "No");
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
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

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
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
